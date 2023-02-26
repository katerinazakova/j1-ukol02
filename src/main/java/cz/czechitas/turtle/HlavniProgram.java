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

        drawCircle(8, 20, Color.RED);

        zofka.penUp();
        zofka.move(70);
        zofka.penDown();

        drawCircle(8, 20, Color.RED);

        zofka.penUp();
        zofka.move(110);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.penDown();

        drawCircle(22, 20, Color.GREEN);

        zofka.setLocation(710, 250);
        drawEquilateralTriangel(100, Color.ORANGE);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(57);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.penDown();

        drawCircle(16, 20, Color.MAGENTA);

        zofka.setLocation(920, 100);
        drawCircle(16, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(105);
        zofka.turnLeft(90);
        zofka.penDown();
        drawCircle(22, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.penDown();

        drawCircle(32, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(105);
        zofka.penDown();

        drawCircle(8, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.turnLeft(90);
        zofka.move(48);
        zofka.turnRight(90);
        zofka.move(186);
        zofka.penDown();
        drawCircle(8, 20, Color.CYAN);

    }

    public void drawEquilateralTriangel(double lenghtSide, Color colorLine) {
        zofka.setPenColor(colorLine);
        zofka.turnRight(120);
        zofka.move(lenghtSide);
        zofka.turnRight(120);
        zofka.move(lenghtSide);
        zofka.turnRight(120);
        zofka.move(lenghtSide);

    }

    public void drawSquare(double lenghtSide, Color colorLine) {
        zofka.setPenColor(colorLine);
        for (int i = 0; i < 4; i++) {
            zofka.move(lenghtSide);
            zofka.turnLeft(90);

        }
    }

    public void drawRectangle(double lenghtSideA, double lenghtSideB, Color colorLine) {
        zofka.setPenColor(colorLine);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(lenghtSideA);
            zofka.turnRight(90);
            zofka.move(lenghtSideB);
        }

    }

    public void drawCircle(double lenghtSide, double numberSidesPolygon, Color colorLine) {
        zofka.setPenColor(colorLine);
        var sizeSide = lenghtSide;
        var numberSides = numberSidesPolygon;
        var sizeAngle = 180 * ((numberSides - 2) / numberSides);

        for (int i = 0; i < (numberSidesPolygon); i++) {
            zofka.move(lenghtSide);
            zofka.turnLeft(180);
            zofka.turnLeft(sizeAngle);

        }


    }

    public void drawRightAngledTriangle(double lenghtSide, Color colorLine) {
        zofka.setPenColor(colorLine);
        var sizeSide = lenghtSide;
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
