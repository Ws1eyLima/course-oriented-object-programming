import java.util.Scanner;
import java.util.Locale;

public class uri1002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		double area, n, raio;
		
		n = 3.14159;
		raio = sc.nextDouble();
		
		area = n * Math.pow(raio, 2.0);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}
