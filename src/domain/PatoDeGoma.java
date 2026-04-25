package domain;

public class PatoDeGoma extends Pato {

    public PatoDeGoma() {
        cuaqueable = new Chirreo();
        volable = new NoVuela();

    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un patito de goma");
    }

}
