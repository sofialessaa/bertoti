package main;

public class Livro {
	private String codigo;
	private Especificacao espec;
	
	public Livro(String codigo, Especificacao espec) {
		this.codigo = codigo;
		this.espec = espec;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String novoCodigo) {
		codigo = novoCodigo;
	}

	public Especificacao getEspec() {
		return espec;
	}

	public void setEspec(Especificacao espec) {
		this.espec = espec;
	}

	public void add(Livro livro) {
		// TODO Auto-generated method stub
		
	}
}
