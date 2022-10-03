
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un dia:");
		
		String day = sc.nextLine();
		sc.close();
		
		switch(day) {
			case "Lunes":
				System.out.print("Dia laborable");
				break;
			case "Martes":
				System.out.print("Dia laborable");
				break;
			case "Miercoles":
				System.out.print("Dia laborable");
				break;
			case "Jueves":
				System.out.print("Dia laborable");
				break;
			case "Viernes":
				System.out.print("Dia laborable");
				break;
			case "Sábado":
				System.out.print("Dia no laborable");
				break;
			case "Domingo":
				System.out.print("Dia no laborable");
				break;
		}

	}

}
