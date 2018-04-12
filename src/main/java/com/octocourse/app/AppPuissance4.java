package com.octocourse.app;

class AppPuissance4 {

    private Grid grid;

    AppPuissance4(Grid grid) {
        this.grid = grid;
    }

    String displayGrid() {
        StringBuilder displayedGrid = new StringBuilder();

        Integer[][] grid = this.grid.getStatus();
        for (Integer[] row : grid) {
            for (Integer column : row)
                convertNumberToValue(displayedGrid, column);
            displayedGrid.append("\n");
        }

        return displayedGrid.toString();
    }

    private void convertNumberToValue(StringBuilder displayedGrid, Integer column) {
        if (column == 0)
            displayedGrid.append(".");
        if (column == 1)
            displayedGrid.append("x");
        if (column == 2)
            displayedGrid.append("o");
    }

}
