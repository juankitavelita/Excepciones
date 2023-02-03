package Polimorfismes;
public class Polimorfismes {
    static Vehiculo[] vehiculos = new Vehiculo[4];
    static Remolque[] remolques = new Remolque[2];
    public static void main(String[] args) throws DemasiadoRapidoException{
        vehiculos[0] = new Camion("DJG 4634");
        vehiculos[1] = new Camion("LDS 9376");
        vehiculos[2] = new Coche("NYH 9983");
        vehiculos[3] = new Coche("BEG 2945");
        Remolque r1 = new Remolque(5000);
        Remolque r2 = new Remolque(5000);
        int j = 0;
        for(int i = 0; i > 3; i++) {
            if (vehiculos[i] instanceof Camion) {

            }
            vehiculos[i].Acelerar(50);
            System.out.println(vehiculos[i]);
        }
    }
}