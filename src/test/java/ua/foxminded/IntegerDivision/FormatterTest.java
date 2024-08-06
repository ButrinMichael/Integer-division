package ua.foxminded.IntegerDivision;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FormatterTest {

	Formatter formatter = new Formatter();

	@Test
	void formatter_shouldReturnFormattetQuotient_whenlargeDivident() {
		String expected = "" + "_78945|4\n" + " 4    |-----\n" + " -    |19736\n" + "_38\n" + " 36\n" + " --\n"
				+ " _29\n" + "  28\n" + "  --\n" + "  _14\n" + "   12\n" + "   --\n" + "   _25\n" + "    24\n"
				+ "    --\n" + "     1";
		Result input = Calculator.divide(78945, 4);
		String actual = formatter.format(input);
		assertEquals(expected, actual);
	}

	@Test
	void formatter_shouldReturnFormattetQuotient_whenIntOutputSmall() {
		String expected = "" + "_10|9\n" + " 9 |-\n" + " --|1\n" + "  1";
		Result input = Calculator.divide(10, 9);
		String actual = formatter.format(input);
		assertEquals(expected, actual);
	}

	@Test
	void formatter_shouldReturnFormattetQuotient_whenDividentSameDivisor() {
		String expected = "" + "_4|4\n" + " 4|-\n" + " -|1\n" + " 0";
		Result input = Calculator.divide(4, 4);
		String actual = formatter.format(input);
		assertEquals(expected, actual);
	}

	@Test
	void formatter_shouldReturnFormattetQuotient_whenDividendLessThenDivisor() {
		String expected = "" + "_4|5\n" + " 0|-\n" + " -|0\n" + " 4";
		Result input = Calculator.divide(4, 5);
		String actual = formatter.format(input);
		assertEquals(expected, actual);
	}

}
