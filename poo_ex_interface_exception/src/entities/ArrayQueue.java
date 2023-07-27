package entities;

public class ArrayQueue implements Queue {

	public int QUEUE_SIZE = 5; // tamanho inicial do vetor

	private int[] queue;
	private int front; // indice do inicio da fila
	private int rear; // indice do final da fila
	private int qty; // qtd elementos na fila

	public ArrayQueue() {
		this.queue = new int[QUEUE_SIZE];
		this.front = 0;
		this.rear = 0;
		this.qty = 0;
	}

	public void add(int n) {

		// verificar se o tamanho eh suficiente para adicionar elemento
		if (rear == queue.length) {
			resizeQueue();
		}
		
		queue[rear] = n;
		rear++;
		qty++;
	}

	public int remove() {

		if (isEmpty()) {
			throw new IllegalStateException("A fila esta vazia. Nao eh possivel remover elementos.");
		}

		int element = 0;
		element = queue[front];

		front = (front + 1) % queue.length;
		qty--;

		if (isEmpty()) {
			front = 0;
			rear = 0;
		}

		return element;
	}

	public boolean isEmpty() {
		return qty == 0;
	}

	public void resizeQueue() {
		QUEUE_SIZE *= 2;
		int newCapacity = QUEUE_SIZE;
		int[] newQueue = new int[newCapacity];

		// copiaremos todos os elementos antigos para a nova fila
		for (int i = 0; i < queue.length; i++) {
			newQueue[i] = queue[(i) % queue.length];
		}
		this.queue = newQueue;
	}

	public int getElement(int index) {
		return queue[index];
	}

	public int getLength() {
		return queue.length;
	}
}
