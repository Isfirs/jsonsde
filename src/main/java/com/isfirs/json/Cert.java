package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Cert {

    private final int certID;

    private final String description;

    private final int groupID;

    private final String name;

    @JsonCreator
    public Cert(
            @JsonProperty("certID") final int certID,
            @JsonProperty("description") final String description,
            @JsonProperty("groupID") final int groupID,
            @JsonProperty("name") final String name) {
        this.certID = certID;
        this.description = description;
        this.groupID = groupID;
        this.name = name;
    }

}
