package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Race {

    private final int raceID;

    private final String description;

    private final int iconID;

    private final String shortDescription;

    @JsonCreator
    public Race(
            @JsonProperty("raceID") final int raceID,
            @JsonProperty("description") final String description,
            @JsonProperty("iconID") final int iconID,
            @JsonProperty("shortDescription") final String shortDescription) {
        this.raceID = raceID;
        this.description = description;
        this.iconID = iconID;
        this.shortDescription = shortDescription;
    }
}
