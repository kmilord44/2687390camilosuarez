public class Acumulador {
	public static void main(String[] args) {
		int[] lista = new int[100]; // Lista de números enteros que supondremos llena.
		int acumulador = 0; // Declaramos e inicializamos el acumulaador.

		for (int i = 0; i < 100; i++)
			acumulador += lista[i]; // Incrementamos el acumulador

		// Al finalizar el programa, el acumulador nos da el valor de la suma.
		System.out.println("La suma es " + acumulador);
    }
    }