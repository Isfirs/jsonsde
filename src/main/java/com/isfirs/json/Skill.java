package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Skill {

    private final int certID;

    private final int skillID;

    private final int certLevelInt;

    private final int skillLevel;

    private final String certLevelText;

    @JsonCreator
    public Skill(
            @JsonProperty("certID") final int certID,
            @JsonProperty("skillID") final int skillID,
            @JsonProperty("certLevelInt") final int certLevelInt,
            @JsonProperty("skillLevel") final int skillLevel,
            @JsonProperty("certLevelText") final String certLevelText) {
        this.certID = certID;
        this.skillID = skillID;
        this.certLevelInt = certLevelInt;
        this.skillLevel = skillLevel;
        this.certLevelText = certLevelText;
    }

}
