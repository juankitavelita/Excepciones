package Polimorfismes;
public class Coche extends Vehiculo{
    protected int puertas;

    public Coche(){
        super();
    }
    public Coche(String matricula){
        super(matricula);
    }
    public Coche(String matricula, int puertas){
        super(matricula);
        this.puertas = puertas;
    }
    public int getPuertas() {
        return puertas;
    }
}