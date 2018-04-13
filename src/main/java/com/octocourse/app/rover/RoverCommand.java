package com.octocourse.app.rover;

enum RoverCommand {
    forward, backward, turnLeft, turnRight;

    static RoverCommand convertToRoverCommand(String command) {
        switch (command) {
            case "f":
                return RoverCommand.forward;
            case "b":
                return RoverCommand.backward;
            case "l":
                return RoverCommand.turnLeft;
            case "r":
                return RoverCommand.turnRight;
            default:
                return null;
        }
    }

}
