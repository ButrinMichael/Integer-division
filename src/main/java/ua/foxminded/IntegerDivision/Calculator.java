package ua.foxminded.IntegerDivision;

import java.util.ArrayList;
import java.util.List;
import static ua.foxminded.IntegerDivision.MathUtils.*;

public class Calculator {

	public static Result divide(int dividend, int divisor) {

		divisor = Math.abs(divisor);
		dividend = Math.abs(dividend);
		List<Step> steps = new ArrayList<>();
		int result = 0;
		int difference = 0;
		int minuend = 0;
		int substrahend = 0;
		int remainder = dividend % divisor;
		int quotientResult = dividend / divisor;

		if (divisor > dividend) {
			minuend = dividend;
			result = minuend - substrahend;
			Step step = new Step(minuend, substrahend, result);
			steps.add(step);
		} else {
			for (int digit : parseDigits(dividend)) {
				minuend = difference * 10 + digit;
				result = minuend / divisor;
				substrahend = result * divisor;
				difference = minuend - substrahend;
				Step step = new Step(minuend, substrahend, result);
				steps.add(step);

			}

		}

		return new Result(dividend, divisor, quotientResult, remainder, steps);

	}

}
