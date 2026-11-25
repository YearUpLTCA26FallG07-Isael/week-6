package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape {

    private double radius;

    public Circle(Turtle turtle, Point location, Color color, int border, double radius) {

        super(turtle, location, color, border);
        this.radius = radius;
    }

    @Override
    public void paint() {

        double originalDelay = turtle.getDelay();

        turtle.penUp();
        turtle.goTo(location.x, location.y);

        turtle.setColor(color);
        turtle.setPenWidth(border);
        turtle.setDelay(0.001);

        turtle.penDown();

        double circumference = 2 * Math.PI * radius;

        for (int i = 0; i < 72; i++) {
            turtle.forward(circumference / 72);
            turtle.turnRight(5);
        }

        turtle.penUp();

        turtle.setDelay(originalDelay);
    }
}