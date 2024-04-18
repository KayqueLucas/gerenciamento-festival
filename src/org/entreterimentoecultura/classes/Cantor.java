package org.entreterimentoecultura.classes;

public class Cantor extends Artista {

	private String estiloVocal;

	public Cantor(String nome, GeneroMusical generoMusical, double cache, String estiloVocal) {
		super(nome, generoMusical, cache);
		this.estiloVocal = estiloVocal;
	}

	public String getEstiloVocal() {
		return estiloVocal;
	}

	@Override
	String getInfo() {
		return String.format("""
				Cantor: %s
				Gênero: %s
				Estilo Vocal: %s
				Cache: %s
				""", nome, genero, estiloVocal, cache);
	}

}
