package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Mastery {

    private final int typeID;

    private final int masteryLevel;

    private final int certID;

    @JsonCreator
    public Mastery(
            @JsonProperty("typeID") final int typeID,
            @JsonProperty("masteryLevel") final int masteryLevel,
            @JsonProperty("certID") final int certID) {
        this.typeID = typeID;
        this.masteryLevel = masteryLevel;
        this.certID = certID;
    }

}
