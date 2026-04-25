package domain;

public abstract class Pato {
    
    
    Volable volable;
    Cuaqueable cuaqueable;

    public Pato() {

    }
       
    public void setCuaqueable(Cuaqueable qb) {
        this.cuaqueable = qb;
    }

    public void setVolable(Volable fb) {
        this.volable = fb;
    }
    
    public void Realizarvuelo(){
        volable.volar();
    }
    
    public void RealizarCuaqueo(){
        cuaqueable.cuaquear();
    }
    

    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN");
    }

    public abstract void mostrar();
}
