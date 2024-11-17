public class Filme {
    private String titulo;
    private String horario;

    public Filme(String titulo, String horario) {
        this.titulo = titulo;
        this.horario = horario;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return titulo + " às " + horario;
    }
}
