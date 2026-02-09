package com.vivek.project.dice;

import java.util.List;

public class Dice {


    private final List<Die> dice;

    public Dice(int number) {
        this.dice = List.of(
                new Die(),
                new Die(),
                new Die(),
                new Die(),
                new Die()
        );
    }

    public void selectDie(int index){
        dice.get(index).selectDie();
    }

    public void roll() {
        dice.stream()
                .filter(die -> !die.isSelected())
                .forEach(Die::roll);
    }

    public List<Integer> getDiceValues(){
        return dice.stream().map(Die::getValue).toList();
    }

}