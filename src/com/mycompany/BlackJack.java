package com.mycompany;

import java.util.Random;

public class BlackJack extends Credits implements RunGames {


    @Override
    public void playGame() {
        int[] cardDeck = new int[11];
        int resultUser1 = new Random().nextInt(cardDeck.length);
        int resultUser2 = new Random().nextInt(cardDeck.length);
        int amountUser = resultUser1 + resultUser2;
        System.out.println("Your cards "
                + resultUser1 + " " + resultUser2 +
                " Amount: " + amountUser);

        int resultCroupier1 = new Random().nextInt(cardDeck.length);
        int resultCroupier2 = new Random().nextInt(cardDeck.length);
        int amountCroupier = resultCroupier1 + resultCroupier2;
        System.out.println("Croupier cars "
                + resultCroupier1 + " " + resultCroupier2 +
                " Amount: " + amountCroupier);
        if (amountCroupier < amountUser) {


            System.out.println("You winner: " + stavka + " Balance: " + kush);
            System.out.println("Do you want continue? 1.Yes; 2. No;");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    playGame();
                    break;
                case 2:
                    break;
            }
        } else if (amountCroupier == amountUser) {
            System.out.println("Draw");
            System.out.println("Your balance: " + coin);
            System.out.println("Do you want continue? 1.Yes; 2. No;");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    playGame();
                    break;
                case 2:
                    break;
            }
        } else {

            if (coin <= 0) {
                System.out.println("Sorry, You balance is negative.");
            } else {
                System.out.println("You loss " + stavka + " Balance " + minus);
                System.out.println("Do you want continue? 1.Yes; 2. No;");
                select = sc.nextInt();
                switch (select) {
                    case 1:
                        playGame();
                        break;
                    case 2:
                        break;
                }
            }
        }



    }

    @Override
    public void runGame() {
        System.out.println("How much do you deposit?");
        coin = sc.nextInt();
        System.out.println("Which bid do you choose?");
        stavka = sc.nextInt();
        System.out.println("The game started:");

        playGame();
        System.out.println("Your balance " + coin);
    }
}