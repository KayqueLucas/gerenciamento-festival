package org.entreterimentoecultura.classes;

public class Dj extends Artista {

	private String estilo;

	public Dj(String nome, GeneroMusical generoMusical, double cache, String estilo) {
		super(nome, generoMusical, cache);
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}

	String getInfo() {
		return String.format("""
				DJ: %s
				Gênero: %s
				Estilo: %s
				Cache: %s
				""", nome, genero, estilo, cache);
	}

}
