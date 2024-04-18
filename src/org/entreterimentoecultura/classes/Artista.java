package org.entreterimentoecultura.classes;

public abstract class Artista {

	protected String nome;
	protected GeneroMusical genero;
	protected double cache;

	public Artista(String nome, GeneroMusical generoMusical, double cache) {
		this.nome = nome;
		this.genero = generoMusical;
		this.cache = cache;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GeneroMusical getGenero() {
		return genero;
	}

	public double getCache() {
		return cache;
	}

	abstract String getInfo();
}
