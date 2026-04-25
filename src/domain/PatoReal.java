
package domain;


public class PatoReal extends Pato implements Volable,Cuaqueable{

    @Override
    public void mostrar() {
        System.out.println("Yo soy real PATO REAL");
    }

    @Override
    public void volar() {
                System.out.println("Puedo volar con mis alas");

    }

    @Override
    public void cuaquear() {
       System.out.println("Soy un verdadero pato por eso hago CUAC CUAC");
    }
    
}
