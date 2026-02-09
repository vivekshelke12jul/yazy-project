package com.vivek.project.dice;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private int value;
    private boolean selected = false;

    public int getValue() {
        if(this.value == 0){
            roll();
        }
        return value;
    }

    public boolean isSelected(){
        return selected;
    }

    public void selectDie(){
        this.selected = true;
    }

    public Die() {
        this.value = 0;
    }

    public void roll() {
        this.value = ThreadLocalRandom.current().nextInt(1, 7);
    }
}
