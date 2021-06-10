import java.util.Scanner;

public class Ejercicio9{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		int total = 0;
		double T1 = 0;
		do {
			System.out.println("\nIntroduce la temperatura 1");
			T1 = scanner.nextDouble();
			System.out.println("\nIntroduce la temperatura 2");
			double T2 = scanner.nextDouble();
			if (T1 >= 5 && T1 <= 15) {
				total += T1;
				contador++;
			} else if (T2 >= 5 && T2 <= 15) {
				total += T2;
				contador++;
			}
		} while (T1 != 0);
		double promedio = total/contador;
		System.out.println("\nEl promedio es " + promedio);
	}
}