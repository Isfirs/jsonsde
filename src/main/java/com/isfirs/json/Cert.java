package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cert {

    private final int certID;

    private final String description;

    private final int groupID;

    private final String name;

    @JsonCreator
    public Cert(
            @JsonProperty("certID") int certID,
            @JsonProperty("description") String description,
            @JsonProperty("groupID") int groupID,
            @JsonProperty("name") String name) {
        this.certID = certID;
        this.description = description;
        this.groupID = groupID;
        this.name = name;
    }

    public int getCertID() {
        return certID;
    }

    public String getDescription() {
        return description;
    }

    public int getGroupID() {
        return groupID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cert{" +
                "certID=" + certID +
                ", description='" + description + '\'' +
                ", groupID=" + groupID +
                ", name='" + name + '\'' +
                '}';
    }

}
