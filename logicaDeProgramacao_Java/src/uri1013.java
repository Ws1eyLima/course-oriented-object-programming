import java.util.Locale;
import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorAB = (a + b + Math.abs(a - b)) / 2;
		int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
		
		System.out.println(maior + "eh o maior ");
		
		sc.close();
	}

}
