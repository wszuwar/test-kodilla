package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightMapCreator {
    public HashMap<String,ArrayList<String>> mapCreator (){
        ArrayList<String> arivalsFromStavanger = new ArrayList<>();
        arivalsFromStavanger.add("Krakow");
        arivalsFromStavanger.add("Oslo");
        arivalsFromStavanger.add("Gdansk");
        arivalsFromStavanger.add("Katowice");

        ArrayList<String> arivalsFromKrakow = new ArrayList<>();
        arivalsFromKrakow.add("Stavanger");
        arivalsFromKrakow.add("Oslo");
        arivalsFromKrakow.add("Gdansk");
        arivalsFromKrakow.add("katowice");

        ArrayList<String> arivalsFromGdansk =  new ArrayList<>();
        arivalsFromGdansk.add("Oslo");
        arivalsFromGdansk.add("Krakow");
        arivalsFromGdansk.add("katowice");

        HashMap<String,ArrayList<String>> flyMap = new HashMap<>();
        flyMap.put("Stavanger",arivalsFromStavanger);
        flyMap.put("Krakow",arivalsFromKrakow);
        flyMap.put("Gdansk",arivalsFromGdansk);

        return flyMap;
    }
}
