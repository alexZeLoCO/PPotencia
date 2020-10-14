import java.util.Scanner;		//IMPORTAR SCANNER
public class TestPotencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO TECLADO
		System.out.print("Introduzca la base: ");		//SOLICITA BASE
		int base = teclado.nextInt();		//ALMACENA BASE EN BASE
		System.out.print("Introduzca el exponente: ");		//SOLICITA EXPONENTE
		int exponente = teclado.nextInt();		//ALMACENA EXPONENTE EN EXPONENTE
		System.out.printf("El resultado es: %f", Math.pow(base, exponente));		//OUTPUT
		
	}

}
