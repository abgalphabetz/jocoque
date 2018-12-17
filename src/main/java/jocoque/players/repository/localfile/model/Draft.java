package jocoque.players.repository.localfile.model;

/**
 * Created by JacksonGenerator on 12/17/18.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Draft {
    @JsonProperty("roundNum")
    private String roundNum;
    @JsonProperty("teamId")
    private String teamId;
    @JsonProperty("pickNum")
    private String pickNum;
    @JsonProperty("seasonYear")
    private String seasonYear;
}