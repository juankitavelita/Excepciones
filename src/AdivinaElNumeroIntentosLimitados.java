import java.util.Scanner;
import java.util.Random;
public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int random = rn.nextInt(1, 500);
        int numero = 0;
        int intentos = 3;
        System.out.println("Introduce un número entre el 1 y el 500.");
        do {
            try {
                do {
                    numero = sc.nextInt();
                } while (numero < 1 || numero > 500);
                if (numero == random){
                    System.out.println("Enhorabuena, has acertado el número.");
                }else if(numero < 1 || numero > 500){
                    System.out.println("El número que has introducido no está entre el 1 y el 500.");
                }else{
                    System.out.println("No has acertado el número");
                }
                if(intentos != 0){
                    System.out.println("Te quedan " + intentos + " intentos.");
                }else{
                    System.out.println("Te has quedado sin intentos.");
                }
            }catch(Exception e){
                System.out.println("ERROR" + "\n" + "El número debe de ser un número entero entre el 1 y el 500.");
                --intentos;
                if(intentos != 0){
                    System.out.println("Te quedan " + intentos + " intentos.");
                }else{
                    System.out.println("Te has quedado sin intentos.");
                }
                sc.nextLine();
            }
        } while (numero != random && intentos != 0);
    }
}