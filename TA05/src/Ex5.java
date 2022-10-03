
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		
		String strnumber = sc.nextLine();
		sc.close();
		
		double number = Double.parseDouble(strnumber);
		
		if (number % 2 == 0) {
			System.out.println("El número " + number + " SI és divisible entre 2");
		}
		else {
			System.out.println("El número " + number + " NO és divisible entre 2");
		}

	}

}
