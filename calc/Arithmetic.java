package calc;

public class Arithmetic {
	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static double divide(double num1, double num2) {
		return num1 / num2;
	}

	public static double square(double num1) {
		return num1 * num1;
	}

	public static double cube(double num1) {
		return Math.pow(num1, 3);
	}

	public static double power(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	public static double mod(double num1, double num2) {
		return num1 % num2;
	}
}