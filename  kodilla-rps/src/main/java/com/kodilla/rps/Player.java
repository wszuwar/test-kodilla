package com.kodilla.rps;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Player{
    Scanner input;

    public Player() {
        input = new Scanner(System.in);

    }

    public PlayersChoice getChoice() {



        String command = input.nextLine();
        switch (command) {
            case "1":
                return PlayersChoice.PAPER;
            case "2":
                return PlayersChoice.ROCK;
            case "3":
                return  PlayersChoice.SCISSORS;
            case "4":
                return PlayersChoice.LIZARD;
            case  "5":
                return  PlayersChoice.SPOOK;


        }
        System.out.println("This command doesnt exist try again");
        return getChoice();

    }

}