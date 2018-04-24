package com.isfirs.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Table {

    private final String name;

    private final String href;

    @JsonCreator
    public Table(@JsonProperty("name") String name, @JsonProperty("href") String href) {
        this.name = name;
        this.href = href;
    }

    public String getName() {
        return name;
    }

    public String getHref() {
        return href;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", href='" + href + '\'' +
                '}';
    }

}
