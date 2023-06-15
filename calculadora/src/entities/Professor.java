package entities;

public class Professor {

	private Aluno[] turma;
	
	public Professor(Aluno[] turma, int tamanho) {
		this.turma = new Aluno[tamanho];
	}
	
	public Double calcularMediaBimestre1(int indice) {
		return (turma[indice].getNota1() + turma[indice].getNota2()) / 2;
	}

	public Double calcularMediaBimestre2(Aluno[] turma, int indice) {
		return (turma[indice].getNota3() + turma[indice].getNota4()) / 2;
	}

	public Double calcularMediaFinal(Aluno[] turma, int indice) {
		return (turma[indice].getNota1())
	}


}
