class SistemaCafeteria implements Cafeteria {
    private List<Cliente> clientes = new ArrayList<>();
    private String mensagemPromocional;

    @Override
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    @Override
    public void notificarClientes() {
        for (Cliente cliente : clientes) {
            cliente.receberNotificacao(mensagemPromocional);
        }
    }

    public void novaPromocao(String mensagem) {
        this.mensagemPromocional = mensagem;
        notificarClientes();
    }
}
