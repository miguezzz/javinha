package entities;

import java.util.ArrayList;

public class Aluno extends Pessoa {

	private ArrayList<Nota> notas;

	public Aluno(String nome, String CPF) {
		super(nome, CPF);
		this.notas = new ArrayList<>();
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public Double getMedia(int qtd_notas) {
		Double sum = 0.0;
		for (Nota nota : notas) {
			sum += nota.getValor();
		}
		return sum / qtd_notas;
	}
	
	public void addNota(String data, Double nota) {
		notas.add(new Nota(data, nota));
	}
}
