package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AgentType {

    private final int agentTypeID;

    private final String agentType;

    @JsonCreator
    public AgentType(@JsonProperty("agentTypeID") final int agentTypeID,
                     @JsonProperty("agentType") final String agentType) {
        this.agentTypeID = agentTypeID;
        this.agentType = agentType;
    }

}
