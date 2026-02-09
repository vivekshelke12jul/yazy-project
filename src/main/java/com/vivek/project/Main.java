package com.vivek.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Yazy");
        System.out.println("Enter Player1 name: ");
        String player1 = sc.nextLine();
        System.out.println("Enter Player2 name: ");
        String player2 = sc.nextLine();

        Local2PlayerGame game = new Local2PlayerGame(player1, player2);
        game.play();
    }
}