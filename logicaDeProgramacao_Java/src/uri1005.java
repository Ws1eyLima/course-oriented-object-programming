import java.util.Scanner;
import java.util.Locale;

public class uri1005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double media = (A * 3.5 + B * 7.5) / 11.0;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
	}

}
