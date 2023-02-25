package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        zofka.setLocation(200, 200);


        obdelnik(160, 80, Color.BLACK);

        zofka.turnRight(90);
        zofka.move(160);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(90);

        ctverec(150, Color.BLACK);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(160);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(180);
        zofka.penDown();

        pravouhlyRovnoramennyTrojuhelnik(80, Color.BLUE );

        zofka.penUp();
        zofka.turnRight(180);
        zofka.turnLeft(45);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.penDown();


        circel(8,20, Color.RED);

        zofka.penUp();
        zofka.move(70);
        zofka.penDown();

        circel(8, 20, Color.RED);

        zofka.penUp();
        zofka.move(110);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.penDown();

        circel(22,20,Color.GREEN);

        zofka.setLocation(710, 250);

        equilateralTriangel(100, Color.ORANGE);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(57);
        zofka.turnRight(90);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.penDown();

        circel(16,20, Color.MAGENTA);


        zofka.setLocation(920,100);

        circel(16,20, Color.CYAN);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(105);
        zofka.turnLeft(90);
        zofka.penDown();
        circel(22,20, Color.CYAN);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.penDown();

        circel(32, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(105);
        zofka.penDown();

        circel(8, 20, Color.CYAN);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.turnLeft(90);
        zofka.move(48);
        zofka.turnRight(90);
        zofka.move(186);
        zofka.penDown();
        circel(8, 20, Color.CYAN);













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
            zofka.move(delkaStrany);
            zofka.turnLeft(90);

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
    public void circel(double delkaStrany, double pocetStran, Color barva){
        zofka.setPenColor(barva);
        var velikostStrany = delkaStrany;
        var pocet = pocetStran;
        var velikostUhlu = 180*((pocet-2)/pocet);


        for (int i = 0; i <(pocetStran); i++) {
            zofka.move(delkaStrany);
            zofka.turnLeft(180);
            zofka.turnLeft(velikostUhlu);

        }


    }



    public void pravouhlyRovnoramennyTrojuhelnik(double delkaStrany, Color barva){
        zofka.setPenColor(barva);
        var velikostStrany = delkaStrany;
        var velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
        zofka.move(velikostStrany);
        zofka.turnRight(90);
        zofka.move(velikostStrany);
        zofka.turnRight(135);
        zofka.move(velikostPrepony);



    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
