package ua.foxminded.IntegerDivision;

import java.util.Objects;

public class Step {

	final int minuend;
	final int substrahend;
	public final int quotient;

	public Step(int minuend, int substrahend, int quotient) {
		this.minuend = minuend;
		this.substrahend = substrahend;
		this.quotient = quotient;
	}

	public int getMinuend() {
		return minuend;
	}

	public int getSubstrahend() {
		return substrahend;
	}

	public int getQuotient() {
		return quotient;
	}

	@Override
	public String toString() {
		return "Step [minuend=" + minuend + ", substrahend=" + substrahend + ", quotient=" + quotient + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(minuend, quotient, substrahend);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Step other = (Step) obj;
		return minuend == other.minuend && quotient == other.quotient && substrahend == other.substrahend;
	}

}
