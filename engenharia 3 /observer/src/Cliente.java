class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println("Cliente " + nome + " recebeu: " + mensagem + ".");
    }
}
