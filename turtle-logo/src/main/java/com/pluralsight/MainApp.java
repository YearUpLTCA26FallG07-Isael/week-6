package com.pluralsight;
import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world, -100, -100);

        turtle.setPenWidth(2);
        turtle.setColor(Color.BLACK);

        // Draw horizontal line
        turtle.penUp();
        turtle.goTo(-100, 0);
        turtle.penDown();
        turtle.goTo(100, 0);

        // Draw vertical line
        turtle.penUp();
        turtle.goTo(0, -100);
        turtle.penDown();
        turtle.goTo(0, 100);

        turtle.penUp();

        turtle.penUp();
        turtle.goTo(-75, 75);
        turtle.setColor(Color.GREEN);
        turtle.penDown();

        turtle.goTo(-25, 75);
        turtle.goTo(-25, 25);
        turtle.goTo(-75, 25);
        turtle.goTo(-75, 75);

        turtle.penUp();

        // Draw circle in the upper-right section
        turtle.setDelay(0.002);
        turtle.penUp();
        turtle.setColor(Color.BLUE);
        turtle.setPenWidth(3);
        turtle.goTo(75, 50);
        turtle.penDown();

        double radius = 25;

        for (int i = 1; i <= 360; i++) {
            double angle = Math.toRadians(i);

            double x = 50 + radius * Math.cos(angle);
            double y = 50 + radius * Math.sin(angle);

            turtle.goTo(x, y);
        }

        turtle.penUp();

        // Restore original drawing speed
        turtle.setDelay(0.2);

        // Draw 3/4 of the circle
        turtle.setDelay(0.002);
        turtle.setPenWidth(3);
        turtle.setColor(Color.RED);

        turtle.penUp();
        turtle.goTo(-50, -50);
        turtle.penDown();

        for (int i = 0; i <= 270; i++) {
            double angle = Math.toRadians(i);

            double x = -50 + 25 * Math.cos(angle);
            double y = -50 + 25 * Math.sin(angle);

            turtle.goTo(x, y);
        }

        turtle.goTo(-50, -50);
        turtle.penUp();

        // Draw the blue 1/4 slice
        turtle.setColor(Color.BLUE);
        turtle.goTo(-46, -54);
        turtle.penDown();

        for (int i = 270; i <= 360; i++) {
            double angle = Math.toRadians(i);

            double x = -46 + 25 * Math.cos(angle);
            double y = -54 + 25 * Math.sin(angle);

            turtle.goTo(x, y);
        }

        turtle.goTo(-46, -54);
        turtle.penUp();

        // Restore normal speed
        turtle.setDelay(0.2);

        // Draw a giant I
        turtle.setColor(Color.MAGENTA);
        turtle.setPenWidth(5);

    // Top horizontal line
        turtle.penUp();
        turtle.goTo(25, -15);
        turtle.penDown();
        turtle.goTo(75, -15);

    // Middle vertical line
        turtle.penUp();
        turtle.goTo(50, -15);
        turtle.penDown();
        turtle.goTo(50, -85);

    // Bottom horizontal line
        turtle.penUp();
        turtle.goTo(25, -85);
        turtle.penDown();
        turtle.goTo(75, -85);

        turtle.penUp();
    }

}
