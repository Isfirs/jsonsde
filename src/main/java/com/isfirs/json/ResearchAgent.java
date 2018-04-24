package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResearchAgent {

    private int agentID;

    private int typeID;

    @JsonCreator
    public ResearchAgent(@JsonProperty("agentID") int agentID, @JsonProperty("typeID") int typeID) {
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
