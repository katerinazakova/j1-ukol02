package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

        //rovnostrannyTrojuhelnik(200, Color.CYAN);
        //ctverec(100, Color.MAGENTA);
        //obdelnik(100, 200, Color.BLACK);
        //kolecko(30, Color.BLUE);
        pravouhlyRovnoramennyTrojuhelnik(200, Color.ORANGE);

    }

    public void rovnostrannyTrojuhelnik(double delkaStrany, Color barva){
            zofka.setPenColor(barva);
            zofka.move (delkaStrany);
            zofka.turnRight(120);
            zofka.move (delkaStrany);
            zofka.turnRight(120);
            zofka.move(delkaStrany);



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
    public void kolecko(double delkaStrany, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 37; i++) {
            zofka.turnRight(10);
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
