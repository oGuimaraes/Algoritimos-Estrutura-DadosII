import javax.swing.JOptionPane;

public class Exercicio2{

	public static long fatorialIteSemImpressao(int num) {
		long fat = 1;
		for (int i = 2; i <= num; i++) {
			fat *= i;
		}
		return fat;
	}

	private static long calcTempoIteSemImpressao(int n) {
		long start = System.nanoTime();

		fatorialIteSemImpressao(n);

		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

	public static long fatorialIteComImpressao(int num) {
		long fat = 1;

		for (int i = 2; i <= num; i++) {
			fat *= i;
		}
		return fat;
	}

	private static long calcTempoIteComImpressao(int n) {
		long start = System.nanoTime();

		System.out.print("\nFatorial de " + n + " é " + fatorialIteComImpressao(n));

		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

	public static long fatorialRecSemImpressao(int num) {
		long fat = 0;

		if (num <= 1) {
			return fat = 1;
		} else {
			return fat = (num - 1) * num;
		}

	}

	private static long calcTempoRecSemImpressao(int n) {
		long start = System.nanoTime();

		fatorialRecSemImpressao(n);

		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

	private static long calcTempoRecComImpressao(int n) {
		long start = System.nanoTime();

		System.out.print("\nFatorial de " + n + " é " + fatorialRecComImpressao(n));

		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

	private static long fatorialRecComImpressao(long n) {

		if (n == 0) {
			return 1;
		} else {
			return n * fatorialRecComImpressao(n - 1);
		}

	}
   
   public static void main(String[] args) {

		for (int i = 0; i <= 60; i++) {
			System.out.println("========================================================");
			System.out.println(
					"Iterativo Sem Impressao: (Tempo de execução : " + calcTempoIteSemImpressao(i) + " nano segundos)");
			System.out.println("\nIterativo Com Impressao: (Tempo de execução : " + calcTempoIteComImpressao(i)
					+ " nano segundos)");
			System.out.println("\nRecursivo Sem Impressao (Tempo de execução : " + calcTempoRecSemImpressao(i)
					+ " nano segundos)");
			System.out.println(
					"\nRecursivo Com Impressao (Tempo de execução : " + calcTempoRecComImpressao(i) + " nanosegundos)");
			System.out.println("========================================================");
			System.out.println();
		}

	}
}
