package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.Color;
import java.awt.Point;

public class Triangle extends Shape {

    private double side = 100;

    public Triangle(Turtle turtle, Point location,
                    Color color, int border) {

        super(turtle, location, color, border);
    }

    @Override
    public void paint() {

        turtle.penUp();
        turtle.goTo(location.x, location.y);

        turtle.setColor(color);
        turtle.setPenWidth(border);

        turtle.penDown();

        turtle.turnRight(60);

        for (int i = 0; i < 3; i++) {
            turtle.forward(side);
            turtle.turnRight(120);
        }

        turtle.penUp();
    }
}
