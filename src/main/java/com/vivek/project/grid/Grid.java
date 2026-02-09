package com.vivek.project.grid;

import java.util.List;

public class Grid {
    private final List<Row> rows = List.of(
            new Row("One", "1"),
            new Row("Two", "2"),
            new Row("Three", "3"),
            new Row("Four", "4"),
            new Row("Five", "5"),
            new Row("Six", "6"),
            new Row("Three of A kind", "***"),
            new Row("Four of A kind", "****"),
            new Row("Two of a kind + Three of a kind", "**###"),
            new Row("Sequence", "@#$%^"),
            new Row("All same", "*****")
    );
}
