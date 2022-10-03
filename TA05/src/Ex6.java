
import java.util.Scanner;

public class Ex6 {
	
	static final int IVA = 21;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un precio:");
		
		String strprice = sc.nextLine();
		sc.close();
		
		double price = Double.parseDouble(strprice);
		
		System.out.println("El precio final con IVA es de " + (price + (21 * price / 100)));

	}

}
