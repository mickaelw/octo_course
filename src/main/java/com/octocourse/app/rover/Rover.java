package com.octocourse.app.rover;

class Rover {

    private Position position = new Position(0, 0);
    private RoverMove roverMove = new RoverMoveFromEst();

    String position() {
        return position.toString();
    }

    void move(String commands) {
        for (String command : commands.split(""))
            interpretCommand(command);
    }

    private void interpretCommand(String command) {
        switch (RoverCommand.valueOf(command)) {
            case f:
                forwardOneBox();
                break;
            case b:
                backwardOneBox();
                break;
            case l:
                turnOnTheLeft();
                break;
            case r:
                turnOnTheRight();
                break;
        }
    }

    private void turnOnTheRight() {
        roverMove = roverMove.turnRight();
    }

    private void turnOnTheLeft() {
        roverMove = roverMove.turnLeft();
    }

    private void forwardOneBox() {
        position = roverMove.forward(position);
    }

    private void backwardOneBox() {
        position = roverMove.backward(position);
    }
}
