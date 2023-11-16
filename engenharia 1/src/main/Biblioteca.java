package main;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros= new LinkedList<Livro>();
	
	public void cadastrarLivro(Livro livro) {
		livro.add(livro);
	}
	
	public List<Livro> buscarLivroPorEspecificacao(Especificacao espec){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		for(Livro livro:livros){
			if(livro.getEspec().comparar(espec)) livrosEncontrados.add(livro);
		}
		return livrosEncontrados;
	}
	
	public Livro buscarLivroPorCodigo(String codigo){
		for(Livro livro:livros){
			if(livro.getCodigo().equals(codigo)) return livro;
		}
		return null;
	}
	
	public List<Livro> getLivros(){
		return livros;
	}
}
