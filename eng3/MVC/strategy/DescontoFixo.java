public class DescontoFixo implements DescontoStrategy {
    public double calcular(double preco) {
        return preco - 10;
    }
}