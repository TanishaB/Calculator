public class Calculator {

	public static int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public static int sub(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	public static int mul(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Result on adding: 50 and 20 = " + add(50,20));
		
		System.out.println("Result on subtracting: 50 and 20 = " + sub(50,20));

		System.out.println("Result on multiplication: 50 and 20 = " + mul(50,20));

	}

}