package com.nauka.Kamien_Papier_Nozyce_3;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Kamien_Papier_Nozyce_3_eng {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("=========================================");
            System.out.println("Welcome in game \"Rock, paper, scissors\".");
            System.out.println("=========================================");
            dontMove();

            printInstructions();
            System.out.println("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    gameVsComputer();
                    break;
                case 1:
                    gameForTwoPlayers();
                    break;
                case 2:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nMenu: ");
        System.out.println("\t0 - New game vs Computer");
        System.out.println("\t1 - New game for two players");
        System.out.println("\t2 - Exit");
    }

    public static void dontMove() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void gameVsComputer () {
        int resultDraw = 0;
        int resultUser = 0;
        int resultComputer = 0;
        System.out.println("\n");
        System.out.println("New game vs Computer!");
        dontMove();

        System.out.println("\n");
        System.out.println("How many wins will the game last? ");
        Scanner input = new Scanner(System.in);
        int finalResult = input.nextInt();

        while ((resultUser < finalResult) && (resultComputer < finalResult)) {
            System.out.println("\n");
            System.out.println("Choose: Rock (choose 1), Paper (choose 2), Scissors (choose 3) or return to the main menu (choose 4).");
            int choiseUser = input.nextInt();
            if (choiseUser == 1) {
                System.out.println("Rock");
            } else if (choiseUser == 2) {
                System.out.println("Paper");
            } else if (choiseUser == 3) {
                System.out.println("Scissors");
            } else if (choiseUser == 4){
                menu();
            }

            dontMove();
            Random random = new Random();
            int choiseComputer = random.nextInt(3) + 1;
            System.out.println("Computer choice: ");
            dontMove();
            if (choiseComputer == 1) {
                System.out.println("Rock");
            } else if (choiseComputer == 2) {
                System.out.println("Paper");
            } else if (choiseComputer == 3) {
                System.out.println("Scissors");
            }
            System.out.println("\n");
            System.out.println("=========================================");
            dontMove();
            System.out.println("\n");

            if (choiseUser - choiseComputer == 0) {
                resultDraw += 1;
                System.out.println("Draw. Try again");
                System.out.println("Result: " + "Draw = " + resultDraw + " Player score = " + resultUser + " Computer score = " + resultComputer);
            } else if (choiseUser - choiseComputer == -2) {
                resultUser += 1;
                System.out.println("You win! Congratulations!");
                System.out.println("Result: " + "Draw = " + resultDraw + " Player score = " + resultUser + " Computer score = " + resultComputer);
            } else if (choiseUser - choiseComputer == 1) {
                resultUser += 1;
                System.out.println("You win! Congratulations!");
                System.out.println("Result: " + "Draw = " + resultDraw + " Player score = " + resultUser + " Computer score = " + resultComputer);
            } else {
                resultComputer += 1;
                System.out.println("Unfortunately you lost! Maybe next time will be better!");
                System.out.println("Result: " + "Draw = " + resultDraw + " Player score = " + resultUser + " Computer score = " + resultComputer);
            }
            System.out.println("\n");
        }
        dontMove();
        System.out.println("Game over");
        dontMove();
        System.out.print("Please press enter to go to menu");
        scanner.nextLine();
        System.out.println("\n");
        menu();
    }
    public static void gameForTwoPlayers(){
        System.out.println("\n");
        System.out.println("New game for two players!");
        int resultDraw = 0;
        int resultFirstPlayer = 0;
        int resultSecondPlayer = 0;

        System.out.println("\n");
        System.out.println("Enter the name of the first player: ");
        Scanner input = new Scanner(System.in);
        String nameFirstPlayer = input.next();

        System.out.println("\n");
        System.out.println("Enter the name of the second player: ");
        String nameSecondPlayer = input.next();

        System.out.println("\n");
        System.out.println("How many wins will the game last? ");
        int finalResult = input.nextInt();

        while ((resultFirstPlayer < finalResult) && (resultSecondPlayer < finalResult)) {
            System.out.println("\n");
            System.out.println(nameFirstPlayer +" Choose: Rock (choose 1), Paper (choose 2), Scissors (choose 3) or return to the main menu (choose 4).");
            int choiseFirstPlayer = input.nextInt();
            if (choiseFirstPlayer == 1) {
                System.out.println("Rock");
            } else if (choiseFirstPlayer == 2) {
                System.out.println("Paper");
            } else if (choiseFirstPlayer == 3) {
                System.out.println("Scissors");
            } else if (choiseFirstPlayer == 4){
                menu();
            }
            System.out.println("\n");
            System.out.println(nameSecondPlayer +" Choose: Rock (choose 1), Paper (choose 2), Scissors (choose 3) or return to the main menu (choose 4).");
            int choiseSecondPlayer = input.nextInt();
            if (choiseSecondPlayer == 1) {
                System.out.println("Rock");
            } else if (choiseSecondPlayer == 2) {
                System.out.println("Paper");
            } else if (choiseSecondPlayer == 3) {
                System.out.println("Scissors");
            } else if (choiseSecondPlayer == 4){
                menu();
            }
            dontMove();
            System.out.println("\n");
            System.out.println("=========================================");
            System.out.println("\n");
            dontMove();
            if (choiseFirstPlayer - choiseSecondPlayer == 0) {
                resultDraw += 1;
                System.out.println("Draw. Try again");
                System.out.println("Result: " + " Draw = " + resultDraw + " " + nameFirstPlayer + "= " + resultFirstPlayer + " Wygrane " + nameSecondPlayer + " = " + resultSecondPlayer);
            } else if (choiseFirstPlayer - choiseSecondPlayer == -2) {
                resultFirstPlayer += 1;
                System.out.println(nameFirstPlayer + " You win! Congratulations!");
                System.out.println(nameSecondPlayer +" Unfortunately you lost! Maybe next time will be better!");
                System.out.println("Result: " + " Draw = " + resultDraw + " " + nameFirstPlayer + "'s" + " winnigs " + "= " + resultSecondPlayer + "" + nameSecondPlayer + "'s" + " winnigs " + "= " + resultSecondPlayer);
            } else if (choiseFirstPlayer - choiseSecondPlayer == 1) {
                resultFirstPlayer += 1;
                System.out.println(nameFirstPlayer + " You win! Congratulations!");
                System.out.println(nameSecondPlayer +" Unfortunately you lost! Maybe next time will be better!");
                System.out.println("Result: " + " Draw = " + resultDraw + " " + nameFirstPlayer + "'s" + " winnigs " + "= " + resultSecondPlayer + "" + nameSecondPlayer + "'s" + " winnigs " + "= " + resultSecondPlayer);
            } else {
                resultSecondPlayer += 1;
                System.out.println(nameSecondPlayer + " You win! Congratulations!");
                System.out.println(nameFirstPlayer + " Unfortunately you lost! Maybe next time will be better!");
                System.out.println("Result: " + " Draw = " + resultDraw + "" + nameFirstPlayer + "'s" + " winnigs " + "= " + resultSecondPlayer + "" + nameSecondPlayer + "'s" + " winnigs " + "= " + resultSecondPlayer);
            }
            System.out.println("\n");

        }
        System.out.println("Game over");
        System.out.print("Please press enter to go to menu");
        scanner.nextLine();
        System.out.println("\n");
        menu();
    }
}
