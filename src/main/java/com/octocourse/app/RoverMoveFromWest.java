package com.octocourse.app;

class RoverMoveFromWest implements RoverMove {

    public Position forward(Position currentPosition) {
        return new Position(currentPosition.getX() - 1, currentPosition.getY());
    }

    public Position backward(Position currentPosition) {
        return new Position(currentPosition.getX() + 1, currentPosition.getY());
    }

    public RoverMove turnRight() {
        return new RoverMoveFromNorth();
    }

    public RoverMove turnLeft() {
        return new RoverMoveFromSouth();
    }

}
