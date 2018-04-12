package com.octocourse.app.rover;

class RoverMoveFromEst implements RoverMove {

    public Position forward(Position currentPosition) {
        return new Position(currentPosition.getX() + 1, currentPosition.getY());
    }

    public Position backward(Position currentPosition) {
        return new Position(currentPosition.getX() - 1, currentPosition.getY());
    }

    public RoverMove turnRight() {
        return new RoverMoveFromSouth();
    }

    public RoverMove turnLeft() {
        return new RoverMoveFromNorth();
    }

}
