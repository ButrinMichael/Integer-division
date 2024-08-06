package ua.foxminded.IntegerDivision;

import static ua.foxminded.IntegerDivision.MathUtils.*;

public class Formatter {

	public String format(Result result) {

		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		int spaceCounter = 0;

		for (Step step : result.getSteps()) {
			spaceCounter++;
			if (step.quotient == 0)
				continue;
			if (isFirst) {
				formatHead(sb, result, step);
				isFirst = false;
			} else {
				formatBody(sb, spaceCounter, step);
			}
		}
		formatterRemainder(sb, result);
		return sb.toString();

	}

	private void formatHead(StringBuilder sb, Result result, Step step) {
		sb.append(String.format("_%d|%d", result.getDivident(), result.getDivisor()));
		sb.append("\n");
		sb.append(String.format(" %d%s|%s", step.getSubstrahend(),
				spacer(length(result.getDivident()) - length(step.getSubstrahend())),
				quotientSizeCheck('-', length(result.getQuotient()))));
		sb.append("\n");
		sb.append(String.format(" %s%s|%s", MathUtils.dashLine(length(step.getMinuend())),
				spacer(length(result.getDivident()) - length(step.getMinuend())), result.getQuotient()));
		sb.append("\n");
	}

	private void formatBody(StringBuilder sb, int spaceCounter, Step step) {
		sb.append(String.format("%s_%d", spacer(spaceCounter - length(step.getMinuend())), step.getMinuend()));
		sb.append("\n");
		sb.append(String.format(" %s%d", spacer(spaceCounter - length(step.getSubstrahend())), step.getSubstrahend()));
		sb.append("\n");
		sb.append(String.format(" %s%s", spacer(spaceCounter - length(step.getSubstrahend())),
				dashLine(length(step.getSubstrahend()))));
		sb.append("\n");
	}

	private void formatterRemainder(StringBuilder sb, Result result) {
		sb.append(String.format(" %s%d", spacer(length(result.getDivident()) - length(result.getRemainder())),
				result.getRemainder()));
	}
}
