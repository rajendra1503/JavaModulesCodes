package javaMethods;

import java.util.Scanner;

public class Square {
	
	public void calculateSquare(int num1) {//int num1 is a parameter
				
		System.out.println(num1*num1);
	}

	public static void main(String[] args) {
		
		Square square = new Square();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int num = scanner.nextInt();
		
		square.calculateSquare(num);//argument is an actual value which we pass to the method at the time of calling the method
		scanner.close();

	}

}
