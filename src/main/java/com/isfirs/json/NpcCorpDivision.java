package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class NpcCorpDivision {

    private final int corporationID;

    private final int divisionID;

    private final int size;

    @JsonCreator
    public NpcCorpDivision(
            @JsonProperty("corporationID") final int corporationID,
            @JsonProperty("divisionID") final int divisionID,
            @JsonProperty("size") final int size) {
        this.corporationID = corporationID;
        this.divisionID = divisionID;
        this.size = size;
    }
}
