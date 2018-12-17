package jocoque.players.repository.localfile;

import jocoque.players.repository.BasketballPlayerRepository;
import jocoque.players.repository.localfile.model.League;
import jocoque.players.repository.localfile.model.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


class LocalFileBasketballPlayerRepositoryTest {
    BasketballPlayerRepository repository;

    @BeforeEach
    public void init() throws IOException {
        repository = new LocalFileBasketballPlayerRepository();
    }


    @Test
    public void summary() {
        Map<League, List<Player>> leagues = repository.findAll();

        assertThat(leagues.get(League.STANDARD)).hasSize(498);
        assertThat(leagues.get(League.UTAH)).hasSize(63);
        assertThat(leagues.get(League.SACRAMENTO)).hasSize(60);
        assertThat(leagues.get(League.AFRICA)).hasSize(21);
        assertThat(leagues.get(League.VEGAS)).hasSize(453);

    }

    @Test
    public void findByName() {
        Map<League, List<Player>> player = repository.findByName("LeBron", "James");

        assertThat(player).containsOnlyKeys(League.STANDARD);
        assertThat(player.get(League.STANDARD)).hasSize(1);
        assertThat(player.get(League.STANDARD).get(0).getFirstName()).isEqualTo("LeBron");
        assertThat(player.get(League.STANDARD).get(0).getLastName()).isEqualTo("James");
    }

}