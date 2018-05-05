package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Attribute {

    private final int attributeID;

    private final String attributeName;

    private final String description;

    private final int iconID;

    private final String shortDescription;

    private final String notes;

    @JsonCreator
    public Attribute(
            @JsonProperty("attributeID") final int attributeID,
            @JsonProperty("attributeName") final String attributeName,
            @JsonProperty("description") final String description,
            @JsonProperty("iconID") final int iconID,
            @JsonProperty("shortDescription") final String shortDescription,
            @JsonProperty("notes") final String notes) {
        this.attributeID = attributeID;
        this.attributeName = attributeName;
        this.description = description;
        this.iconID = iconID;
        this.shortDescription = shortDescription;
        this.notes = notes;
    }
}
