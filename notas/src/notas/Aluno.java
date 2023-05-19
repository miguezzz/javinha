package notas;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	ArrayList<Double> notas = new ArrayList<Double>();
	
	public Aluno(String nome, String cpf) {
		super(nome, cpf);
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void addNota(double nota) {
		notas.add(nota);
	}
	
	public double getMedia() {
		double notaFinal = 0;
		for (Double nota : notas) {
			notaFinal += nota;
		}
		
		return notaFinal/3;
	}
	
	public static void main(String[] args) {
		Aluno victor = new Aluno("Victor", "12345678911");
		
		victor.addNota(8.0);
		victor.addNota(9.5);
		victor.addNota(9.88);
		
		double notaFinal = victor.getMedia();
		System.out.println("A media de victor eh: " + notaFinal);
	}
}
