import java.util.Scanner;
import java.util.Locale;

public class Ex1051 {
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double salario, desconto1,desconto2,desconto3,descontoFinal = 0;
		
		salario = sc.nextDouble();
		
		if (salario <= 2000) {
			
			System.out.println("Isento");
		}
		
		else if (salario > 2000 && salario <= 3000) {
			
			salario = salario - 2000;
			desconto1 = salario * 0.08;
			descontoFinal = desconto1;
			System.out.printf("R$ %.2f%n", descontoFinal);
		}
		
		else if (salario > 3000 && salario <= 4500) {
			
			desconto2 = salario - 3000;
			desconto2 = desconto2 * 0.18;
			desconto1 = 1000 * 0.08;
			
			descontoFinal = desconto2 + desconto1;
			System.out.printf("R$ %.2f%n", descontoFinal);
		}
		
		else {
			
			desconto3 = salario - 4500;
			desconto3 = desconto3 * 0.28;
			desconto2 = 1500 * 0.18;
			desconto1 = 1000 * 0.08;
			
			descontoFinal = desconto2 + desconto1 + desconto3;
			System.out.printf("R$ %.2f%n", descontoFinal);
		}
		
		
		
		sc.close();
		
		
	}
}
