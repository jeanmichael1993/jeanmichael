import java.util.Scanner; 
import java.util.Locale;

public class MatrizEx02{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	
	int n;
	n = sc.nextInt();
	int[][] valor = new int[n][n];
	int[] soma = new int[n];


	for(int i=0;i<n;i++){
	   for(int j=0;j<n;j++){
		
	valor[i][j] = sc.nextInt();
	
	soma[i] = valor[i][j] + soma[i];

		}

	

	}
	 for(int i=0;i<n;i++){
	     
	     System.out.println(soma[i]);

	 }

	

	sc.close();

	}
}