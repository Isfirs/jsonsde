package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Ancestry {

    private final int ancestryID;

    private final String ancestryName;

    private final int bloodlineID;

    private final String description;

    private final int perception;
    private final int willpower;
    private final int charisma;
    private final int memory;
    private final int intelligence;

    private final int iconID;

    private final String shortDescription;

    @JsonCreator
    public Ancestry(
            @JsonProperty("ancestryID") final int ancestryID,
            @JsonProperty("ancestryName") final String ancestryName,
            @JsonProperty("bloodlineID") final int bloodlineID,
            @JsonProperty("description") final String description,
            @JsonProperty("perception") final int perception,
            @JsonProperty("willpower") final int willpower,
            @JsonProperty("charisma") final int charisma,
            @JsonProperty("memory") final int memory,
            @JsonProperty("intelligence") final int intelligence,
            @JsonProperty("iconID") final int iconID,
            @JsonProperty("shortDescription") final String shortDescription) {
        this.ancestryID = ancestryID;
        this.ancestryName = ancestryName;
        this.bloodlineID = bloodlineID;
        this.description = description;
        this.perception = perception;
        this.willpower = willpower;
        this.charisma = charisma;
        this.memory = memory;
        this.intelligence = intelligence;
        this.iconID = iconID;
        this.shortDescription = shortDescription;
    }

}
