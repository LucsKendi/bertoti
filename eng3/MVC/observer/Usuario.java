public class Usuario implements Observer {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void notificar(String msg) {
        System.out.println(nome + " foi notificado: " + msg);
    }
}
