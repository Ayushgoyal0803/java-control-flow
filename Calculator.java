import java.util.Scanner;

class Calculator{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Frist number: ");
		double firstNumber  = sc.nextDouble();
		
		System.out.print("Enter the Second number: ");
		double secNumber  = sc.nextDouble();
		
		System.out.print("Enter the operator: ");
		String op = sc.next();
		
		
		switch (op){
			case "+":
				System.out.println(firstNumber+secNumber);
				break;
			case "-":
				System.out.println(firstNumber-secNumber);
				break;
			case "*":
				System.out.println(firstNumber*secNumber);
				break;
			case "/":
				System.out.println(firstNumber/secNumber);
				break;
			default:
                System.out.println("Invalid Operator");
		}
	}
}