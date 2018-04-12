package com.octocourse.app.rover;

class RoverMoveFromSouth implements RoverMove {

    public Position forward(Position currentPosition) {
        return new Position(currentPosition.getX(), currentPosition.getY() - 1);
    }

    public Position backward(Position currentPosition) {
        return new Position(currentPosition.getX(), currentPosition.getY() + 1);
    }

    public RoverMove turnRight() {
        return new RoverMoveFromWest();
    }

    public RoverMove turnLeft() {
        return new RoverMoveFromEst();
    }

}
