import java.util.Scanner;

public class uri1004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = A * B;
		
		System.out.printf("PROD = %d%n", PROD);
		
		sc.close();
	}

}
