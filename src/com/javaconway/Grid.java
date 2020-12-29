package com.javaconway;

public class Grid {
    int gridWidth;
    int gridHeight;
    Cell gridCells[][];


    public Grid(int width, int height) {
        gridWidth = width;
        gridHeight = height;
        makeGrid();
    }

    public void makeGrid() {
        gridCells = new Cell[gridHeight][gridWidth];
        for (int i = 0; i < gridHeight; i++) {
            for (int j = 0; j < gridWidth; j++) {
                gridCells[i][j] = new Cell();
            }
        }
    }

    public void checkGrid() {

    }

    public void checkCell() {

    }


    public void display() {
        for (int i = 0; i < gridHeight; i++) {
            for (int j = 0; j < gridWidth; j++) {
                if (gridCells[i][j].isAlive) {
                    System.out.print(" * ");

                } else {
                    System.out.print(" - ");

                }

            }
            System.out.println("\n");
        }
    }


    public static void main(String[] arg) {
        Grid grid = new Grid(20, 10);
        grid.display();


    }


}
