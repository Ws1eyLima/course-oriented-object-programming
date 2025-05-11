import java.util.Scanner;

public class uri1007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.printf("DIFERENCA = %d%n", diferenca);
		
		sc.close();
	}

}
