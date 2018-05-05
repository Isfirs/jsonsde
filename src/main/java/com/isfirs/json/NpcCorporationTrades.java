package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class NpcCorporationTrades {

    private final int corporationID;

    private final int typeID;

    @JsonCreator
    public NpcCorporationTrades(
            @JsonProperty("corporationID") final int corporationID,
            @JsonProperty("typeID") final int typeID) {
        this.corporationID = corporationID;
        this.typeID = typeID;
    }

}
