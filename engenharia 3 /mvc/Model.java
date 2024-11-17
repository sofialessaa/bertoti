import java.util.ArrayList;
import java.util.List;

interface Observer {
    void atualizar(String mensagem);
}

class Model {
    private String nome;
    private String genero;
    private int duracao;

    public Filme(String nome, String genero, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }
}

class Sessao {
    private Filme filme;
    private String horario;
    private int lugaresDisponiveis;

    public Sessao(Filme filme, String horario, int lugaresDisponiveis) {
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
        } else {
            throw new RuntimeException("Não há lugares disponíveis.");
        }
    }
}

class Reserva implements Observador {
    private String cliente;

    public Reserva(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Cliente " + cliente + ": " + mensagem);
    }
}
