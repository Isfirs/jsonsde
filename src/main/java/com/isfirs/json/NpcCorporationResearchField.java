package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class NpcCorporationResearchField {

    private final int skillID;

    private final int corporationID;

    @JsonCreator
    public NpcCorporationResearchField(
            @JsonProperty("skillID") final int skillID,
            @JsonProperty("corporationID") final int corporationID) {
        this.skillID = skillID;
        this.corporationID = corporationID;
    }

}
