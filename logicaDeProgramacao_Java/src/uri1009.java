import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double vendasEfetuadas = sc.nextDouble();
		
		double comissao = vendasEfetuadas * 0.15;
		double pagamento = salarioFixo + comissao;
		
		System.out.printf("TOTAL = R$ %.2f%n", pagamento);
		
		sc.close();
	}

}
