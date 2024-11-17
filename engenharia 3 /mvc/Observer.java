public interface Observer {
    void atualizar(String mensagem);
}

class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Notificação para " + nome + ": " + mensagem + ".");
    }
}
