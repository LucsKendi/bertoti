public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000);
        ProdutoView view = new ProdutoView();
        ProdutoController controller = new ProdutoController(produto, view);

        controller.setDesconto(new DescontoPorcentagem());
        controller.addObserver(new Usuario("João"));
        controller.addObserver(new Usuario("Maria"));

        controller.atualizarView();
    }
}