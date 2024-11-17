import java.util.ArrayList;
import java.util.List;

public class CinemaStation {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Avatar", "Aventura", 162);
        Filme filme2 = new Filme("O Senhor dos Anéis", "Fantasia", 201);

        Sessao sessao1 = new Sessao(filme1, "19:30", 30);
        Sessao sessao2 = new Sessao(filme2, "20:50", 25);

        Cliente cliente1 = new Cliente("Fernando");
        Cliente cliente2 = new Cliente("Sofia");

        sessao1.adicionarCliente(cliente1);
        sessao1.adicionarCliente(cliente2);

        // Testar notificações
        sessao1.reservarLugar();  
        sessao1.removerCliente(cliente1);
        sessao1.reservarLugar();
    }
}
