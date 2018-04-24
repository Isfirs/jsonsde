package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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
            @JsonProperty("bloodlineID") int bloodlineID,
            @JsonProperty("bloodlineName") String bloodlineName,
            @JsonProperty("raceID") int raceID,
            @JsonProperty("description") String description,
            @JsonProperty("maleDescription") String maleDescription,
            @JsonProperty("femaleDescription") String femaleDescription,
            @JsonProperty("shipTypeID") int shipTypeID,
            @JsonProperty("corporationID") int corporationID,
            @JsonProperty("perception") int perception,
            @JsonProperty("willpower") int willpower,
            @JsonProperty("charisma") int charisma,
            @JsonProperty("memory") int memory,
            @JsonProperty("intelligence") int intelligence,
            @JsonProperty("iconID") int iconID,
            @JsonProperty("shortDescription") String shortDescription,
            @JsonProperty("shortMaleDescription") String shortMaleDescription,
            @JsonProperty("shortFemaleDescription") String shortFemaleDescription) {
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

    public int getBloodlineID() {
        return bloodlineID;
    }

    public String getBloodlineName() {
        return bloodlineName;
    }

    public int getRaceID() {
        return raceID;
    }

    public String getDescription() {
        return description;
    }

    public String getMaleDescription() {
        return maleDescription;
    }

    public String getFemaleDescription() {
        return femaleDescription;
    }

    public int getShipTypeID() {
        return shipTypeID;
    }

    public int getCorporationID() {
        return corporationID;
    }

    public int getPerception() {
        return perception;
    }

    public int getWillpower() {
        return willpower;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getMemory() {
        return memory;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getIconID() {
        return iconID;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getShortMaleDescription() {
        return shortMaleDescription;
    }

    public String getShortFemaleDescription() {
        return shortFemaleDescription;
    }

    @Override
    public String toString() {
        return "Bloodline{" +
                "bloodlineID=" + bloodlineID +
                ", bloodlineName='" + bloodlineName + '\'' +
                ", raceID=" + raceID +
                ", description='" + description + '\'' +
                ", maleDescription='" + maleDescription + '\'' +
                ", femaleDescription='" + femaleDescription + '\'' +
                ", shipTypeID=" + shipTypeID +
                ", corporationID=" + corporationID +
                ", perception=" + perception +
                ", willpower=" + willpower +
                ", charisma=" + charisma +
                ", memory=" + memory +
                ", intelligence=" + intelligence +
                ", iconID=" + iconID +
                ", shortDescription='" + shortDescription + '\'' +
                ", shortMaleDescription='" + shortMaleDescription + '\'' +
                ", shortFemaleDescription='" + shortFemaleDescription + '\'' +
                '}';
    }
}
