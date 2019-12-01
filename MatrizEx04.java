import java.util.Scanner;
import java.util.Locale;

public class MatrizEx04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		int[][] m = new int[n][n];
		int soma = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = sc.nextInt();
			}

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j > i) {

					soma = m[i][j] + soma;

				}
			}

		}

		System.out.println(soma);

		sc.close();

	}

}
