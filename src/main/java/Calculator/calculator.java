package Calculator;

public class calculator {
	
	public static void main (String[] args) {

		System.out.println(addition(10d, 4d));
		System.out.println(subtract(20d, 10d));
		System.out.println(multiply(5d, 5d));
		divide(20d, 2d);

	}
	public static double addition(double num1, double num2) {
		return num1 + num2;
	}
	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static void divide(double num1, double num2) {
		if (num2 == 0) {
		System.out.println("not divisible");
		}else {
			System.out.println(num1 / num2);
		}
	}
}

