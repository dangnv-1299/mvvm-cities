package com.dang_hust.mvvm_cities.model;

import com.dang_hust.mvvm_cities.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public final class CityDataProvider {
    private final ArrayList cities = new ArrayList();

    @NotNull
    public final ArrayList getCities() {
        return this.cities;
    }

    public CityDataProvider() {
        this.cities.add(new City("Bangkok", 700091, 10000000));
        this.cities.add(new City("Beijing", 700118, 21500000));
        this.cities.add(new City("London", 700075, 8900000));
        this.cities.add(new City("New York", 700054, 8400000));
        this.cities.add(new City("Paris", 700121, 2100000));
        this.cities.add(new City("Rio de Janeiro", 700012, 6700000));
        this.cities.add(new City("Rome", 700088, 2800000));
        this.cities.add(new City("Singapore", 700063, 5700000));
        this.cities.add(new City("Sydney", 700029, 5300000));
        this.cities.add(new City("Tokyo", 700137, 13900000));
    }
}