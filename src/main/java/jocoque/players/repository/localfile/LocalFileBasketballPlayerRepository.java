package jocoque.players.repository.localfile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.ByteStreams;
import jocoque.players.repository.BasketballPlayerRepository;
import jocoque.players.repository.localfile.model.League;
import jocoque.players.repository.localfile.model.Leagues;
import jocoque.players.repository.localfile.model.Player;
import jocoque.players.repository.localfile.model.Players;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class LocalFileBasketballPlayerRepository implements BasketballPlayerRepository {


    private final Map<League, List<Player>> players;

    public LocalFileBasketballPlayerRepository() throws IOException {
        ObjectMapper mapper = new ObjectMapper()
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule());

        InputStream stream = LocalFileBasketballPlayerRepository.class.getResourceAsStream("/nba-players-2018.json");
        Players ps = mapper.readValue(ByteStreams.toByteArray(stream), Players.class);
        Leagues leagues = ps.getLeagues();

        players = ImmutableMap.of(
                League.AFRICA, leagues.getAfrica(),
                League.SACRAMENTO, leagues.getSacramento(),
                League.STANDARD, leagues.getStandard(),
                League.UTAH, leagues.getUtah(),
                League.VEGAS, leagues.getVegas()
        );
    }

    @Override
    public Map<League, List<Player>> findAll() {
        return players;
    }

    @Override
    public Map<League, List<Player>> findByName(String firstName, String lastName) {
        return players.entrySet().stream()
                .collect(toMap(
                        Map.Entry::getKey,
                        e -> e.getValue().stream()
                                .filter(p -> firstName.equalsIgnoreCase(p.getFirstName()) && lastName.equalsIgnoreCase(p.getLastName()))
                                .collect(toList())
                ))
                .entrySet().stream()
                .filter(e -> !e.getValue().isEmpty())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue))
                ;
    }
}
