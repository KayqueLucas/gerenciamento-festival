package org.entreterimentoecultura.main;

import org.entreterimentoecultura.classes.Banda;
import org.entreterimentoecultura.classes.Cantor;
import org.entreterimentoecultura.classes.Dj;
import org.entreterimentoecultura.classes.GeneroMusical;
import org.entreterimentoecultura.classes.Palco;

public class Festival {
	public static void main(String[] args) {

		Cantor iza = new Cantor("Iza", GeneroMusical.POP, 50000, "Soprano");
		Banda redHotChilliPeppers = new Banda("Red Hot Chilli Peppers", GeneroMusical.ROCK, 100000, 4);
		Cantor ludmila = new Cantor("Ludmila", GeneroMusical.FUNK, 60000, "Soprano");
		Banda theCure = new Banda("The Cure", GeneroMusical.ROCK, 120000, 3);
		Dj martinGarrix = new Dj("Martin Garrix", GeneroMusical.ELETRONICO, 80000, "EDM");

		Palco palcoPrincipal = new Palco("Palco Principal", 20000);
		Palco palcoEletronico = new Palco("Palco Eletrônico", 10000);

		palcoPrincipal.addApresentacao("20/05/2024 - 19:00", iza.getNome());
		palcoPrincipal.addApresentacao("20/05/2024 - 22:00", redHotChilliPeppers.getNome());
		palcoPrincipal.addApresentacao("21/05/2024 - 18:00", ludmila.getNome());
		palcoPrincipal.addApresentacao("21/05/2024 - 23:00", theCure.getNome());
		palcoEletronico.addApresentacao("20/05/2024 - 21:00", martinGarrix.getNome());

		System.out.println("---- Informações do Festival ----\n\n");

		System.out.println("---- Informações do Palco Principal ----");
		System.out.println(palcoPrincipal.getInfo());

		System.out.println("---- Informações do Palco Eletrônico ----");
		System.out.println(palcoEletronico.getInfo());

	}
}
