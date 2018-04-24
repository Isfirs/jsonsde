package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AgentType {

    private int agentTypeID;

    private String agentType;

    @JsonCreator
    public AgentType(@JsonProperty("agentTypeID") int agentTypeID, @JsonProperty("agentType") String agentType) {
        this.agentTypeID = agentTypeID;
        this.agentType = agentType;
    }

    @Override
    public String toString() {
        return "AgentType{" +
                "agentTypeID=" + agentTypeID +
                ", agentType='" + agentType + '\'' +
                '}';
    }

}
