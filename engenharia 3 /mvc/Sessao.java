public class Sessao extends SessaoSubject {
    private Filme filme;
    private String horario;
    private int lugaresDisponiveis;

    public Sessao(Filme filme, String horario, int lugaresDisponiveis) {
        super();
        this.filme = filme;
        this.horario = horario;
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public Filme getFilme() {
        return filme;
    }

    public String getHorario() {
        return horario;
    }

    public int getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    public void reservarLugar() {
        if (lugaresDisponiveis > 0) {
            lugaresDisponiveis--;
            notificarClientes("Um lugar foi reservado na sessão do filme " + filme.getNome() + " às " + horario + ".");
        } else {
            throw new RuntimeException("Não há lugares disponíveis.");
        }
    }
}
