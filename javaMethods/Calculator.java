package javaMethods;

public class Calculator {
		
	public void add(int num1,int num2) {
		
		int sum = num1 + num2;
		System.out.println("Sum = " + sum);
	}
	
	public void subtract(int num1,int num2) {
		
		int difference = num1 - num2;
		System.out.println("Difference = " + difference);
	}

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.add(27,18);
		calc.subtract(44,22);

	}

}
