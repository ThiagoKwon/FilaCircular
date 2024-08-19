package filaCircular;

public class FilaCircular<T> extends FilaCircularStaticMeth<T> implements FilaCircularInterface<T> {

	private int top = 0;

	private int base = 0;

	private T[] data;

	public FilaCircular(int size) {
		setData((T[]) new Long[size]);
	}

	@Override
	public void add(T data) {
		if (isFull(getData(), getTop(), getBase())) {
			throw new IllegalAccessError("Fila cheia!");
		}
		getData()[getTop()] = data;
		setTop(move(getTop(), getData()));
	}

	@Override
	public T remove() {
		if (isEmpty(getTop(), getBase()) && !isFull(getData(), getTop(), getBase())) {
			throw new IllegalAccessError("Fila já está vazia!");
		}
		T retorno = getData()[getBase()];
		getData()[getBase()] = null;
		setBase(move(getBase(), getData()));
		return retorno;
	}

	@Override
	public void clear() {
		for (int i = 0; i < getData().length; i++) {
			getData()[i] = null;
		}
		setTop(0);
		setBase(0);
	}

//===================================================================
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
	}
}
