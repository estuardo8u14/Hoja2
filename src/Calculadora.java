import java.util.ArrayList;

public class Calculadora  implements iCalculadora, iPila<String>{

    //Sirve para ver si el array list tiene algo o es nulo//
    public boolean tienealgo = true;
    ArrayList<String> ar = new ArrayList<>();

    //Sumar dos numeros
    @Override
    public double sumar(double a, double b) {
        return a+b;
    }

    //restar dos numeros
    @Override
    public double restar(double a, double b) {
        return a-b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a*b;
    }

    //dividir dos numeros
    @Override
    public double dividir(double a, double b) {
        return a/b;
    }

    //agregar
    @Override
    public void push(String item) {
            ar.add(item);
            tienealgo = false;
    }

    //quitar
    @Override
    public String pop() {
        return ar.remove(size()-1);

    }

    @Override
    public String peek() {
        return ar.get(ar.size()-1);
    }


    @Override
    public boolean empty() {
        return ar.size() == 0;
    }

    @Override
    public int size() {
        return ar.size();
    }
}