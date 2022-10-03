
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		
		String name = sc.nextLine();
		sc.close();
		
		JOptionPane.showMessageDialog(null, "Bienvenido " + name);
		
	}

}
