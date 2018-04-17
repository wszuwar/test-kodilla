package com.kodilla.rps;

import java.util.Random;

public class Computer {
    private Random random ;

    public Computer (){
        random = new Random();
    }

    public PlayersChoice getchoice(){
        int choice = 1 + random.nextInt(5);
        switch (choice){
            case 1:
                return PlayersChoice.PAPER;
            case 2:
                return  PlayersChoice.ROCK;
            case 3 :
                return PlayersChoice.SCISSORS;
            case 4:
                return PlayersChoice.LIZARD;

        }
        return PlayersChoice.SPOOK;
    }
}
