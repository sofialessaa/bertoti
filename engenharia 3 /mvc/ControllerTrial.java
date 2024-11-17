import java.util.List;

public class ControllerTrial implements ControllerInterface {
    private List<Sessao> sessoes;
    private Visao visao;

    public ControllerTrial(List<Sessao> sessoes, Visao visao) {
        this.sessoes = sessoes;
        this.visao = visao;
    }

    @Override
    public void iniciar() {
        System.out.println("Bem-vindo ao Sistema de Cinema.");
        listarSessoes();
    }

    @Override
    public void reservarLugar(int sessaoIndex, String cliente) {
        if (sessaoIndex < 0 || sessaoIndex >= sessoes.size()) {
            System.out.println("Sessão inválida!");
            return;
        }

        Sessao sessao = sessoes.get(sessaoIndex);
        try {
            sessao.reservarLugar();
            System.out.println("Reserva feita com sucesso para " + cliente + " no filme: " + sessao.getFilme().getNome());
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void listarSessoes() {
        for (int i = 0; i < sessoes.size(); i++) {
            Sessao sessao = sessoes.get(i);
            System.out.println(i + " - Filme: " + sessao.getFilme().getNome() + " | Horário: " + sessao.getHorario() + " | Lugares Disponíveis: " + sessao.getLugaresDisponiveis());
        }
    }
}
