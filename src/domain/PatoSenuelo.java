package domain;

public class PatoSenuelo extends Pato {

    public PatoSenuelo() {

        cuaqueable = new CuaqueoMudo();
        volable = new NoVuela();

    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un Pato Senuelo");
    }

}
