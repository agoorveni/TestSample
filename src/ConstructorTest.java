
public class ConstructorTest extends ConstructorTestClass{

	public ConstructorTest() {
	this(100);
		System.out.println("I am working here for mre than 50 years");
		
	}
	
	public ConstructorTest(int age) {
	
		System.out.println("Age:" + age);
		
	}
	
	
	public static void main(String[] args) {
		ConstructorTest c= new ConstructorTest();
	}
	
}
