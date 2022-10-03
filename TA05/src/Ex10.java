
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número de ventas:");
		
		String strSellingsNumbers = sc.nextLine();
		
		int sellingsNumber = Integer.parseInt(strSellingsNumbers);
		
		double totalValue = 0;
		
		for (int i = 0; i < sellingsNumber; i++) {
			System.out.println("Introduce el precio de la venta " + (i+1) + ":");
			
			String strValue = sc.nextLine();
			
			double value = Double.parseDouble(strValue);
			
			totalValue += value;
		}
		
		System.out.println("Se han ganado " + totalValue + "€");
		
	}

}
