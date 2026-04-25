package domain;

public class PatoCabezaRoja extends Pato {

    public PatoCabezaRoja() {

        cuaqueable = new Cuaqueo();
        volable = new VuelaConAlas();

    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy verdadero PATO CABEZA ROJA");
    }

}
