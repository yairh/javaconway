package com.javaconway;

public class Grid {
    int gridWidth;
    int gridHeight;
    Cell[][] gridCells;


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

    public void scanGrid() {
        for (int i = 0; i < gridHeight; i++) {
            for (int j = 0; j < gridWidth; j++) {
                scanCell(i, j);
            }
        }
    }

    public void scanCell(int i, int j) {
        Cell cell = gridCells[i][j];
        int aliveNeighbors = getNeighbours(i, j);
        if (cell.isAlive & aliveNeighbors > 3) {
            cell.isAlive = false;
        } else if (cell.isAlive & aliveNeighbors < 2) {
            cell.isAlive = false;
        } else if (!cell.isAlive & aliveNeighbors == 3) {
            cell.isAlive = true;

        }

    }

    public int getNeighbours(int i, int j) {
        int alive = 0;
        if (gridCells[i + 1][j].isAlive) {
            alive++;
        }
        if (gridCells[i - 1][j].isAlive) {
            alive++;
        }
        if (gridCells[i + 1][j + 1].isAlive) {
            alive++;
        }
        if (gridCells[i - 1][j + 1].isAlive) {
            alive++;
        }
        if (gridCells[i - 1][j - 1].isAlive) {
            alive++;
        }
        if (gridCells[i][j - 1].isAlive) {
            alive++;
        }

        if (gridCells[i][j + 1].isAlive) {
            alive++;
        }

        if (gridCells[i + 1][j - 1].isAlive) {
            alive++;
        }

        return alive;

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
