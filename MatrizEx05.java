import java.util.Scanner;
import java.util.Locale;

public class MatrizEx05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int linhas, colunas;

		linhas = sc.nextInt();
		colunas = sc.nextInt();

		int[][] A = new int[linhas][colunas];
		int[][] B = new int[linhas][colunas];
		int[][] C = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {

				A[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {

				B[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {

				C[i][j] = A[i][j] + B[i][j];

			}
		}

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {

				System.out.print(C[i][j] + " ");

			}
			System.out.println();
		}
		sc.close();
	}
}
