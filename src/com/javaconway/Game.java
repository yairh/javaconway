package com.javaconway;

import java.util.Scanner;

public class Game {

    public int getHeight() {
        Scanner heightScan = new Scanner(System.in);
        System.out.println("Enter Grid Height: ");
        return heightScan.nextInt();
    }

    public int getWidth() {
        Scanner widthScan = new Scanner(System.in);
        System.out.println("Enter Grid Width: ");
        return widthScan.nextInt();
    }

    public int getNumGeneration() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Generation: ");
        return scan.nextInt();
    }

    public static void main(String[] arg) {
        System.out.println("Starting Game");
        Game game = new Game();
        int height = game.getHeight();
        int width = game.getWidth();
        int numGen = game.getNumGeneration();
        Grid grid = new Grid(width, height);

        for (int gen = 0; gen < numGen; gen++) {
            grid.display();
            grid.scanGrid();
            System.out.println("---------------------------------------------------------------------------------");
        }
        System.out.println("Game Over");

    }


}
