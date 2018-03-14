package com.kodilla.rps;


import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        new RpsRunner();
    }
    private int numberOfWIns;
    private Scanner scanner;

    public RpsRunner(){
        scanner = new Scanner(System.in);
        start();
    }
    boolean end = false;

    private void start() {
        System.out.println("Welcome in my game!!");
        String command;

        do {
            System.out.println("1 - to choose PAPER");
            System.out.println("2 - to choose ROCK");
            System.out.println("3 - to choose SCISSORS");
            System.out.println("4 - to choose LIZARD");
            System.out.println("5 - to choose SPOOK");

            System.out.println("Enter : ");
            command = scanner.nextLine();
            parseChoice(command);

        } while (!end);
    }

    private void parseChoice(String command) {
        switch (command){
            case "1":{
                end = true;

                break;
            }
        }
    }
    private void secondMenu(){
        System.out.println(" co chcesz zrobic teraz?");
        char secondCommand = scanner.nextLine().toLowerCase().charAt(0);
        switch (secondCommand){
            case 'n':

            case 'x':

            case 'c':
        }
    }
}

