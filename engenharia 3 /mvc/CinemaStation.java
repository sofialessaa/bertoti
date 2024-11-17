import java.util.ArrayList;

public class CinemaStation {
    public static void main(String[] args) {
        // Configuração inicial
        Filme filme1 = new Filme("Avatar", "Aventura", 162);
        Filme filme2 = new Filme("O Senhor dos Anéis", "Fantasia", 201);

        Sessao sessao1 = new Sessao(filme1, "19:30", 30);
        Sessao sessao2 = new Sessao(filme2, "20:50", 25);

        List<Sessao> sessoes = new ArrayList<>();
        sessoes.add(sessao1);
        sessoes.add(sessao2);

        Visao visao = new Visao();
        ControllerTrial controller = new ControllerTrial(sessoes, visao);

        // Iniciar o sistema
        controller.iniciar();

        // Simulação de reserva
        controller.reservarLugar(0, "Fernando");
        controller.reservarLugar(1, "Sofia");
        controller.reservarLugar(1, "Ana Luiza");
    }
}
