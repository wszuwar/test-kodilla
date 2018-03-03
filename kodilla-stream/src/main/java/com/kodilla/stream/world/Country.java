package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final long peopleQuantity;

    public Country(final String countryName, final long peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryName);
    }
public long getPeopleQuantity(){
        return peopleQuantity;
}

public BigDecimal getPeopleQuantytyyy(){
        BigDecimal ammountOfppl = new BigDecimal(peopleQuantity);
        return ammountOfppl;
}

}
