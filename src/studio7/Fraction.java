package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public static void main(String[] args) {
		Fraction A= new Fraction(16, 128);
		Fraction B= new Fraction(1, 2);
		System.out.println(A.fractionMult(B));
		System.out.println(A.fractionAdd(B));
		System.out.println(A.fractionSimplify(A));
	}
	public Fraction(int num, int dom) {
		this.numerator= num;
		this.denominator= dom;
	}

	public String fractionMult(Fraction A) {
		double newNumerator= A.numerator * this.numerator;
		double newDenominator= A.denominator * this.denominator;
		return newNumerator +" / " + newDenominator;
	}
	public String fractionSimplify(Fraction A) {
		double newNumerator= this.numerator;
		double newDenominator= this.denominator;
		for(int i=1; i <= A.numerator; i++) {
			if (A.numerator % i == 0 && A.denominator % i == 0) {
				newNumerator = A.numerator / i;
				newDenominator = A.denominator / i;
				
			}
		}
		return newNumerator +" / " + newDenominator;
	}
	public String fractionAdd(Fraction A) {
		double newNumerator= A.numerator * this.denominator + this.numerator * A.denominator;
		double newDenominator= A.denominator * this.denominator;
		return newNumerator +" / " + newDenominator;
	}

}
