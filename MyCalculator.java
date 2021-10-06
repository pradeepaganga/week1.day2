package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		//call Calculator Class and compute the values of all methods in the same
		Calculator obj1 = new Calculator();

		int addition = obj1.add(obj1.num1, obj1.num2, obj1.num3);
		int subtraction = obj1.sub(obj1.num1, obj1.num2);
		double multiplication = obj1.mul(obj1.num1, obj1.num2);
		float division = obj1.Div(obj1.num1, obj1.num2);
		System.out.println("Sum of "+obj1.num1+","+obj1.num2+","+obj1.num3+" is:"+addition);
		System.out.println("Difference of"+obj1.num1+","+obj1.num2+","+"is:"+subtraction);
		System.out.println("Multipication of"+obj1.num1+","+obj1.num2+",is:"+multiplication);
		System.out.println("Division of"+obj1.num1+","+obj1.num2+",is:"+division);

	}
}
