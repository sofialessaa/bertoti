public class Contexto {
    private Recomendacao recomendacao;

    // Define a estratégia em tempo de execução
    public void setRecomendacao(Recomendacao recomendacao) {
        this.recomendacao = recomendacao;
    }

    public void recomendar() {
        if (recomendacao != null) {
            recomendacao.recomendarFilme();
        } else {
            System.out.println("Nenhuma recomendação definida.");
        }
    }
}
