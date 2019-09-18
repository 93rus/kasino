package com.mycompany;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bandit bandit = new Bandit();
        BlackJack blackJack = new BlackJack();
        System.out.println("Добро пожаловать в Казино!");
        System.out.println("Выберите игру цифрами");
        System.out.println("1. Однорукий бандит");
        System.out.println("2. Black Jack");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                bandit.runGame();
                break;
            case 2:
                blackJack.runGame();
                break;
        }

    }
}


