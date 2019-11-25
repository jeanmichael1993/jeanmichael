package atividades;

import java.util.Scanner;


public class Ex1042 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int a,b,c;
		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		if ((a < b) & (b < c)) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else if ((a < c) & (c < b)) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		else if ((b < a) & (a < c)) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		else if ((b < c) & (c < a)) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		else if ((c < a) & (a < b)) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		else {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}

			System.out.println("\n" + a);
			System.out.println(b);
			System.out.println(c);
		
		
		sc.close();
		
		
		
		
		
		
		
	}
}
