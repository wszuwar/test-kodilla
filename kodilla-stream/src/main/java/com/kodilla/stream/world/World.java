package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {

    private List<Continent> wordList = new ArrayList<>();

    public void addContinent(Continent continent){
        wordList.add(continent);
    }

    public List<Continent> getWordList() {
        return wordList;
    }

    public BigDecimal getPeopleQuantity(){
        return wordList.stream()
                .flatMap(continent -> continent.getContinentList().stream()
                .)

    }
}
