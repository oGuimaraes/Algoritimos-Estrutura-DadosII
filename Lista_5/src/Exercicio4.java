
public class Exercicio4 {

	public static void main(String[] args) {

		long value = 3;
		long multiplicador = 715827881;
		System.out.println("[Mul Iterativo Sem Impressão] = Tempo Execução: "
				+ calcTempoIteSemImpressao(value, multiplicador) + "ms\n");
		System.out.println("[Mul Iterativo Com Impressão] = Tempo Execução: "
				+ calcTempoIteComImpressao(value, multiplicador) + "ms\n");
		System.out.println("[Mul Recursivo Sem Impressão] = Tempo Execução: "
				+ calcTempoRecSemImpressao(value, multiplicador) + "ms\n");
		System.out.println("[Mul Recursivo Com Impressão] = Tempo Execução: "
				+ calcTempoRecComImpressao(value, multiplicador) + "ms\n");

	}

	public static long multiplicadorIterativo(long a, long b) {
		long total = 0;

		for (int i = 0; i < b; i++) {
			total += a;
		}

		return total;
	}

	private static long calcTempoIteSemImpressao(long a, long b) {
		long start = System.currentTimeMillis();

		multiplicadorIterativo(a, b);

		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

	private static long calcTempoIteComImpressao(long a, long b) {
		long start = System.currentTimeMillis();

		System.out.println("Resultado: " + multiplicadorIterativo(a, b));

		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

	static long multiplicadorRecursivo(long a, long b) {
		if (b <= 0) {
			b = -b;
			a = -a;
			if (b == 0) {
				return b;
			}
		}
		if (b > 1) {
			a += multiplicadorRecursivo(a, --b);
		}
		return a;
	}

	static long multiplica(long x, long y) {
		return (x > 0 && y > 1) ? x += multiplica(x, --y) : (y == 0) ? 0 : x;
	}

	private static long calcTempoRecComImpressao(long a, long b) {
		long start = System.currentTimeMillis();

		System.out.println("Resultado: " + multiplica(a, b));

		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		return timeElapsed;
	}

	private static long calcTempoRecSemImpressao(long a, long b) {
		long start = System.currentTimeMillis();

		multiplica(a, b);

		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		return timeElapsed;
	}
}
