package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

@ToString
public class ResearchAgent {

    private final int agentID;

    private final int typeID;

    @JsonCreator
    public ResearchAgent(@JsonProperty("agentID") final int agentID,
                         @JsonProperty("typeID") final int typeID) {
        this.agentID = agentID;
        this.typeID = typeID;
    }

    public int getAgentID() {
        return agentID;
    }

    public int getTypeID() {
        return typeID;
    }

    @Override
    public String toString() {
        return "ResearchAgent{" +
                "agentID=" + agentID +
                ", typeID=" + typeID +
                '}';
    }

}
