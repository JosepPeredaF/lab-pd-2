
package domain;

public class PatoDeGoma extends Pato implements Volable,Cuaqueable{

    @Override
    public void mostrar() {
        System.out.println("Yo soy un patito de goma");
    }

    @Override
    public void cuaquear() {
        System.out.println("Chirr Chirr");
        
    }

    @Override
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR");
    }
    
}
