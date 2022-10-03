
import java.util.Scanner;

public class Ex12 {
	
	static final String PASSWORD = "asdfg";

	public static void main(String[] args) {
		
		int tries = 3;
		
		while (tries > 0) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce la contraseña:");
			
			String password = sc.nextLine();
			
			if (password.equals(PASSWORD)) {
				System.out.println("Enhorabuena");
				break;
			}
			
			else {
				tries--;
			}
			
		}
		
	}

}
