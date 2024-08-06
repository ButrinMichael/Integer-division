package ua.foxminded.IntegerDivision;

public final class MathUtils {

	public static String spacer(int length) {
		StringBuilder space = new StringBuilder();
		for (int i = 0; i < length; i++) {
			space.append(" ");
		}
		return space.toString();
	}

	public static String dashLine(int length) {
		StringBuilder dashLine = new StringBuilder();
		for (int i = 0; i < length; i++) {
			dashLine.append("-");
		}
		return dashLine.toString();
	}

	public static int length(int num) {
		if (num < 0) {
			return length(Math.abs(num));
		} else {
			return num < 9 ? 1 : (int) (Math.log10(num) + 1);
		}
	}

	public static String quotientSizeCheck(char a, int length) {
		StringBuilder dashLine = new StringBuilder();
		for (int i = 0; i < length; i++) {
			dashLine.append(a);
		}
		return dashLine.toString();
	}

	public static int[] parseDigits(int num) {
		int[] digits = new int[length(num)];
		int a = num;
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] = a % 10;
			a /= 10;
		}
		return digits;
	}

}
