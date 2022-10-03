
import java.util.Scanner;
import java.lang.Math.*;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el radio:");
		
		String strradius = sc.nextLine();
		sc.close();
		
		double radius = Double.parseDouble(strradius);
		
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("El area del círculo es " + area);

	}

}
