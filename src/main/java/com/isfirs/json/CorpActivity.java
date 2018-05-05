package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CorpActivity {

    private final int activityID;

    private final String activityName;

    private final String description;

    @JsonCreator
    public CorpActivity(
            @JsonProperty("activityID") final int activityID,
            @JsonProperty("activityName") final String activityName,
            @JsonProperty("description") final String description) {
        this.activityID = activityID;
        this.activityName = activityName;
        this.description = description;
    }

}
