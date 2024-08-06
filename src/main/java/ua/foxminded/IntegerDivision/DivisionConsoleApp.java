package ua.foxminded.IntegerDivision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionConsoleApp {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a dividend: ");
			int dividend = Math.abs(scanner.nextInt());
			System.out.print("Enter a divisor: ");
			int divisor = Math.abs(scanner.nextInt());
			Result result = Calculator.divide(dividend, divisor);
			Formatter formater = new Formatter();
			System.out.println(formater.format(result));
		} catch (InputMismatchException e) {
			System.err.println("Input should be Integer");
		} catch (ArithmeticException e) {
			System.err.println("Divide by zero is impossible");
		}
	}

}
