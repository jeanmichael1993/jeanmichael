import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		mostrarCabecalho();
		mostrarDisciplinas();

	}

	/**
	 * Imprime na tela um cabe�alho com seus dados acad�micos tais como seu nome,
	 * n�mero de matr�cula, ano, turno
	 */
	public static void mostrarCabecalho() {

		System.out.println("jean");
		System.out.println("99151");
		System.out.println("2019");
		System.out.println("noturno");

	}

	/**
	 * Imprime na tela os nomes e cargas hor�rias das disciplinas do primeiro
	 * semestre do seu curso
	 */
	public static void mostrarDisciplinas() {

		System.out.println("Sistemas operacionais , 400 horas");
		System.out.println("Logica de programa��o, 400 horas");
		System.out.println("Ingles instrumental, 400 horas");
		System.out.println("Metodologia, 400 horas");

	}

}
