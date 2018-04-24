package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Mastery {

    private final int typeID;

    private final int masteryLevel;

    private final int certID;

    @JsonCreator
    public Mastery(
            @JsonProperty("typeID") int typeID,
            @JsonProperty("masteryLevel") int masteryLevel,
            @JsonProperty("certID") int certID) {
        this.typeID = typeID;
        this.masteryLevel = masteryLevel;
        this.certID = certID;
    }

    public int getTypeID() {
        return typeID;
    }

    public int getMasteryLevel() {
        return masteryLevel;
    }

    public int getCertID() {
        return certID;
    }

    @Override
    public String toString() {
        return "Mastery{" +
                "typeID=" + typeID +
                ", masteryLevel=" + masteryLevel +
                ", certID=" + certID +
                '}';
    }

}
