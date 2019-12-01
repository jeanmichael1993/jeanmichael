import java.util.Scanner;
import java.util.Locale;

public class String05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		if(s.length()<8) {
			
			System.out.println("INVALIDA");

		}
		
		else {
			int digito = 0;
			for(int i=0; i<s.length();i++) {
				if(s.charAt(i)>='0' && s.charAt(i)<='9') {
					
					digito++;
					
				}
				
			}
			
		int letra = 0;
		for(int i=0;i<s.length();i++) {
		
			if(s.charAt(i)>= 'a' && s.charAt(i)<='z' || s.charAt(i)>= 'A' && s.charAt(i)<='Z') {
				
				letra++;
			}
		}
			
		String esp="@#&";
		int especial =0;
		for(int i=0;i<s.length();i++) {
			if(esp.indexOf(s.charAt(i))!= -1) {
				
				especial++;
			}
		}
			
		
		if(digito>0 && letra>0 && especial>0) {
			
			System.out.println("VALIDA");
			
		}
		else {
			
			System.out.println("INVALIDA");
		}
		}

		
sc.close();
	}

}
