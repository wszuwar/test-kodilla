package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public final class Continent {

    private final List<Country> continentList = new ArrayList<>();

    public void addCountry(Country country){
        continentList.add(country);
    }

    public List<Country> getContinentList() {
        return continentList;
    }

}
