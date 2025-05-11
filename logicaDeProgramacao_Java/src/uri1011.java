import java.util.Locale;
import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, PI, volume;
		raio = sc.nextDouble();
		PI = 3.14159;
		
		volume = (4.0/3) * PI * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
	}

}