import java.util.Scanner;
import java.math.*;

public class Calculator {

	// global variables
	private static final Scanner scanner = new Scanner(System.in);

	/*
	 * your code comes here
	 */

	public static void main(String[] args) {
		float a = 0;
		float b = 0;
		int calc = 1;
		while (calc == 1) {
		
		
		System.out.println("Bitte Eingabe wählen, für Kommazahl bitte 1 wählen, sonst weiter mit beliebiger Taste: ");
		int eing = scanner.nextInt();
		if (eing == 1) {			
			System.out.println("Bitte ersten Wert eingeben: ");
			a = scanner.nextFloat();

			System.out.println("Bitte zweiten Wert eingeben; ");
			b = scanner.nextFloat();
		} else {
			System.out.println("Bitte ersten Wert eingeben: ");
			a = scanner.nextInt();

			System.out.println("Bitte zweiten Wert eingeben; ");
			b = scanner.nextInt();
		}
		
		System.out.println("Bitte Rechenart wählen 1 = addition, 2 = subtraktion, 3 = division, 4 = Gerade?, 5=Pythagoras");
		int rechner = scanner.nextInt();
		
		System.out.println(" rechner = " + rechner);
		switch (rechner) {
		case 1:
			Calculator.add(a,b);
			break;
		case 2:
			Calculator.sub(a, b);
			break;
		case 3:
			Calculator.div(a,b);
			break;
		case 4:
			Calculator.mod(a, b);
			break;
		case 5:
			Calculator.pytago(a, b);
			break;
		}
		System.out.println("Für neue Rechnung 1 eingeben beliebige Taste: ");
		calc = scanner.nextInt();
		if (calc != 1) {
			System.out.println("Auf Wiedersehen");
		}
		
		
		/*
		 * your code comes here
		 */

		
	}
		

		
	}

	static void add(float x, float y) {
		System.out.println("x + y = " + x + y);
	}

	static void sub(float x, float y) {
		System.out.println("x - y = " + (x-y));		
	}
	static void div(float x, float y) {
		System.out.println("x / y = " + (x/y));
	}
	static void mod(float x, float y) {
		System.out.println("x MOD y = " + (x%y));
	}
	static void pytago(float x, float y) {
		System.out.println("a² + b² = " + Math.sqrt((x*x)+(y*y)));
	}
		
}
