package jocoque.players.repository;

import jocoque.players.repository.localfile.model.League;
import jocoque.players.repository.localfile.model.Player;

import java.util.List;
import java.util.Map;

public interface BasketballPlayerRepository {
    Map<League, List<Player>> findAll();

    Map<League, List<Player>> findByName(String firstName, String lastName);
}
