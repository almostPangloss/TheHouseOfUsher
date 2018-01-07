package textBook;

public class RationalNumber {
	private int numerator;
	private int denominator = 1;
	
	public RationalNumber(int numerator, int denominator) {
		if ( denominator == 0) {
			System.out.println("Nah, brah; can't have the denominator be 0. Defualted to 1.");			
		} else {
			this.denominator = denominator;
		}
		this.numerator = numerator;
	}
	
	public RationalNumber multiplyRationalNumbers(RationalNumber rn) {
		int numerator = this.numerator * rn.numerator;
		int denominator = this.denominator * rn.denominator;
		return new RationalNumber(numerator, denominator);		
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
}
