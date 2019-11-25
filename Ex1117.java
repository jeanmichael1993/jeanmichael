package atividades;

import java.util.Scanner;
import java.util.Locale;

public class Ex1117 {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] nota = new double[2];
		double media;
		
		nota[0] = sc.nextDouble();
		
		
		while(nota[0] < 0 || nota[0] > 10) {
			
		if (nota[0] > 0 && nota[0] < 11) {
			
			nota[0] = nota[0];
			
		}
		else {
			
			System.out.println("nota invalida");
			
		}
		nota[0] = sc.nextDouble();
		}
		
		nota[1] = sc.nextDouble();
		
		while(nota[1] < 0 || nota[1] > 10) {
			
		if 	(nota[1] > 0 && nota [1] < 11) {
			
			nota[1] = nota[1];
			
		}
		else {
			 
			
			System.out.println("nota invalida");
			
		}
		nota[1] = sc.nextDouble();
		}	
		
		media = (nota[0] + nota[1]) / 2;
		
		System.out.printf("media = %.2f%n", media);
		
		
		sc.close();
		
		
		
	}

}
