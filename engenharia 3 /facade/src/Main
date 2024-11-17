public class Main {
    public static void main(String[] args) {
        SistemaCinema sistema = new SistemaCinema();

        List<Filme> filmes = sistema.consultarFilmes();
        System.out.println("Filmes disponíveis:");
        for (Filme filme : filmes) {
            System.out.println("- " + filme);
        }

        sistema.realizarReserva("Sempre Ao Seu Lado", "G5");
    }
}
