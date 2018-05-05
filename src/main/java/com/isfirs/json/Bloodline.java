package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Bloodline {

    private final int bloodlineID;

    private final String bloodlineName;

    private final int raceID;

    private final String description;

    private final String maleDescription;

    private final String femaleDescription;

    private final int shipTypeID;

    private final int corporationID;

    private final int perception;
    private final int willpower;
    private final int charisma;
    private final int memory;
    private final int intelligence;

    private final int iconID;

    private final String shortDescription;
    private final String shortMaleDescription;
    private final String shortFemaleDescription;

    @JsonCreator
    public Bloodline(
            @JsonProperty("bloodlineID") final int bloodlineID,
            @JsonProperty("bloodlineName") final String bloodlineName,
            @JsonProperty("raceID") final int raceID,
            @JsonProperty("description") final String description,
            @JsonProperty("maleDescription") final String maleDescription,
            @JsonProperty("femaleDescription") final String femaleDescription,
            @JsonProperty("shipTypeID") final int shipTypeID,
            @JsonProperty("corporationID") final int corporationID,
            @JsonProperty("perception") final int perception,
            @JsonProperty("willpower") final int willpower,
            @JsonProperty("charisma") final int charisma,
            @JsonProperty("memory") final int memory,
            @JsonProperty("intelligence") final int intelligence,
            @JsonProperty("iconID") final int iconID,
            @JsonProperty("shortDescription") final String shortDescription,
            @JsonProperty("shortMaleDescription") final String shortMaleDescription,
            @JsonProperty("shortFemaleDescription") final String shortFemaleDescription) {
        this.bloodlineID = bloodlineID;
        this.bloodlineName = bloodlineName;
        this.raceID = raceID;
        this.description = description;
        this.maleDescription = maleDescription;
        this.femaleDescription = femaleDescription;
        this.shipTypeID = shipTypeID;
        this.corporationID = corporationID;
        this.perception = perception;
        this.willpower = willpower;
        this.charisma = charisma;
        this.memory = memory;
        this.intelligence = intelligence;
        this.iconID = iconID;
        this.shortDescription = shortDescription;
        this.shortMaleDescription = shortMaleDescription;
        this.shortFemaleDescription = shortFemaleDescription;
    }

}
