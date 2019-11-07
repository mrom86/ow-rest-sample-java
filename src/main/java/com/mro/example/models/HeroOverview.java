package com.mro.example.models;

import java.util.Collection;

public class HeroOverview {

    private int total;
    private Collection<HeroDetail> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Collection<HeroDetail> getData() {
        return data;
    }

    public void setData(Collection<HeroDetail> data) {
        this.data = data;
    }
}
