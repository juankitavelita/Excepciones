package Polimorfismes;
public class Vehiculo {
    protected String matricula;
    protected int velocidad;

    public Vehiculo(){
        this.velocidad = 0;
    }
    public Vehiculo(String matricula){
        this();
        this.matricula = matricula;
    }
    public int Acelerar(int aceleracion) throws DemasiadoRapidoException {
        this.velocidad += aceleracion;
        return this.velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}