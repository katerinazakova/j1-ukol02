package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        zofka.setLocation(200,20);
       zofka.turnRight(90);
        equilateralTriangel(100, Color.BLACK);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        ctverec(80, Color.BLACK);
        zofka.penUp();
        zofka.move(140);
        zofka.penDown();
        obdelnik(150, 80, Color.BLACK);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnLeft(90);

        zofka.move(100);
        zofka.penDown();
        circel(20, 20, Color.BLACK);
        zofka.penUp();
        zofka.turnLeft(160);
        zofka.move(90);
        zofka.penDown();
        pravouhlyRovnoramennyTrojuhelnik(100, Color.BLACK);



    }

    public void equilateralTriangel(double delkaStrany, Color barva){
            zofka.setPenColor(barva);
            zofka.turnRight(120);
            zofka.move (delkaStrany);
            zofka.turnRight(120);
            zofka.move (delkaStrany);
            zofka.turnRight(120);
            zofka.move (delkaStrany);





    }
    public void ctverec (double delkaStrany, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(delkaStrany);
        }
    }

    public void obdelnik (double delkaStranyA, double delkaStranyB, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
        }

    }
    public void circel(double delkaPolomeru, double pocetStran, Color barva){
        zofka.setPenColor(barva);
        zofka.penUp();

        var polomer = delkaPolomeru;
        zofka.move(polomer);
        zofka.turnRight(120);

        zofka.penDown();
        var pocet = pocetStran;

        var delkaStrany = 2*polomer* Math.sin(180/pocet);

        for (int i = 0; i < pocet; i++) {
            zofka.turnRight(20);
            zofka.move(delkaStrany);
        }

    }




    public void pravouhlyRovnoramennyTrojuhelnik(double delkaStrany, Color barva){
        zofka.setPenColor(barva);
        var velikostStrany = delkaStrany;

        zofka.move(velikostStrany);
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        zofka.turnRight(135);
        var velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
        zofka.move(velikostPrepony);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
