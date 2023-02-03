package Polimorfismes;
public class Polimorfismes {
    public static void main(String[] args) throws DemasiadoRapidoException{
        Camion c10 = new Camion ("PAPO 1234");
        c10.Acelerar(80);
        Remolque r10 = new Remolque(50);
        c10.ponRemolque(r10);
        c10.Acelerar(50);
        System.out.println(c10);
        System.out.println("------------------");
        Vehiculo v1 = new Vehiculo ("VOX 1234");
        v1.Acelerar(20);
        System.out.println(v1);
        Camion c1 = new Camion("SEX 4321");
        c1.Acelerar(150);
        System.out.println(c1);
        Remolque r1 = new Remolque(70);
        System.out.println(r1);
        c1.ponRemolque(r1);
        System.out.println(c1);
        c1.quitaRemolque();
        System.out.println(c1);
        Camion c2 = new Camion("WOW 0000", r1);
        System.out.println(c2);
    }
}