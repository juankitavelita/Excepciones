import java.util.Scanner;
import java.util.Random;
public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int random = rn.nextInt(1, 500);
        int numero = 0;
        int intentos = 0;
        boolean correcto;
        System.out.println("Introduce un número entre el 1 y el 500.");
        do {
            try {
                do {
                    correcto =true;
                    ++intentos;
                    numero = sc.nextInt();
                } while (correcto == false);
                if (numero == random){
                    System.out.println("Enhorabuena, has acertado el número.");
                }else if(numero < 1 || numero > 500 && intentos > 0){
                    System.out.println("El número que has introducido no está entre el 1 y el 500.");
                }else{
                    System.out.println("No has acertado el número");
                }
            }catch(Exception e){
                System.out.println("ERROR" + "\n" + "El número debe de ser un número entero entre el 1 y el 500.");
                correcto = false;
                sc.nextLine();
            }
        } while (numero != random && intentos > 0);
        if(numero == random){
            System.out.println("El número era el " + random + ".");
        }else{
            System.out.println("El número era el " + random + ".");
        }
    }
}