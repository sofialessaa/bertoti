public class SistemaCinema {
    private GerenciadorFilmes gerenciadorFilmes;
    private GerenciadorReservas gerenciadorReservas;

    public SistemaCinema() {
        this.gerenciadorFilmes = new GerenciadorFilmes();
        this.gerenciadorReservas = new GerenciadorReservas();
    }

    public List<Filme> consultarFilmes() {
        return gerenciadorFilmes.listarFilmes();
    }

    public void realizarReserva(String filme, String assento) {
        gerenciadorReservas.reservarAssento(filme, assento);
    }
}
