package jocoque.players.repository.localfile.model;

/**
 * Created by JacksonGenerator on 12/17/18.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class TeamsItem {
    @JsonProperty("seasonStart")
    private String seasonStart;
    @JsonProperty("seasonEnd")
    private String seasonEnd;
    @JsonProperty("teamId")
    private String teamId;
}