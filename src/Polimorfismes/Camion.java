package Polimorfismes;
public class Camion extends Vehiculo{
    private Remolque remolque;
    public Camion(){
        super();
        this.remolque = null;
    }
    public Camion(String matricula){
        super(matricula);
    }
    public Camion(String matricula, Remolque remolque){
        super(matricula);
        this.remolque = remolque;
    }
    public void ponRemolque(Remolque remolque){
        this.remolque = remolque;
    }
    public void quitaRemolque(){
        this.remolque = null;
    }

    @Override
    public int Acelerar(int aceleracion) throws DemasiadoRapidoException {
        super.Acelerar(aceleracion);
        try {
            if (velocidad > 100 && remolque != null) {
                throw new DemasiadoRapidoException("Has superado los 100 km/h");
            }
            return this.velocidad;
        }catch(DemasiadoRapidoException e){
            this.velocidad = 100;
            return this.velocidad;
        }
    }

    @Override
    public String toString() {
        return "Camion{" +
                "remolque=" + remolque +
                ", matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}