package Polimorfismes;
/**
 * @author Juan Carlos Arévalo
 * @para Exercici Polimorfismes
 * @version 1.0*/
public class Polimorfismes {
    /**
     * Creo el array de vehículos*/
    static Vehiculo[] vehiculos = new Vehiculo[4];
    public static void main(String[] args) throws DemasiadoRapidoException{
        /**
         * Creamos los objetos en el array*/
        vehiculos[0] = new Camion("DJG 4634");
        vehiculos[1] = new Camion("LDS 9376");
        vehiculos[2] = new Coche("NYH 9983");
        vehiculos[3] = new Coche("BEG 2945");
        Remolque r1 = new Remolque(5000);
        /**
         * Un buqule for que primero comprueba si el objeto es un camión, si lo es le coloca un remolque llamando al método ponRemolque, y después o si no es camión, lo acelera y lo imprime por pantalla*/
        for(int i = 0; i < 4; i++) {
            if (vehiculos[i] instanceof Camion) {
                ((Camion) vehiculos[i]).ponRemolque(r1);
            }
            vehiculos[i].Acelerar(50);
            System.out.println(vehiculos[i]);
            System.out.println("-------------------------------");
        }
    }
}