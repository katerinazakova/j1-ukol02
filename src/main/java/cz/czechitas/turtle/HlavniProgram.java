package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        zofka.setLocation(200, 200);
        drawRectangle(160, 80, Color.BLACK);

        zofka.turnRight(90);
        zofka.move(160);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(90);

        drawSquare(150, Color.BLACK);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(160);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.penDown();

        drawRightAngledTriangle(80, Color.BLUE);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.turnLeft(45);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.penDown();

        drawPolygon(8, 20, Color.RED);

        zofka.penUp();
        zofka.move(70);
        zofka.penDown();

        drawPolygon(8, 20, Color.RED);

        zofka.penUp();
        zofka.move(110);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.penDown();

        drawPolygon(22, 20, Color.GREEN);

        zofka.setLocation(710, 250);
        drawEquilateralTriangle(100, Color.ORANGE);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(57);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.penDown();

        drawPolygon(16, 20, Color.MAGENTA);

        zofka.setLocation(920, 100);
        drawPolygon(16, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(105);
        zofka.turnLeft(90);
        zofka.penDown();
        drawPolygon(22, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.penDown();

        drawPolygon(32, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(105);
        zofka.penDown();

        drawPolygon(8, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.turnLeft(90);
        zofka.move(48);
        zofka.turnRight(90);
        zofka.move(186);
        zofka.penDown();
        drawPolygon(8, 20, Color.CYAN);

    }

    public void drawEquilateralTriangle(double length, Color colorLine) {
        zofka.setPenColor(colorLine);
        for (int i = 0; i < 3; i++) {
            zofka.turnRight(120);
            zofka.move(length);
        }

    }

    public void drawSquare(double lengthSide, Color colorLine) {
        zofka.setPenColor(colorLine);
        for (int i = 0; i < 4; i++) {
            zofka.move(lengthSide);
            zofka.turnLeft(90);

        }
    }

    public void drawRectangle(double lengthSideA, double lengthSideB, Color colorLine) {
        zofka.setPenColor(colorLine);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(lengthSideA);
            zofka.turnRight(90);
            zofka.move(lengthSideB);
        }

    }

    public void drawPolygon(double lengthSide, int numberOfPolygonSides, Color colorLine) {
        zofka.setPenColor(colorLine);

        double angle = 360 / numberOfPolygonSides;

        for (int i = 0; i < numberOfPolygonSides; i++) {
            zofka.move(lengthSide);
            zofka.turnRight(angle);
        }

    }

    public void drawRightAngledTriangle(double sizeSide, Color colorLine) {
        zofka.setPenColor(colorLine);

        var sizeHypotenuse = Math.sqrt(2 * Math.pow(sizeSide, 2));
        zofka.move(sizeSide);
        zofka.turnRight(90);
        zofka.move(sizeSide);
        zofka.turnRight(135);
        zofka.move(sizeHypotenuse);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
