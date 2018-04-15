package com.octocourse.app.connect4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AppPuissance4Test {

    @Test
    void declareNoWinner() {
        Boolean hasWinner = false;
        GameMaster gameMaster = new GameMaster();

        Integer[][] emptyGrid = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        Grid stubGrid = mock(Grid.class);
        when(stubGrid.getStatus()).thenReturn(emptyGrid);

        assertEquals(hasWinner, gameMaster.verifyVictory(stubGrid));
    }

    @Test
    void declareAWinner() {
        Boolean hasWinnerWhenThereAre4SameConsecutiveTokensAtTheStartOfTheFirstRow = true;
        GameMaster gameMaster = new GameMaster();

        Integer[][] gridWith4SameConsecutiveTokensAtTheStartOfTheFirstRow = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0}
        };
        Grid stubGrid = mock(Grid.class);
        when(stubGrid.getStatus()).thenReturn(gridWith4SameConsecutiveTokensAtTheStartOfTheFirstRow);

        assertEquals(
                hasWinnerWhenThereAre4SameConsecutiveTokensAtTheStartOfTheFirstRow,
                gameMaster.verifyVictory(stubGrid)
        );
    }

    /*
    gamemaster:
- Should declare a player winner if he has 4 tokens in first column
- Should declare a player winner if he has 4 tokens in first row
- Should declare a player winner if he has 4 tokens in first column
     */


    /*

    @Test
        public void shouldDisplayTheEmptyGrid() {
            Integer[][] fakeGrid = createFakeGrid(0);

            String emptyGrid = ".......\n.......\n.......\n.......\n.......\n.......\n";
            PrintStream mockOut = mock(PrintStream.class);
            System.setOut(mockOut);

            appPuissance4.displayGrid();
            verify(mockOut).println(contains(emptyGrid));
        }

        @Test
        public void shouldDisplayAGridFullOfX() {
            Integer[][] fakeGrid = createFakeGrid(1);

            String completedGrid = "xxxxxxx\nxxxxxxx\nxxxxxxx\nxxxxxxx\nxxxxxxx\nxxxxxxx\n";
            when(grid.getStatus()).thenReturn(fakeGrid);

            assertEquals(completedGrid, appPuissance4.displayGrid());
        }

        @Test
        public void shouldDisplayAGridFullOfO() {
            Integer[][] fakeGrid = createFakeGrid(2);

            String completedGrid = "ooooooo\nooooooo\nooooooo\nooooooo\nooooooo\nooooooo\n";
            when(grid.getStatus()).thenReturn(fakeGrid);

            assertEquals(completedGrid, appPuissance4.displayGrid());
        }

        @Test
        public void shouldDisplayARandomGrid() {
            Integer[][] fakeGrid = createFakeGrid(0);
            fakeGrid[0][0] = 1;
            fakeGrid[1][0] = 2;
            fakeGrid[2][2] = 1;
            fakeGrid[5][5] = 1;

            String completedGrid = "x......\n
                                    o......\n
                                    ..x....\n
                                    .......\n
                                    .......\n
                                    .....x.\n";
            when(grid.getStatus()).thenReturn(fakeGrid);

            assertEquals(completedGrid, appPuissance4.displayGrid());
        }
    */
    private Integer[][] createFakeGrid(Integer defaultNumber) {
        Integer[][] fakeGrid = new Integer[6][7];
        for (int row = 0; row < 6; row++)
            for (int col = 0; col < 7; col++)
                fakeGrid[row][col] = defaultNumber;
        return fakeGrid;
    }

}

/*

......
......
......
......

Application
Tests list:
When start a new game
Should display the grid
Should display who can play
Should display the gamemaster's messages
Should stop when one player wins of the game



player
- play
Test list :
Should play a token in the first column of the grid
Should play a token in the second column of the grid
Should play a token in a column that already possess a token of the grid

grid
- get state
- add token
- display
Test list :
Should add a token in a column
Should add a token in a full column
Should reset grid

token
- form
Test list :
Should return its form

gamemaster
- initialize the game
- manage round
- winner
Test list :


 */
