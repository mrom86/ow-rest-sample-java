package com.mro.example.models;

import java.util.Collection;

public class AbilityOverview {

    private int total;
    private Collection<AbilityDetail> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Collection<AbilityDetail> getData() {
        return data;
    }

    public void setData(Collection<AbilityDetail> data) {
        this.data = data;
    }
}
