package entities;

public class Aluno {
	private String nome;
	private char sexo;
	private int idade;
	private double nota1, nota2, nota3, nota4, mediaFinal;
	private boolean aprovado;
	
	public Aluno(String nome, char sexo, int idade, double nota1, double nota2, double nota3, double nota4, double mediaFinal, boolean aprovado) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.mediaFinal = mediaFinal;
		this.aprovado = aprovado;
	}
	
	public Aluno(String nome, char sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}

	public char getSexo() {
		return sexo;
	}

	public int getIdade() {
		return idade;
	}
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}


	
	@SuppressWarnings("unused")
	private void presente(int presenca) {
		if (presenca == 1) {
			System.out.println("O aluno" + nome + "esta presente.");
		}
		else {
			System.out.println("O aluno" + nome + "faltou.");
		}
	}
	
	public String toString() {
		return "Nome: "
				+ nome
				+ String.format("%.2f", nota1)
				+ String.format("%.2f", nota2)
				+ String.format("%.2f", nota3)
				+ String.format("%.2f", nota4)
				+ String.format("%.2f", mediaFinal);
		
	}
}
