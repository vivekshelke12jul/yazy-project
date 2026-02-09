package com.vivek.project.grid;

public class Row {
    private final String name;
    private final String symbol;
    private boolean frozen = false;
    private int value = 0;

    Row(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }
}
