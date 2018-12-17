package jocoque.players.repository.localfile.model;

/**
 * Created by JacksonGenerator on 12/17/18.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Player {
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("teams")
    private List<TeamsItem> teams;
    @JsonProperty("weightPounds")
    private String weightPounds;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("dateOfBirthUTC")
    private String dateOfBirthUTC;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("collegeName")
    private String collegeName;
    @JsonProperty("yearsPro")
    private String yearsPro;
    @JsonProperty("heightMeters")
    private String heightMeters;
    @JsonProperty("pos")
    private String pos;
    @JsonProperty("jersey")
    private String jersey;
    @JsonProperty("heightInches")
    private String heightInches;
    @JsonProperty("teamId")
    private String teamId;
    @JsonProperty("draft")
    private Draft draft;
    @JsonProperty("personId")
    private String personId;
    @JsonProperty("weightKilograms")
    private String weightKilograms;
    @JsonProperty("heightFeet")
    private String heightFeet;
    @JsonProperty("lastAffiliation")
    private String lastAffiliation;
    @JsonProperty("nbaDebutYear")
    private String nbaDebutYear;
}