package Polimorfismes;
public class Remolque{
    public int peso;

    public Remolque(){}

    public Remolque(int peso){
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Remolque{" +
                "peso=" + peso +
                '}';
    }
}