package jocoque.players.repository.localfile.model;

/**
 * Created by JacksonGenerator on 12/17/18.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Players {
    @JsonProperty("league")
    private Leagues leagues;
    @JsonProperty("_internal")
    private Internal internal;
}