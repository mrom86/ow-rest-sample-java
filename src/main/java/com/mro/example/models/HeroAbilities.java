package com.mro.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeroAbilities {

    private long id;
    private String name;

    private List<AbilityDetail> abilities;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AbilityDetail> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<AbilityDetail> abilities) {
        this.abilities = abilities;
    }
}
