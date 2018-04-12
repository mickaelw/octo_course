package com.octocourse.app;

class GameMaster {

    Boolean verifyVictory(Grid grid) {
        Integer currentRow = 0;
        Integer currentColumn = 0;
        Integer prevValueBox = 0;
        Boolean hasWinner = false;

        for (Integer[] row : grid.getStatus()) {
            for (Integer boxValue : row) {
                if (currentColumn == 0 || boxValue.equals(0))
                    prevValueBox = boxValue;
                else {
                    if (prevValueBox.equals(boxValue)) {
                        hasWinner = true;
                        break;
                    }
                }
                currentColumn++;
            }
            currentColumn = 0;
        }

        return hasWinner;
    }

}
