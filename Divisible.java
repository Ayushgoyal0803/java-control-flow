import java.util.Scanner;

class Divisible{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n = scn.nextInt();
		
		if(n%5==0){
			System.out.println("Is the number " + n + " divisible by 5? Yes ");
		}
		else{
			System.out.println("Is the number " + n + " divisible by 5? No ");
		}
				
	}

}