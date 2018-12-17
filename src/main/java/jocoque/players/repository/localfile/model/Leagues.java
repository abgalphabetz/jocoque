package jocoque.players.repository.localfile.model;

/**
 * Created by JacksonGenerator on 12/17/18.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Leagues {
    @JsonProperty("standard")
    private List<Player> standard;
    @JsonProperty("utah")
    private List<Player> utah;
    @JsonProperty("sacramento")
    private List<Player> sacramento;
    @JsonProperty("africa")
    private List<Player> africa;
    @JsonProperty("vegas")
    private List<Player> vegas;
}