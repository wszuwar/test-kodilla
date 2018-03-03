package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {

    private final List<Continent> wordList = new ArrayList<>();

    public void addContinent(Continent continent){
        wordList.add(continent);
    }

    public final List<Continent> getWordList() {
        return wordList;
    }

    public BigDecimal getPeopleQuantity(){
        return wordList.stream()
                .flatMap(continent -> continent.getContinentList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum , current) -> sum.add(current));



    }
}
