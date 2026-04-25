package Test;

import domain.PatoCabezaRoja;
import domain.PatoDeGoma;
import domain.PatoReal;
import domain.PatoSenuelo;

public class SimPato {

    public static void main(String[] args) {
        PatoReal preal = new PatoReal();

        preal.mostrar();
        preal.realizarCuaqueo();
        preal.realizarVuelo();
        preal.nadar();

        System.out.println("-------------------------------");

        PatoDeGoma pgoma = new PatoDeGoma();

        pgoma.mostrar();
        pgoma.realizarCuaqueo();
        pgoma.realizarVuelo();
        pgoma.nadar();

        System.out.println("-------------------------------");

        PatoSenuelo psenuelo = new PatoSenuelo();

        psenuelo.mostrar();
        psenuelo.realizarCuaqueo();
        psenuelo.realizarVuelo();
        psenuelo.nadar();

        System.out.println("-------------------------------");

        PatoCabezaRoja proja = new PatoCabezaRoja();

        proja.mostrar();
        proja.realizarCuaqueo();
        proja.realizarVuelo();
        proja.nadar();

    }

}
