class View {
    public void exibirFilmes(List<Filme> filmes) {
        System.out.println("Lista de Filmes:");
        for (Filme filme : filmes) {
            System.out.println(" - " + filme.getNome() + " | Gênero: " + filme.getGenero() + " | Duração: " + filme.getDuracao() + " minutos");
        }
    }

    public void exibirSessao(Sessao sessao) {
        System.out.println("Sessão:");
        System.out.println("Filme: " + sessao.getFilme().getNome());
        System.out.println("Horário: " + sessao.getHorario());
        System.out.println("Lugares disponíveis: " + sessao.getLugaresDisponiveis());
    }
}
