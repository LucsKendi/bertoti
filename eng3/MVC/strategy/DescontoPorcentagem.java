public class DescontoPorcentagem implements DescontoStrategy {
    public double calcular(double preco) {
        return preco * 0.9;
    }
}