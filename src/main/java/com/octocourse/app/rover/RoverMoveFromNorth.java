package com.octocourse.app.rover;

class RoverMoveFromNorth implements RoverMove {

    public Position forward(Position currentPosition) {
        return new Position(currentPosition.getX(), currentPosition.getY() + 1);
    }

    public Position backward(Position currentPosition) {
        return new Position(currentPosition.getX(), currentPosition.getY() - 1);
    }

    public RoverMove turnRight() {
        return new RoverMoveFromEst();
    }

    public RoverMove turnLeft() {
        return new RoverMoveFromWest();
    }

}
