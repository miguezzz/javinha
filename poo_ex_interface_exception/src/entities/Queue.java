package entities;

public interface Queue {
	void add(int n); // add elemento na fila
	int remove(); // desempilha
	boolean isEmpty(); // verifica pilha vazia
}
