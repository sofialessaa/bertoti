import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void adicionarCliente(Observer cliente);
    void removerCliente(Observer cliente);
    void notificarClientes(String mensagem);
}

class SessaoSubject implements Subject {
    private List<Observer> clientes;

    public SessaoSubject() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void adicionarCliente(Observer cliente) {
        clientes.add(cliente);
    }

    @Override
    public void removerCliente(Observer cliente) {
        clientes.remove(cliente);
    }

    @Override
    public void notificarClientes(String mensagem) {
        for (Observer cliente : clientes) {
            cliente.atualizar(mensagem);
        }
    }
}
