package com.kodilla.rps;


import java.util.Scanner;

public class RpsRunner {
    private Player player;
    private Computer computer;
    private PlayersChoice playersChoice;
    private PlayersChoice computersChoice;
    private Result result;

    private Scanner scanner;

    public static void main(String[] args) {
        new RpsRunner();
    }


    public RpsRunner() {

        start();
    }

    boolean end = false;
    private int numberOfWInsPlayer = 0;
    private int numberOfWInsComputer = 0;
    private String winsToENd;


    private void start() {
        player = new Player();
        computer = new Computer();
        scanner = new Scanner(System.in);

        System.out.println("Welcome in my game!!");
        System.out.println("Enter number of games to win");
        winsToENd = scanner.nextLine();

        do {
            System.out.println("1 - to choose PAPER");
            System.out.println("2 - to choose ROCK");
            System.out.println("3 - to choose SCISSORS");
            System.out.println("4 - to choose LIZARD");
            System.out.println("5 - to choose SPOOK");

            System.out.println("Enter : ");
            playersChoice = player.getChoice();
            computersChoice = computer.getchoice();
            result = getResult();
            showResult();
            if (numberOfWInsComputer == Integer.parseInt(winsToENd) || numberOfWInsPlayer == Integer.parseInt(winsToENd)) {
                end = true;
                System.out.println("NUmber of your wins :" + numberOfWInsPlayer);
                System.out.println("Numbers of your losses :" + numberOfWInsComputer);
            }

            if (!end) {
                printSecondMenu();
                secondMenu();
            }

        } while (!end);
    }

    private void secondMenu() {
        char secondCommand = scanner.nextLine().toLowerCase().charAt(0);
        switch (secondCommand) {
            case 'n':
                start();

            case 'x':
                end = true;
                System.out.println("NUmber of your wins :" + numberOfWInsPlayer);
                System.out.println("Numbers of your losses :" + numberOfWInsComputer);

        }

    }

    private void printSecondMenu() {
        System.out.println(" Choose one of the options");
        System.out.println(" 'n' to restart game");
        System.out.println(" 'x' to end game");
        System.out.println("any other key to continue");
    }

    public Result getResult() {
        if (playersChoice.equals(computersChoice))
            return Result.TIE;
        switch (playersChoice) {
            case ROCK:
                return (computersChoice == PlayersChoice.SPOOK ? Result.LOSE : Result.WIN);
            case PAPER:
                return (computersChoice == PlayersChoice.LIZARD ? Result.LOSE : Result.WIN);
            case SCISSORS:
                return (computersChoice == PlayersChoice.SPOOK ? Result.LOSE : Result.WIN);
            case LIZARD:
                return (computersChoice == PlayersChoice.SCISSORS ? Result.LOSE : Result.WIN);
            case SPOOK:
                return (computersChoice == PlayersChoice.LIZARD || computersChoice == PlayersChoice.PAPER ? Result.LOSE : Result.WIN);

        }
        return Result.LOSE;
    }

    private void showResult() {
        switch (result) {
            case WIN:
                System.out.println(playersChoice + " Beats " + computersChoice + " Player wins");
                numberOfWInsPlayer++;
                break;
            case LOSE:
                System.out.println(playersChoice + " Lose " + computersChoice + " Computer wins");
                numberOfWInsComputer++;
            case TIE:
                System.out.println(playersChoice + " Is equal " + computersChoice + " Its a Tie");
        }
    }
}

