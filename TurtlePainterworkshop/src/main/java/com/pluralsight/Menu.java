package com.pluralsight;

import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.util.Scanner;
import java.awt.Color;
import java.awt.Point;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private World world;
    private Turtle turtle;

    public void display() {

        world = new World(800, 800);
        turtle = new Turtle(world, 0, 0);

        int choice = -1;

        while (choice != 0) {

            System.out.println("\n===== Home Screen =====");
            System.out.println("1) Add Shape");
            System.out.println("2) Save Image");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addShape();
                    break;

                case 2:
                    saveImage();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void addShape() {

        int choice = -1;

        while (choice != 0) {

            System.out.println("\n===== Add Shape =====");
            System.out.println("1) Square");
            System.out.println("2) Circle");
            System.out.println("3) Triangle");
            System.out.println("0) Return");
            System.out.print("Which shape? ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSquare();
                    choice = 0;
                    break;

                case 2:
                    addCircle();
                    choice = 0;
                    break;

                case 3:
                    addTriangle();
                    choice = 0;
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void addSquare() {

        int border = getBorder();
        Color color = getColor();
        Point location = getLocation();

        Square square = new Square(turtle, location, color, border);
        square.paint();
    }

    private void addCircle() {

        System.out.print("What is the radius? ");
        double radius = scanner.nextDouble();

        int border = getBorder();
        Color color = getColor();
        Point location = getLocation();

        Circle circle = new Circle(turtle, location, color, border, radius);
        circle.paint();
    }

    private void addTriangle() {

        int border = getBorder();
        Color color = getColor();
        Point location = getLocation();

        Triangle triangle = new Triangle(turtle, location, color, border);
        triangle.paint();
    }

    private int getBorder() {

        System.out.print("What is the border width? ");
        return scanner.nextInt();
    }

    private Color getColor() {

        System.out.print("What is the border color? ");
        String color = scanner.next().toLowerCase();

        switch (color) {
            case "red":
                return Color.RED;

            case "blue":
                return Color.BLUE;

            case "green":
                return Color.GREEN;

            case "yellow":
                return Color.YELLOW;

            case "orange":
                return Color.ORANGE;

            case "pink":
                return Color.PINK;

            case "white":
                return Color.WHITE;

            case "black":
                return Color.BLACK;

            default:
                System.out.println("Invalid color. Using black.");
                return Color.BLACK;
        }
    }

    private Point getLocation() {

        System.out.print("Enter X coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y coordinate: ");
        int y = scanner.nextInt();

        return new Point(x, y);
    }

    private void saveImage() {

        System.out.print("Enter the image file name: ");
        String fileName = scanner.next();

        world.saveAs(fileName + ".png");

        System.out.println("Image saved successfully!");
    }

}
