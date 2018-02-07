//Alex Soloviev
//12-19-17

package fracCalc;

public class Fraction {

	private int numerator = 0;
	private int denominator = 1;
	private int whole = 0;
	
	//Constructor that takes a string as a parameter
	public Fraction (String operand) {
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
		toImproper();
	}
	
	public Fraction() {
		this(0,1,0);
	}
	
	public Fraction (int numerator, int denominator) {
		this(numerator, denominator, 0);
	}
	public Fraction (int numerator, int denominator, int whole) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.whole = whole;
		toImproper();
	}
	public Fraction (Fraction frac) {
		this(frac.getNumerator(),frac.getDenominator(), frac.getWholeNumber());
	}
	public Fraction add(Fraction operand2) {
		Fraction result = new Fraction();
		result.setNumerator(this.numerator * operand2.getDenominator() + operand2.getNumerator() * this.denominator);
		result.setDenominator(this.denominator * operand2.getDenominator());
		return result;
	}
	//Used for subtraction
	public void changeSign() {
		if(whole == 0) {
			numerator *= -1;
		}else {
			whole *= -1;
		}
	}
	
	public Fraction multiply(Fraction operand2) {
		Fraction result = new Fraction(this.numerator *operand2.getNumerator(), this.denominator * operand2.getDenominator());
		return result;
	}
	
	//Used for division
	public void reciprocate() {
		if(numerator < 0) {	
			denominator *= -1;
			numerator *= -1;
		}
		int temp = numerator;
		numerator = denominator;
		denominator = temp;
	}
	
	public void toImproper() {
		if(whole < 0 && numerator > 0) {
			numerator *= -1;
		}
		numerator = whole * denominator + numerator;
		whole = 0;
	}

	public void toMixedNumber() {
		whole = numerator/denominator + whole;
		if(whole != 0) { 
			numerator = Math.abs(numerator);
		}
		numerator = numerator % denominator;
	}

	public void simplify() {
		toMixedNumber();
		int gcf = findGCF(numerator, denominator);
		numerator /= gcf;
		denominator /= gcf;
	}
	//getters and setters 
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getWholeNumber() {
		return whole;
	}

	public void setWholeNumber(int wholeNumber) {
		this.whole = wholeNumber;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	//Returns the greatest common factor 
	public static int findGCF(int num1, int num2) {
		num1 = Math.abs(num1);
		num2 = Math.abs(num2);
		for(int i = num1; i > 1; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return 1;
	}
	//Checks if denominator is 0
	public boolean isDenominatorZero() {
		if(denominator == 0) 
			return true;
		else 
			return false;
	}

	public String toString() {
		toMixedNumber();
		if(whole == 0) {
			if(numerator == 0) {
				return "0";
			}
			return numerator + "/" + denominator;
		}
		if(numerator == 0) {
			return "" + whole;
		}
		return whole + "_" + numerator + "/" + denominator;
	}


}