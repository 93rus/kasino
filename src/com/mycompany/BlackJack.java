package com.mycompany;

import java.util.Random;

public class BlackJack extends Credits implements RunGames {


    @Override
    public void playGame() {
        int[] koloda = new int[11];
        int resultUser1 = new Random().nextInt(koloda.length);
        int resultUser2 = new Random().nextInt(koloda.length);
        int summUser = resultUser1 + resultUser2;
        System.out.println("Вам выпало "
                + resultUser1 + " " + resultUser2 +
                " в сумме " + summUser);

        int resultDiler1 = new Random().nextInt(koloda.length);
        int resultDiler2 = new Random().nextInt(koloda.length);
        int summDiler = resultDiler1 + resultDiler2;
        System.out.println("Дилеру выпало "
                + resultDiler1 + " " + resultDiler2 +
                " в сумме: " + summDiler);
        if (summDiler < summUser) {

            System.out.println("Вы выишрали " + stavka + ". Ваш баланс " + kush);
            System.out.println("Желаете продолжить? 1.Да; 2. Нет;");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    playGame();
                    break;
                case 2:
                    break;
            }
        } else if (summDiler == summUser) {
            System.out.println("Ничья");
            System.out.println("У Вас на счете: " + coin);
            System.out.println("Желаете продолжить? 1.Да; 2. Нет;");
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
                System.out.println("Извините Ваш баланс отрицательный.");
            } else {
                System.out.println("Вы проиграли " + stavka + ". Ваш баланс " + minus);
                System.out.println("Желаете продолжить? 1.Да; 2. Нет;");
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
        System.out.println("Какую суммы вносите?");
        coin = sc.nextInt();
        System.out.println("Какую ставку выбираем?");
        stavka = sc.nextInt();
        System.out.println("Игра началась:");

        playGame();
        System.out.println("У вас осталось " + coin);
    }
}