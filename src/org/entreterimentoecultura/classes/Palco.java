package org.entreterimentoecultura.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
	private String nome;
	private int capacidade; // 10000
	private List<String> horarios; // 08:00, 10:00, 12:00

	public Palco(String nome, int capacidade) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.horarios = new ArrayList<>();
	}

	public void addApresentacao(String dataHora, String artista) {
		horarios.add(dataHora + " - " + artista);
	}

	public String getInfo() {
		String info = "Palco: " + nome + "\n";
		info += "Capacidade: " + capacidade + "\n";
		info += "Horários:\n";
		for (String horario : horarios) {
			info += horario + "\n";
		}
		return info;
	}

}
