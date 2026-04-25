package Test;

import domain.PatoCabezaRoja;
import domain.PatoDeGoma;
import domain.PatoReal;
import domain.PatoSenuelo;

public class Testeo {

    public static void main(String[] args) {
        PatoReal p1 = new PatoReal();
        p1.mostrar();

        System.out.println("-------------------------------");
        PatoDeGoma p2 = new PatoDeGoma();
        p2.mostrar();

        System.out.println("-------------------------------");
        PatoSenuelo p3 = new PatoSenuelo();
        p3.mostrar();

        System.out.println("-------------------------------");
        PatoCabezaRoja p4 = new PatoCabezaRoja();
        

    }

}
