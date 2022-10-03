
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el operando 1:");
		
		String op1 = sc.nextLine();
		
		System.out.println("Introduce el operando 2:");
		
		String op2 = sc.nextLine();
		
		System.out.println("Introduce el signo aritmético:");
		
		String sign = sc.nextLine();
		
		double result;
		
		switch(sign) {
			case "+":
				result = Double.parseDouble(op1) + Double.parseDouble(op2);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "-":
				result = Double.parseDouble(op1) - Double.parseDouble(op2);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "*":
				result = Double.parseDouble(op1) * Double.parseDouble(op2);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "/":
				result = Double.parseDouble(op1) / Double.parseDouble(op2);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "^":
				result = Math.pow(Double.parseDouble(op1), Double.parseDouble(op2));
				JOptionPane.showMessageDialog(null, result);
				break;
			case "%":
				result = Double.parseDouble(op1) % Double.parseDouble(op2);
				JOptionPane.showMessageDialog(null, result);
				break;
		}

	}

}
