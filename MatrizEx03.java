import java.util.Scanner;
import java.util.Locale;

public class MatrizEx03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		n = sc.nextInt();

		int[][] x = new int[n][n];
		int[] y = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				x[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (x[i][j] > y[i]) {

					y[i] = x[i][j];
				}

			}

			System.out.println(y[i]);
		}

		sc.close();

	}

}
