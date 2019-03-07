import java.util.ArrayList;

public class Calculate {
	
	// return An estimate of the limit of a function
	// param approaches the x value of the limit
	// param func the function the limit of is being estimated
	// param delta the level of accuracy
	public static double limEstimate(double approaches, double delta, Function func) {
		if (!(approaches == Double.POSITIVE_INFINITY || approaches == Double.NEGATIVE_INFINITY)) {
			try {
				return Double.isNaN(func.of(approaches)) ? (func.of(approaches - delta) + func.of(approaches + delta)) / 2 : func.of(approaches);
			} catch(Exception e) {
				return (func.of(approaches - delta) + func.of(approaches + delta)) / 2 ;
			}
		} else {
			return approaches == Double.POSITIVE_INFINITY ? func.of(Long.MAX_VALUE) : func.of(-Long.MAX_VALUE);
		}
	}
	
	// @return an array of doubles holding the factors of the quadratic
	// @param coeff an array of the coefficients of the quadratic in order from x^2 to the constant
	public static double[] quadFactor(double[] coeff) {
		double[] output = new double[2];
		output[0] = (-coeff[1] - Math.sqrt(Math.pow(coeff[1], 2) - (4 * coeff[0] * coeff[2]))) / (2 * coeff[0]);
		output[1] = (-coeff[1] + Math.sqrt(Math.pow(coeff[1], 2) - (4 * coeff[0] * coeff[2]))) / (2 * coeff[0]);
		return output;
	}
	
	// @return the summation of as if you were using sigma
	// @param start the n value in sigma
	// @param end the top value on sigma
	// @param func the function applied to sigma
	public static double summation(int start, int end, Function func) {
		double val = 0;
		for (int i = start; i < end + 1; i++) {
			val += func.of(i);
		}
		return val;
	}

	// @return the value of an infinite series; returns infinity if the series DNE
	public static double geometInfinite(double a, double r) {
		if (Math.abs(r) < 1) {
			return a / (1.0 - r);
		} else {
			return Double.POSITIVE_INFINITY;
		}
	}
	
	// @return a boolean based on if the input was prime
	public static boolean isPrime(int input) {
		return input == 2 || input == 3 || input == 5 || input == 7 ? true : !(input % 2 == 0 || input % 3 == 0 || input % 5 == 0 || input % 7 == 0); 
	}
	
	// @return the coefficients of a binomial in an array of Objects
	// @param binom the array of coefficients
	// @param pow the degree of the polynomial
	public static Object[] binomial(double[] binom, int pow) {
		ArrayList output = new ArrayList();
		for (int i = 0; i < pow + 1; i++) {
			output.add((combination(pow, i) * Math.pow(binom[0], pow - i) * Math.pow(binom[1], i)));
		}
		return output.toArray();
	}
	
	// @return the factorial of the input
	// @param input the input
	public static int factorial(int input) {
		int output = 1;
		for (int i = input; i > 0; i--) {
			output *= i;
		}
		return output;
	}
	
	// @return the combination of the inputs, or nCr in calculator
	// @param n the top part of the combination
	// @param r the bottom part of the combination
	public static int combination(int n, int r) {
		return factorial(n) / (factorial(r) * factorial(n - r));
	}
	
	// @return the permutation of the inputs, or nPr in calculator
	// @param n the top part of the permutation
	// @param r the bottom part of the permutation
	public static int permutation(int n, int r) {
		return factorial(n) / factorial(n - r);
	}
	
	// @return the conversion of the input to degrees
	public static double r2d(double radian) {
		return radian * (180.0 / Math.PI);
	}
	
	// @return the conversion of the input to radians
	public static double d2r(double degree) {
		return degree * (Math.PI / 180.0);
	}

}
