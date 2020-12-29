package com.javaconway;

import java.util.Random;

public class Cell {
    Random random = new Random();
    Boolean isAlive = random.nextBoolean();

    public static void main(String[] arg) {
        Cell cell = new Cell();
        System.out.println(cell.isAlive);
    }
}




