
public class Functions {
	
	// @return the return value of the Sigmoid function
	public static double sigmoid(double input) {
		return 1 / (1 - Math.pow(Math.E, -input));
	}
	
	public static double sec(double input) {
		return 1 / Math.cos(input);
	}
	
	public static double csc(double input) {
		return 1 / Math.sin(input);
	}
	
	public static double cot(double input) {
		return 1 / Math.tan(input);
	}
	
	public static double square(double input) {
		return input * input;
	}
	
}