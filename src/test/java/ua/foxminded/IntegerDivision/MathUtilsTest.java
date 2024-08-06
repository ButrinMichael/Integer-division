package ua.foxminded.IntegerDivision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

	@Test
	void dashLine_shouldReturndashLin_whenLength1() {
		Assertions.assertEquals("-", MathUtils.dashLine(1));
	}

	@Test
	void dashLine_shouldReturndashLin_whenLength0() {
		Assertions.assertEquals("", MathUtils.dashLine(0));
	}

	@Test
	void dashLine_shouldReturndashLin_whenLength5() {
		Assertions.assertEquals("-----", MathUtils.dashLine(5));
	}

	@Test
	void dashLine_shouldReturndashLin_whenLengthMax() {
		Assertions.assertEquals("----------", MathUtils.dashLine(10));
	}

	@Test
	void length_shouldReturndashLin_whenLength1() {
		Assertions.assertEquals(1, MathUtils.length(1));
	}

	@Test
	void length_shouldReturndashLin_whenLength0() {
		Assertions.assertEquals(1, MathUtils.length(0));
	}

	@Test
	void length_shouldReturndashLin_whenLength5() {
		Assertions.assertEquals(10, MathUtils.length(2147483647));
	}

	@Test
	void length_shouldReturndashLin_whenLengthMax() {
		Assertions.assertEquals(6, MathUtils.length(123456));
	}

	@Test
	void quotientSizeCheck_shouldReturndashLin_whenLength1() {
		Assertions.assertEquals("-", MathUtils.quotientSizeCheck('-', 1));
	}

	@Test
	void quotientSizeCheck_shouldReturndashLin_whenLength0() {
		Assertions.assertEquals("", MathUtils.quotientSizeCheck('-', 0));
	}

	@Test
	void quotientSizeCheck_shouldReturndashLin_whenLength5() {
		Assertions.assertEquals("-----", MathUtils.quotientSizeCheck('-', 5));
	}

	@Test
	void quotientSizeCheck_shouldReturndashLin_whenLengthMax() {
		Assertions.assertEquals("----------", MathUtils.quotientSizeCheck('-', 10));
	}

	@Test
	void parseDigits_shouldReturnDigits_whenNum512() {
		int num = 512;
		int[] expectedDigits = { 5, 1, 2 };
		int[] actualDigits = MathUtils.parseDigits(num);
		Assertions.assertArrayEquals(expectedDigits, actualDigits);
	}

	@Test
	public void parseDigits_shouldReturnDigits_whenDigitsPositiveNumber() {
		int num = 12345;
		int[] expectedDigits = { 1, 2, 3, 4, 5 };
		int[] actualDigits = MathUtils.parseDigits(num);
		Assertions.assertArrayEquals(expectedDigits, actualDigits);
	}

	@Test
	public void parseDigits_shouldReturnDigits_whenDigitsZero() {
		int num = 0;
		int[] expectedDigits = { 0 };
		int[] actualDigits = MathUtils.parseDigits(num);
		Assertions.assertArrayEquals(expectedDigits, actualDigits);
	}

	@Test
	public void parseDigits_shouldReturnDigits_whenDigitsSingleDigit() {
		int num = 9;
		int[] expectedDigits = { 9 };
		int[] actualDigits = MathUtils.parseDigits(num);
		Assertions.assertArrayEquals(expectedDigits, actualDigits);
	}
}
