package com.octocourse.app;

interface RoverMove {

    Position forward(Position currentPosition);

    Position backward(Position currentPosition);

    RoverMove turnRight();

    RoverMove turnLeft();

}
