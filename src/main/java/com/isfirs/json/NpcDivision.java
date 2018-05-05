package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class NpcDivision {

    private final int divisionID;

    private final String divisionName;

    private final String description;

    private final String leaderType;

    @JsonCreator
    public NpcDivision(
            @JsonProperty("divisionID") final int divisionID,
            @JsonProperty("divisionName") final String divisionName,
            @JsonProperty("description") final String description,
            @JsonProperty("leaderType") final String leaderType) {
        this.divisionID = divisionID;
        this.divisionName = divisionName;
        this.description = description;
        this.leaderType = leaderType;
    }
}
