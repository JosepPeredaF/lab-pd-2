
package domain;


public class PatoSenuelo extends Pato implements Volable,Cuaqueable{

    @Override
    public void mostrar() {
        System.out.println("Yo soy un Pato Señuelo");
    }

    @Override
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR");
    }

    @Override
    public void cuaquear() {
        System.out.println("<<Silencio>>");
    }
    
}
