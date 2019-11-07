package com.mro.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityDetail {

    private int id;
    private String name;
    private String description;

    @JsonProperty("is_ultimate")
    private boolean ultimate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUltimate() {
        return ultimate;
    }

    public void setUltimate(boolean ultimate) {
        this.ultimate = ultimate;
    }
}
