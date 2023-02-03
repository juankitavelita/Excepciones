package Polimorfismes;
public class DemasiadoRapidoException extends Exception {
    public DemasiadoRapidoException(){

    }
    public DemasiadoRapidoException(String error) {
        System.out.println(error);
    }
}