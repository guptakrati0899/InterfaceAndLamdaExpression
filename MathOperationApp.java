package mathop;

@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);
	static void printResult(int a, int b, String function, IMathFunction fobj ) {
		System.out.println("Result of " + function + "is " + fobj.calculate(a, b));
	}
}

public class MathOperationApp {
	
	public static void main(String[] args) {
		
		IMathFunction add = (x, y) -> x + y;
		IMathFunction subtract = (x, y) -> x - y;
		IMathFunction multiply = (x, y) -> x * y;
		IMathFunction divide = (x, y) -> x / y;


		System.out.println("Addtion is " + add.calculate(5, 8));
		System.out.println("Subtraction is " + subtract.calculate(8, 5));
		System.out.println("Multiplication is " + multiply.calculate(5, 8));
		System.out.println("Division is " + divide.calculate(8, 4));
		
		IMathFunction.printResult(5, 8, "Addition ", add);
		IMathFunction.printResult(5, 8, "Subtraction ", subtract);
		IMathFunction.printResult(5, 8, "Multiplication ", multiply);
		IMathFunction.printResult(5, 8, "Division ", divide);
		
	}

}
