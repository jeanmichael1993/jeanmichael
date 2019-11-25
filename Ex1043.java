package atividades;

import java.util.Locale; 
import java.util.Scanner;

public class Ex1043 {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, total, area;
		
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		if((b - c) < a && a < (b + c) && (a - c) <b && b <  (a + c) && (a - b) < c && c < (a + b)) {
			
			total = a + b + c;
			
			System.out.printf("Perimetro = %.1f%n", total);
		}
		else {
			
			area = ((a + b) * c) / 2;
			
			System.out.printf("Area = %.1f%n", area);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}
