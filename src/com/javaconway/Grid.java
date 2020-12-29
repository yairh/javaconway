package com.javaconway;

public class Grid {
    int gridWidth;
    int gridHeight;

    public Grid(int width, int height) {
        gridWidth = width;
        gridHeight = height;
    }

    public void display() {
        for (int i = 1; i <= gridHeight; i++) {
            for (int j = 1; j <= gridWidth; j++) {
                System.out.print(" * ");

            }
            System.out.println("\n");
        }
    }


    public static void main(String[] arg) {
        Grid grid = new Grid(10, 10);
        grid.display();


    }


}
