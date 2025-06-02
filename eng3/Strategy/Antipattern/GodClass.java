// Interface com vários métodos (má prática)
public interface Operacao {
    int add(int a, int b);
    int multiply(int a, int b);
}

// GodClass implementa tudo numa classe só
public class GodClass implements Operacao {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        GodClass gc = new GodClass();
        System.out.println("Soma: " + gc.add(5, 3));
        System.out.println("Multiplicação: " + gc.multiply(5, 3));
    }
}
