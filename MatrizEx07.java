import java.util.Scanner;
import java.util.Locale;

public class MatrizEx07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int fim = 0, fim2 = 0;
		int[][] qtd = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				qtd[i][j] = sc.nextInt();
			}
		}
		int linha = sc.nextInt();
		int u = m - 1;
		linha = linha - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (linha == i) {
					fim = qtd[linha][u];
				}
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = m - 1; j > 0; j--) {
				if (linha == i) {
					qtd[i][j] = qtd[i][j - 1];
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				qtd[linha][fim2] = fim;
				System.out.print(qtd[i][j] + " ");
			}

			System.out.println();

		}

		sc.close();

	}
}
