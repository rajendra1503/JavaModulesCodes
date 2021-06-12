package finalModifier;

public final class FinalDemo {
	
	final int speed;
	
	public FinalDemo(int speed) {
		this.speed = speed;
	}
	
	/*public void setSpeed(int speed) {
		this.speed = speed;
	}*/
	
	final public void method1() {
		System.out.println("I am method1.");
	}

}

/*class Test extends FinalDemo
{
	public Test() {
		super(100);
	}
	
	public void method1() {
		System.out.println("I am method1.");
	}
	
}*/
