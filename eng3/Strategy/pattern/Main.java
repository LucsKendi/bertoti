public class Main {
    public static void main(String[] args) {
        Context ctx = new Context();

        ctx.setStrategy(new AddStrategy());
        System.out.println("Soma: " + ctx.execute(5, 3));

        ctx.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplicação: " + ctx.execute(5, 3));
    }
}
