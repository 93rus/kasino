package com.mycompany;

import java.util.Random;


public class Bandit extends Credits implements RunGames {


    @Override
    public void playGame() {
        int[] headDram = new int[5];
        int dram1 = new Random().nextInt(headDram.length);
        int dram2 = new Random().nextInt(headDram.length);
        int dram3 = new Random().nextInt(headDram.length);

        System.out.println("" +
                "First Dram: " + dram1 + " " +
                "Second Dram: " + dram2 + " " +
                "Third Dram: " + dram3);
        if (dram1 == dram2 && dram1 == dram3) {

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
        } else {

            if (coin <= 0) {
                System.out.println("Sorry, You balance is negative.");
            } else {

                System.out.println("You loss " + stavka + " Balance " + minus);
                System.out.println("Do you want continue? 1.Yes; 2. No;");
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
        System.out.println("Какую суммы вносите?");
        coin = sc.nextInt();
        System.out.println("Какую ставку выбираем?");
        stavka = sc.nextInt();
        System.out.println("Игра началась:");

        playGame();
        System.out.println("У вас осталось " + coin);
    }
}


