import java.util.Scanner;
import java.util.Locale;

public class MatrizEx06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, inl, inc;
		n = sc.nextInt();
		double[] IL = new double[n];
		double[] IC = new double[n];
		double[][] A = new double[n][n];
		double soma = 0.0;
		double[] principal = new double[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				A[i][j] = sc.nextDouble();
			}
		}

		inl = sc.nextInt();
		inc = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (A[i][j] > 0) {

					soma = A[i][j] + soma;
				}
			}
		}

		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);
		System.out.print("LINHA ESCOLHIDA: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == inl) {

					IL[j] = A[i][j];

				}
			}
		}

		for (int j = 0; j < n; j++) {
			System.out.print(IL[j] + " ");
		}

		System.out.println();

		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j == inc) {

					IC[i] = A[i][j];

				}

			}
		}
		for (int j = 0; j < n; j++) {

			System.out.print(IC[j] + " ");

		}

		System.out.println();

		System.out.printf("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				principal[i] = A[i][i];

			}
			System.out.print(principal[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (A[i][j] < 0) {

					A[i][j] = Math.pow(A[i][j], 2);
				}
			}
		}
       System.out.println();
		System.out.print("MATRIZ ALTERADA:\n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.printf("%.1f ", A[i][j]);
				}
			
			System.out.println();
			}
		

		sc.close();
	}
}
