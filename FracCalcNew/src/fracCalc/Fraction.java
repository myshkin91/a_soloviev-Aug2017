package fracCalc;

public class Fraction {

	private int numerator;
	private int denominator;
	private int whole;
	public Fraction(String fractionStr) {
		parsingMethod(fractionStr);
	}
	private void parsingMethod(String operand) {
		int numerator = 0;
		int denominator = 1;
		int whole = 0;
		if (operand.contains("/") && operand.contains("_")) {
			numerator = (Integer.parseInt(operand.split("_")[1].split("/")[0]));
			denominator = (Integer.parseInt(operand.split("/")[1]));
			whole = (Integer.parseInt(operand.split("_")[0]));
		} else if (operand.contains("/") && !(operand.contains("_"))) {
			numerator = (Integer.parseInt(operand.split("/")[0]));
			denominator = (Integer.parseInt(operand.split("/")[1]));
		} else {
			whole = Integer.parseInt(operand);
		}
		if (whole < 0) {
			numerator *= -1;
		}
		numerator = whole * denominator + numerator;
		int[] operandParts = { numerator, denominator };
	}
}
