package ua.foxminded.IntegerDivision;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void division_shouldReturn0_whenDivident0() {
		Result result = new Result(0, 0, 0, 0, null);
		result = Calculator.divide(0, 3);
		Assertions.assertEquals(0, result.getQuotient());

	}

	@Test
	void division_shouldReturnArithmeticException_whenDivisor0() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			Calculator.divide(6, 0);
		});
	}

	@Test
	void division_shouldReturnQuotient_whenlargeInt() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(6, 0, 0));
		steps.add(new Step(64, 63, 9));
		steps.add(new Step(18, 14, 2));
		steps.add(new Step(42, 42, 6));
		steps.add(new Step(7, 7, 1));
		steps.add(new Step(9, 7, 1));
		Result expected = new Result(648279, 7, 92611, 2, steps);
		Result actual = Calculator.divide(648279, 7);
		assertEquals(expected, actual);
	}

	@Test
	void division_shouldReturnQuotient_whenDividentAndDivisorNegative() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(3, 3, 1));
		steps.add(new Step(5, 3, 1));
		steps.add(new Step(28, 27, 9));
		Result expected = new Result(358, 3, 119, 1, steps);
		Result actual = Calculator.divide(-358, -3);
		assertEquals(expected, actual);
	}

	@Test
	void division_shouldReturnQuotient_whenDividentSmolerThenDivisor() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(19, 0, 19));
		Result expected = new Result(19, 23, 0, 19, steps);
		Result actual = Calculator.divide(19, 23);
		assertEquals(expected, actual);
	}

	@Test
	void division_shouldReturnQuotient_whenDividentEqualsDivisor() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(2, 0, 0));
		steps.add(new Step(23, 23, 1));
		Result expected = new Result(23, 23, 1, 0, steps);
		Result actual = Calculator.divide(23, 23);
		assertEquals(expected, actual);
	}

	@Test
	void division_shouldReturnQuotient_whenDividentAndDivisorSmalInt() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(6, 6, 2));
		Result expected = new Result(6, 3, 2, 0, steps);
		Result actual = Calculator.divide(6, 3);
		assertEquals(expected, actual);
	}

	@Test
	void division_shouldReturnQuotient_whenInputIsNull() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(64, 0, 64));
		Result expected = new Result(64, 30000000, 0, 64, steps);
		Result actual = Calculator.divide(64, 30000000);
		assertEquals(expected, actual);
	}

	@Test
	void division_shouldReturnQuotient_whenDivisorSameLargeAsDivident() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(3, 0, 0));
		steps.add(new Step(30, 0, 0));
		steps.add(new Step(300, 0, 0));
		steps.add(new Step(3000, 0, 0));
		steps.add(new Step(30000, 0, 0));
		steps.add(new Step(300000, 0, 0));
		steps.add(new Step(3000000, 0, 0));
		steps.add(new Step(30000000, 30000000, 1));
		Result expected = new Result(30000000, 30000000, 1, 0, steps);
		Result actual = Calculator.divide(30000000, 30000000);
		assertEquals(expected, actual);
	}

	@Test
	void division_shouldReturnQuotient_whenDividentLargeInput() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(4, 0, 0));
		steps.add(new Step(40, 40, 2));
		steps.add(new Step(5, 0, 0));
		steps.add(new Step(50, 40, 2));
		steps.add(new Step(100, 100, 5));
		steps.add(new Step(0, 0, 0));
		steps.add(new Step(0, 0, 0));
		steps.add(new Step(0, 0, 0));
		steps.add(new Step(0, 0, 0));
		Result expected = new Result(405000000, 20, 20250000, 0, steps);
		Result actual = Calculator.divide(405000000, 20);
		assertEquals(expected, actual);

	}

	@Test
	void division_shouldReturnQuotient_whenDividentIsMaxInt() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(2, 0, 0));
		steps.add(new Step(21, 0, 0));
		steps.add(new Step(214, 0, 0));
		steps.add(new Step(2147, 0, 0));
		steps.add(new Step(21474, 0, 0));
		steps.add(new Step(214748, 0, 0));
		steps.add(new Step(2147483, 1234565, 1));
		steps.add(new Step(9129186, 8641955, 7));
		steps.add(new Step(4872314, 3703695, 3));
		steps.add(new Step(11686197, 11111085, 9));

		Result expected = new Result(2147483647, 1234565, 1739, 575112, steps);
		Result actual = Calculator.divide(2147483647, 1234565);
		assertEquals(expected, actual);

	}

	@Test
	void division_shouldReturnQuotient_whenDividentIsMinInt() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new Step(2, 0, 0));
		steps.add(new Step(21, 0, 0));
		steps.add(new Step(214, 0, 0));
		steps.add(new Step(2147, 0, 0));
		steps.add(new Step(21474, 0, 0));
		steps.add(new Step(214748, 0, 0));
		steps.add(new Step(2147483, 1234565, 1));
		steps.add(new Step(9129186, 8641955, 7));
		steps.add(new Step(4872314, 3703695, 3));
		steps.add(new Step(11686197, 11111085, 9));

		Result expected = new Result(2147483647, 1234565, 1739, 575112, steps);
		Result actual = Calculator.divide(-2147483647, 1234565);
		assertEquals(expected, actual);

	}
}
