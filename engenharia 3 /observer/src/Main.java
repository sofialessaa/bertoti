public class Main {
    public static void main(String[] args) {
        SistemaCafeteria cafeteria = new SistemaCafeteria();

        Cliente cliente1 = new ClienteConcreto("Fernando");
        Cliente cliente2 = new ClienteConcreto("Luiza");

        cafeteria.adicionarCliente(cliente1);
        cafeteria.adicionarCliente(cliente2);

        cafeteria.novaPromocao("Promoção de Café: Compre 1, leve 2.");
        cafeteria.removerCliente(cliente2);
        cafeteria.novaPromocao("Nova bebida disponível: Frappuccino de amora!");
    }
}
