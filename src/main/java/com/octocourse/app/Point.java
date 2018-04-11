package com.octocourse.app;

class Point {

    private Double x;
    private Double y;

    Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    Double distance(Point point2) {
        if (haveDifferentXAndYCoordinates(point2))
            return Math.sqrt(Math.pow(this.x - point2.x, 2.0) + Math.pow(this.y - point2.y, 2.0));
        if (haveDifferentXCoordinates(point2))
            return this.x + point2.x;
        if (haveDifferentYCoordinates(point2))
            return this.y + point2.y;
        return 0.0;
    }

    private boolean haveDifferentXAndYCoordinates(Point point2) {
        return haveDifferentXCoordinates(point2) && haveDifferentYCoordinates(point2);
    }

    private boolean haveDifferentXCoordinates(Point point2) {
        return !this.x.equals(point2.x);
    }

    private boolean haveDifferentYCoordinates(Point point2) {
        return !this.y.equals(point2.y);
    }

}