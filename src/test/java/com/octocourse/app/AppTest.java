package com.octocourse.app;

import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartesianTest {
    @Test
    void distanceIs0IfPointsHaveSameCoordinates() {
        Double distanceBetweenPoints = 0.0;
        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(0.0, 0.0);
        assertEquals(distanceBetweenPoints, point1.distance(point2));
    }

    @Test
    void returnTheDistanceIfPointsHaveCoordinatesDifferentXAndSameY() {
        Double distanceBetweenPoints = 1.0;
        Point point1 = new Point(1.0, 0.0);
        Point point2 = new Point(0.0, 0.0);
        assertEquals(distanceBetweenPoints, point1.distance(point2));
    }

    @Test
    void returnTheDistanceIfPointsHaveCoordinatesSameXAndDifferentY() {
        Double distanceBetweenPoints = 2.0;
        Point point1 = new Point(0.0, 0.0);
        Point point2 = new Point(0.0, 2.0);
        assertEquals(distanceBetweenPoints, point1.distance(point2));
    }

    @Test
    void returnTheDistanceIfPointsHaveCoordinatesDifferentXAndDifferentY() {
        Double distanceBetweenPoints = 3.6055;
        Point point1 = new Point(3.0, 1.0);
        Point point2 = new Point(5.0, 4.0);
        double delta = 0.0001;
        assertEquals(distanceBetweenPoints, point1.distance(point2), delta);
    }
}

/*
You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is facing.
The rover receives a character array of commands.
Implement commands that move the rover forward/backward (f,b).
Implement commands that turn the rover left/right (l,r).
Implement wrapping from one edge of the grid to another. (planets are spheres after all)
- Should return initial position
- Should forward of one box
- Should forward of two box
- Should backward of one box
- Should backward of two box
- Should turn on the right
- Should turn on the left
- Should turn on one direction and forward of one box
- Should turn on one direction and backward of one box
- Should move to its end position without obstacle
- should report obstacle if one obstacle is on its move
- etre à la position -1 si obstacle détecté
 */


/*
Si j'ai deux point de meme coordonnees la distance est 0
Si j'ai un point (0,0) et un point (0,0) la distance est 0
Si j'ai un point (1,0) et un point (1,0) la distance est 0
Si j'ai un point (0,1) et un point (0,1) la distance est 0
Si j'ai un point (1,1) et un point (1,1) la distance est 0
Si j'ai un point (0,0) et un point (1,1) la distance est racine de 2
 */