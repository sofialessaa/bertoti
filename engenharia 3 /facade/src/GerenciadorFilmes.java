import java.util.ArrayList;
import java.util.List;

public class GerenciadorFilmes {
    public List<Filme> listarFilmes() {
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Sempre Ao Seu Lado", "17:00"));
        filmes.add(new Filme("Diário de Uma Paixão", "20:30"));
        filmes.add(new Filme("MaXXXine", "21:00"));
        return filmes;
    }
}
