package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Table {

    private final String name;

    private final String href;

    @JsonCreator
    public Table(@JsonProperty("name") final String name,
                 @JsonProperty("href") final String href) {
        this.name = name;
        this.href = href;
    }

}
