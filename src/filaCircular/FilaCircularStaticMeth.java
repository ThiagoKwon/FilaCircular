package filaCircular;

public abstract class FilaCircularStaticMeth<T> {

	public int move(int position, T[] data) {
		return (position + 1) % data.length;
	}

	public boolean isFull(T[] data, int top, int base) {
		return isEmpty(top, base) && data[top] != null;
	}

	public boolean isEmpty(int top, int base) {
		return top == base;
	}

	public void exibirFila(T[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
