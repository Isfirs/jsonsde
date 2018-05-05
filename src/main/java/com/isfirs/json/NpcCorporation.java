package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class NpcCorporation {

    private final int corporationID;

    private final char size;

    private final char extent;

    private final int solarSystemID;

    private final int investorID1;
    private final int investorShares1;
    private final int investorID2;
    private final int investorShares2;
    private final int investorID3;
    private final int investorShares3;
    private final int investorID4;
    private final int investorShares4;

    private final int friendID;

    private final int enemyID;

    private final int publicShares;

    private final int initialPrice;

    private final int minSecurity;

    // Int?
    private final int scattered;

    private final int fringe;

    private final int corridor;

    private final int hub;

    private final int border;

    private final int factionID;

    private final float sizeFactor;

    private final int stationCount;

    private final int stationSystemCount;

    private final String description;

    private final int iconID;

    @JsonCreator
    public NpcCorporation(@JsonProperty("corporationID") final int corporationID,
                          @JsonProperty("size") final char size,
                          @JsonProperty("extent") final char extent,
                          @JsonProperty("solarSystemID") final int solarSystemID,
                          @JsonProperty("investorID1") final int investorID1,
                          @JsonProperty("investorShares1") final int investorShares1,
                          @JsonProperty("investorID2") final int investorID2,
                          @JsonProperty("investorShares2") final int investorShares2,
                          @JsonProperty("investorID3") final int investorID3,
                          @JsonProperty("investorShares3") final int investorShares3,
                          @JsonProperty("investorID4") final int investorID4,
                          @JsonProperty("investorShares4") final int investorShares4,
                          @JsonProperty("friendID") final int friendID,
                          @JsonProperty("enemyID") final int enemyID,
                          @JsonProperty("publicShares") final int publicShares,
                          @JsonProperty("initialPrice") final int initialPrice,
                          @JsonProperty("minSecurity") final int minSecurity,
                          @JsonProperty("scattered") final int scattered,
                          @JsonProperty("fringe") final int fringe,
                          @JsonProperty("corridor") final int corridor,
                          @JsonProperty("hub") final int hub,
                          @JsonProperty("border") final int border,
                          @JsonProperty("factionID") final int factionID,
                          @JsonProperty("sizeFactor") final float sizeFactor,
                          @JsonProperty("stationCount") final int stationCount,
                          @JsonProperty("stationSystemCount") final int stationSystemCount,
                          @JsonProperty("description") final String description,
                          @JsonProperty("iconID") final int iconID) {
        this.corporationID = corporationID;
        this.size = size;
        this.extent = extent;
        this.solarSystemID = solarSystemID;
        this.investorID1 = investorID1;
        this.investorShares1 = investorShares1;
        this.investorID2 = investorID2;
        this.investorShares2 = investorShares2;
        this.investorID3 = investorID3;
        this.investorShares3 = investorShares3;
        this.investorID4 = investorID4;
        this.investorShares4 = investorShares4;
        this.friendID = friendID;
        this.enemyID = enemyID;
        this.publicShares = publicShares;
        this.initialPrice = initialPrice;
        this.minSecurity = minSecurity;
        this.scattered = scattered;
        this.fringe = fringe;
        this.corridor = corridor;
        this.hub = hub;
        this.border = border;
        this.factionID = factionID;
        this.sizeFactor = sizeFactor;
        this.stationCount = stationCount;
        this.stationSystemCount = stationSystemCount;
        this.description = description;
        this.iconID = iconID;
    }
}
