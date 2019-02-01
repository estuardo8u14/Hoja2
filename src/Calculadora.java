import java.util.ArrayList;

public class Calculadora  implements iCalculadora, iPila<String>{

    //Sirve para ver si el array list tiene algo o es nulo//
    public boolean tienealgo = true;
    ArrayList<String> ar = new ArrayList<>();

    @Override
    public double sumar(double a, double b) {
        return a+b;
    }

    @Override
    public double restar(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a*b;
    }

    @Override
    public double dividir(double a, double b) {
        return a/b;
    }

    //FALTA
    @Override
    public void push(String item) {

    }

    //FALTA
    @Override
    public String pop() {
        return null;
    }

    //FALTA
    @Override
    public String peek() {
        return null;
    }

    //FALTA
    @Override
    public boolean empty() {
        return false;
    }

    //FAlTA
    @Override
    public int size() {
        return 0;
    }
}