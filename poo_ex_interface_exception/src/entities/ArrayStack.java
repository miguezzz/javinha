package entities;

public class ArrayStack implements Queue {

	private int[] stack;
	private int top;
	private int size;
	private int arrayLength;

	public ArrayStack() {
		this.arrayLength = 5;
		this.stack = new int[arrayLength];
		this.top = -1;
		this.size = 0;
	}

	public void add(int n) {
		if (size == arrayLength) {
			resizeStack();
		}

		top++;
		stack[top] = n;
		size++;
	}

	public int remove() {
		if (isEmpty()) {
			throw new IllegalStateException ("Impossivel remover. Pilha vazia.");
		}
		
		int element = stack[top];
		this.top--;
		this.size--;
		return element;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void resizeStack() {
		this.arrayLength = this.arrayLength * 2; // dobramos a capacidade
		int newLength = arrayLength;
		int[] newStack = new int[newLength]; // criamos novo array com capacidade dobrada

		// passamos os elementos de uma pilha pra outra
		for (int i = 0; i < newStack.length; i++) {
			newStack[i] = stack[i % newStack.length];
		}
		this.stack = newStack; // atualizamos o ponteiro do antigo array
	}

	public int getArrayLength() {
		return arrayLength;
	}
	
	public int getSize() {
		return size;
	}
}
