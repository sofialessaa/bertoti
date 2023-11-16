package main;

public class Especificacao {
	private String editora;
	private String genero;
	private String nome;
	private String autor;
	
	public Especificacao(String editora, String genero, String nome, String autor) {
		this.editora = editora;
		this.genero = genero;
		this.nome = nome;
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public boolean comparar(Especificacao especificacao) {
		if(this.editora.equals(especificacao.editora) && this.genero.equals(especificacao.genero) && this.nome.equals(especificacao.nome) && this.autor.equals(especificacao.autor)) {
			return true;
		}else {
			return false;
		}
	}
}
