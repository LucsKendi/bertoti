import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private Produto model;
    private ProdutoView view;
    private DescontoStrategy desconto;
    private List<Observer> observers = new ArrayList<>();

    public ProdutoController(Produto model, ProdutoView view) {
        this.model = model;
        this.view = view;
    }

    public void setDesconto(DescontoStrategy d) {
        this.desconto = d;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void atualizarView() {
        double precoFinal = desconto != null ? desconto.calcular(model.getPreco()) : model.getPreco();
        view.mostrarProduto(model.getNome(), precoFinal);
        for (Observer o : observers) {
            o.notificar("Preço atualizado: R$" + precoFinal);
        }
    }
}
