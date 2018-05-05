package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Schematic {

    private final int schematicID;

    private final String schematicName;

    private final int cycleTime;

    @JsonCreator
    public Schematic(
        @JsonProperty("schematicID") final int schematicID,
        @JsonProperty("schematicName") final String schematicName,
        @JsonProperty("cycleTime") final int cycleTime) {
            this.schematicID = schematicID;
            this.schematicName = schematicName;
            this.cycleTime = cycleTime;
    }

}
