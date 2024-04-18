package org.entreterimentoecultura.classes;

public class Banda extends Artista {

	private int numMembros;

	public Banda(String nome, GeneroMusical generoMusical, double cache, int numMembros) {
		super(nome, generoMusical, cache);
		this.numMembros = numMembros;
	}

	public int getNumMembros() {
		return numMembros;
	}

	@Override
	String getInfo() {
		return String.format("""
				Cantor: %s
				Gênero: %s
				Numero de membros: %s
				Cache: %s
				""", nome, genero, numMembros, cache);
	}

}
