package com.octocourse.app.rover;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class Rover {

    private Position position = new Position(0, 0);
    private RoverMove roverMove = new RoverMoveFromEst();
    private Map<RoverCommand, Supplier> availableCommands = new HashMap<>();

    Rover() {
        availableCommands.put(RoverCommand.forward, forwardOneBox());
        availableCommands.put(RoverCommand.backward, backwardOneBox());
        availableCommands.put(RoverCommand.turnLeft, turnOnTheLeft());
        availableCommands.put(RoverCommand.turnRight, turnOnTheRight());
    }

    String position() {
        return position.toString();
    }

    void move(String commands) {
        for (String command : splitCommands(commands))
            availableCommands.get(RoverCommand.convertToRoverCommand(command)).get();
    }

    private String[] splitCommands(String commands) {
        return commands.split("");
    }

    private Supplier turnOnTheRight() {
        return () -> roverMove = roverMove.turnRight();
    }

    private Supplier turnOnTheLeft() {
        return () -> roverMove = roverMove.turnLeft();
    }

    private Supplier forwardOneBox() {
        return () -> position = roverMove.forward(position);
    }

    private Supplier backwardOneBox() {
        return () -> position = roverMove.backward(position);
    }

}
