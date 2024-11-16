public class Main {
    public static void main(String[] args) {
        SistemaRecomendacao sistema = new SistemaRecomendacao();

        // Recomendação por Gênero
        sistema.setRecomendacao(new Genero());
        sistema.recomendar();

        // Recomendação por Diretor
        sistema.setRecomendacao(new Diretor());
        sistema.recomendar();

        // Recomendação por Avaliação
        sistema.setRecomendacao(new Avaliacao());
        sistema.recomendar();
    }
}
