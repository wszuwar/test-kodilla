package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sause;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sause;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder Roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder Burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder Sause(String sause) {
            this.sause = sause;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build() {
            if (roll == null || burgers == 0 || sause == null) {
                throw new IllegalStateException("You forgot choose roll, burgers or sause !!!");
            } else {
                return new Bigmac(roll, burgers, sause, ingredients);
            }
        }
    }


    private Bigmac(final String roll, final int burgers, final String sause, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sause = sause;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSause() {
        return sause;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sause='" + sause + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
