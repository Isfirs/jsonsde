package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Faction {

    private final int factionID;

    private final String factionName;

    private final String description;

    private final int faceIDs;

    private final int solarSystemID;

    private final int corporationID;

    private final int sizeFactor;

    private final int stationCount;

    private final int stationSystemCount;

    private final int militiaCorporationID;

    private final int iconID;

    @JsonCreator
    public Faction(@JsonProperty("factionID") final int factionID,
                   @JsonProperty("factionName") final String factionName,
                   @JsonProperty("description") final String description,
                   @JsonProperty("faceIDs") final int faceIDs,
                   @JsonProperty("solarSystemID") final int solarSystemID,
                   @JsonProperty("corporationID") final int corporationID,
                   @JsonProperty("sizeFactor") final int sizeFactor,
                   @JsonProperty("stationCount") final int stationCount,
                   @JsonProperty("stationSystemCount") final int stationSystemCount,
                   @JsonProperty("militiaCorporationID") final int militiaCorporationID,
                   @JsonProperty("iconID") final int iconID) {
        this.factionID = factionID;
        this.factionName = factionName;
        this.description = description;
        this.faceIDs = faceIDs;
        this.solarSystemID = solarSystemID;
        this.corporationID = corporationID;
        this.sizeFactor = sizeFactor;
        this.stationCount = stationCount;
        this.stationSystemCount = stationSystemCount;
        this.militiaCorporationID = militiaCorporationID;
        this.iconID = iconID;
    }
}
