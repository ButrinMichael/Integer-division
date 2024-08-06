package ua.foxminded.IntegerDivision;

import java.util.List;
import java.util.Objects;

public class Result {

	private int dividend;
	private int divisor;
	private int quotientResult;
	private int remainder;
	private List<Step> steps;

	public Result(int dividend, int divisor, int quotient, int remainder, List<Step> steps) {
		this.dividend = dividend;
		this.divisor = divisor;
		this.quotientResult = quotient;
		this.remainder = remainder;
		this.steps = steps;
	}

	public int getDivident() {
		return dividend;
	}

	public void setDivident(int divident) {
		this.dividend = divident;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	public int getQuotient() {
		return quotientResult;
	}

	public void setQuotient(int quotient) {
		this.quotientResult = quotient;
	}

	public int getRemainder() {
		return remainder;
	}

	public void setRemainder(int remainder) {
		this.remainder = remainder;
	}

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	@Override
	public String toString() {
		return "Result [dividend=" + dividend + ", divisor=" + divisor + ", quotient=" + quotientResult + ", remainder="
				+ remainder + ", steps=" + steps + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dividend, divisor, quotientResult, remainder, steps);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Result other = (Result) obj;
		return dividend == other.dividend && divisor == other.divisor && quotientResult == other.quotientResult
				&& remainder == other.remainder && Objects.equals(steps, other.steps);
	}

}
