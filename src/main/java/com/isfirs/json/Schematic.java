package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Schematic {

    private final int schematicID;

    private final String schematicName;

    private final int cycleTime;

    @JsonCreator
    public Schematic(
            @JsonProperty("schematicID") int schematicID,
            @JsonProperty("schematicName") String schematicName,
            @JsonProperty("cycleTime") int cycleTime) {
        this.schematicID = schematicID;
        this.schematicName = schematicName;
        this.cycleTime = cycleTime;
    }

    public int getSchematicID() {
        return schematicID;
    }

    public String getSchematicName() {
        return schematicName;
    }

    public int getCycleTime() {
        return cycleTime;
    }

    @Override
    public String toString() {
        return "Schematic{" +
                "schematicID=" + schematicID +
                ", schematicName='" + schematicName + '\'' +
                ", cycleTime=" + cycleTime +
                '}';
    }

}
