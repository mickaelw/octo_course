package com.octocourse.app;

class Position {

    private Integer x;
    private Integer y;

    Position(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    Integer getX() {
        return x;
    }

    Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x:" + this.x + ";y:" + this.y;
    }

}
