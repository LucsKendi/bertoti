public class GodClass {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        GodClass gc = new GodClass();
        System.out.println("Soma: " + gc.add(5, 3));
        System.out.println("Multiplicação: " + gc.multiply(5, 3));
    }
}
