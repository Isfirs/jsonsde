package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Skill {

    private final int certID;

    private final int skillID;

    private final int certLevelInt;

    private final int skillLevel;

    private final String certLevelText;

    @JsonCreator
    public Skill(
            @JsonProperty("certID") int certID,
            @JsonProperty("skillID") int skillID,
            @JsonProperty("certLevelInt") int certLevelInt,
            @JsonProperty("skillLevel") int skillLevel,
            @JsonProperty("certLevelText") String certLevelText) {
        this.certID = certID;
        this.skillID = skillID;
        this.certLevelInt = certLevelInt;
        this.skillLevel = skillLevel;
        this.certLevelText = certLevelText;
    }

    public int getCertID() {
        return certID;
    }

    public int getSkillID() {
        return skillID;
    }

    public int getCertLevelInt() {
        return certLevelInt;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public String getCertLevelText() {
        return certLevelText;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "certID=" + certID +
                ", skillID=" + skillID +
                ", certLevelInt=" + certLevelInt +
                ", skillLevel=" + skillLevel +
                ", certLevelText='" + certLevelText + '\'' +
                '}';
    }

}
