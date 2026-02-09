package com.vivek.project;

import com.vivek.project.dice.Dice;
import com.vivek.project.grid.Grid;

public class Local2PlayerGame {
    String player1;
    String player2;

    private final Grid player1grid = new Grid();
    private final Grid player2grid = new Grid();

    Local2PlayerGame(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        for(int i=0; i<11; i++){
            player1Play();
            player2Play();
        }
    }

    private void player1Play() {
        Dice dice = new Dice(5);
        dice.roll();
    }
    private void player2Play() {

    }

}
