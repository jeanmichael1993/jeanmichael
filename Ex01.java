import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		mostrarCabecalho();
		mostrarDisciplinas();

	}

	/**
	 * Imprime na tela um cabeçalho com seus dados acadêmicos tais como seu nome,
	 * número de matrícula, ano, turno
	 */
	public static void mostrarCabecalho() {

		System.out.println("jean");
		System.out.println("99151");
		System.out.println("2019");
		System.out.println("noturno");

	}

	/**
	 * Imprime na tela os nomes e cargas horárias das disciplinas do primeiro
	 * semestre do seu curso
	 */
	public static void mostrarDisciplinas() {

		System.out.println("Sistemas operacionais , 400 horas");
		System.out.println("Logica de programação, 400 horas");
		System.out.println("Ingles instrumental, 400 horas");
		System.out.println("Metodologia, 400 horas");

	}

}
