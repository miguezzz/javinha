package application;

import java.util.Locale;

import entities.Aluno;
import entities.Nota;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Aluno john = new Aluno("John", "123456789-54");
		john.addNota("15/06/2023", 2.0);
		john.addNota("15/07/2023", 5.5);

		Aluno joseph = new Aluno("Joseph", "321654987-88");
		joseph.addNota("15/06/2023", 7.0);
		joseph.addNota("15/07/2023", 8.5);

		System.out.println("Notas de John:");
		for (Nota notas : john.getNotas()) {
			System.out.println(notas.getValor());
		}

		System.out.println("Notas de Joseph");
		for (Nota notas : joseph.getNotas()) {
			System.out.println(notas.getValor());
		}

		System.out.println("Media de alunos");
		System.out.println(john.getMedia(2));
		System.out.println(joseph.getMedia(2));
		
	}

}
