package javaMethods;

public class Calculator1 {
	
	int num1;
	int num2;
	
	public void add(Calculator1 obj) {
		
		int sum = obj.num1 + obj.num2;
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {
		
		Calculator1 calc1 = new Calculator1();
		Calculator1 calc2 = new Calculator1();
		
		calc1.num1 = 15;
		calc1.num2 = 18;
		
		calc2.num1 = 100;
		calc2.num2 = 26;
		
		calc1.add(calc2);//126
		
		calc2.add(calc1);//33
		

	}

}
