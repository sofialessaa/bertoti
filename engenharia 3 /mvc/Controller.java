class Controller {
    private List<Filme> filmes;
    private List<Sessao> sessoes;
    private Visao visao;

    public Controller(Visao visao) {
        this.visao = visao;
        this.filmes = new ArrayList<>();
        this.sessoes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void adicionarSessao(Sessao sessao) {
        sessoes.add(sessao);
    }

    public void listarFilmes() {
        visao.exibirFilmes(filmes);
    }

    public void exibirSessao(int indice) {
        if (indice >= 0 && indice < sessoes.size()) {
            visao.exibirSessao(sessoes.get(indice));
        } else {
            System.out.println("Sessão inválida.");
        }
    }

    public void reservarLugar(int indiceSessao, Reserva reserva) {
        try {
            Sessao sessao = sessoes.get(indiceSessao);
            sessao.reservarLugar();
            reserva.atualizar("Reserva feita com sucesso para o filme " + sessao.getFilme().getNome());
        } catch (RuntimeException e) {
            reserva.atualizar("Erro: " + e.getMessage());
        }
    }
}
