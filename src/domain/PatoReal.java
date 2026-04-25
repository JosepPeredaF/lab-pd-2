package domain;

public class PatoReal extends Pato {

    public PatoReal() {

        cuaqueable = new Cuaqueo();
        volable = new VuelaConAlas();

    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy verdadero PATO REAL");
    }

}
