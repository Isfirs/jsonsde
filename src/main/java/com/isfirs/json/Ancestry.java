package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

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
            @JsonProperty("ancestryID") int ancestryID,
            @JsonProperty("ancestryName") String ancestryName,
            @JsonProperty("bloodlineID") int bloodlineID,
            @JsonProperty("description") String description,
            @JsonProperty("perception") int perception,
            @JsonProperty("willpower") int willpower,
            @JsonProperty("charisma") int charisma,
            @JsonProperty("memory") int memory,
            @JsonProperty("intelligence") int intelligence,
            @JsonProperty("iconID") int iconID,
            @JsonProperty("shortDescription") String shortDescription) {
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

    public int getAncestryID() {
        return ancestryID;
    }

    public String getAncestryName() {
        return ancestryName;
    }

    public int getBloodlineID() {
        return bloodlineID;
    }

    public String getDescription() {
        return description;
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

    @Override
    public String toString() {
        return "Ancestry{" +
                "ancestryID=" + ancestryID +
                ", ancestryName='" + ancestryName + '\'' +
                ", bloodlineID=" + bloodlineID +
                ", description='" + description + '\'' +
                ", perception=" + perception +
                ", willpower=" + willpower +
                ", charisma=" + charisma +
                ", memory=" + memory +
                ", intelligence=" + intelligence +
                ", iconID=" + iconID +
                ", shortDescription='" + shortDescription + '\'' +
                '}';
    }

}
