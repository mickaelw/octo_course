package com.octocourse.app.rover;

import com.octocourse.app.rover.Position;
import com.octocourse.app.rover.Rover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class roverTest {

    private Rover rover;

    @BeforeEach
    void setUp() {
        rover = new Rover();
    }

    @Test
    void setupTheRoverWithDefaultPosition() {
        Position initialPosition = new Position(0, 0);

        assertEquals(initialPosition.toString(), rover.position());
    }

    @Test
    void forwardTheRoverOfOneBox() {
        Position nextPosition = new Position(1, 0);

        rover.move("f");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void forwardTheRoverOfTwoBox() {
        Position nextPosition = new Position(2, 0);

        rover.move("ff");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void backwardTheRoverOfOneBox() {
        Position nextPosition = new Position(-1, 0);

        rover.move("b");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void backwardTheRoverOfTwoBox() {
        Position nextPosition = new Position(-2, 0);

        rover.move("bb");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void turnLeftTheRoverAndForwardOfOneBox() {
        Position nextPosition = new Position(0, 1);

        rover.move("lf");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void turnLeftTheRoverAndBackwardOfOneBox() {
        Position nextPosition = new Position(0, -1);

        rover.move("lb");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void turnRightTheRoverAndForwardOfOneBox() {
        Position nextPosition = new Position(0, -1);

        rover.move("rf");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void turnRightTheRoverAndBackwardOfOneBox() {
        Position nextPosition = new Position(0, 1);

        rover.move("rb");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void halfTurnTheRoverAndForwardOfOneBox() {
        Position nextPosition = new Position(-1, 0);

        rover.move("rrf");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void halfTurnTheRoverAndBackwardOfOneBox() {
        Position nextPosition = new Position(1, 0);

        rover.move("rrb");

        assertEquals(nextPosition.toString(), rover.position());
    }

    @Test
    void moveTheRover() {
        Position nextPosition = new Position(-1, 3);

        rover.move("rbbbfllffbrllf");

        assertEquals(nextPosition.toString(), rover.position());
    }

}
