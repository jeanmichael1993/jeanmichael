import java.util.Scanner; 
import java.util.Locale;

public class MatrizEx01{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	int m = sc.nextInt();
	int n = sc.nextInt();

	int[][] valor = new int[m][n];
	
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		
		valor[i][j] = sc.nextInt();
}

	}
	System.out.println("VALORES NEGATIVOS:");

	
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
		
		if(valor[i][j] < 0){

		System.out.println(valor[i][j]);	
		
			}
}
							
}

	

	sc.close();

	}
}