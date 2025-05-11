import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int kmPercorrido = sc.nextInt();
		double consumo = sc.nextDouble();
		
		double consumoMedio = kmPercorrido / consumo;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		sc.close();
	}

}
