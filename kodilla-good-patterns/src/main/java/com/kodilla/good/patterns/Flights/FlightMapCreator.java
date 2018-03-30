package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.HashSet;

public class FlightMapCreator {
    public HashSet<Flight> mapCreator (){

        HashSet<Flight> flyMap = new HashSet<>();
       flyMap.add(new Flight("Krakow","Stavanger"));
       flyMap.add(new Flight("Krakow","Gdansk"));
       flyMap.add(new Flight("Krakow","Katowice"));
       flyMap.add(new Flight("Krakow","Oslo"));
       flyMap.add(new Flight("Stavanger","Krakow"));
       flyMap.add(new Flight("Stavanger","Gdansk"));
       flyMap.add(new Flight("Stavanger","Bergen"));
       flyMap.add(new Flight("Stavanger","Katowice"));
       flyMap.add(new Flight("Katowice","Krakow"));
       flyMap.add(new Flight("Katowice","Stavanger"));
       flyMap.add(new Flight("Katowice","Oslo"));
     return flyMap;
    }
}
