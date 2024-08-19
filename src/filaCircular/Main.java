package filaCircular;

public class Main {

	public static void main(String[] args) {
		FilaCircular<Long> fila = new FilaCircular<Long>(5);

		fila.add(19L);
		fila.add(18L);
		fila.remove();
		fila.add(20L);
		fila.add(21L);
		fila.remove();
		fila.add(22L);
		fila.add(23L);
		fila.remove();
		fila.add(24L);
		fila.add(69L);
		fila.remove();
		fila.add(100L);
		fila.add(200L);

	}

}
