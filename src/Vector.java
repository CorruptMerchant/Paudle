
public class Vector {
	
	private double[] value;
	
	public Vector(double[] value) {
		this.value = value;
	}
	
	public Vector(int length) {
		this.value = new double[length];
	}
	
	public void addValue(double value) {
		double[] temp = new double[this.value.length + 1];
		for (int i = 0; i < this.value.length; i++) {
			temp[i] = this.value[i];
		}
		temp[temp.length - 1] = value;
		this.value = temp;
	}
	
	public double[] toArray() {
		return value;
	}
	
	public void setValue(double[] val) {
		this.value = val;
	}
	
	public void setPosition(double value, int position) {
		this.value[position] = value;
	}
	
	public double getPosition(int position) {
		return this.value[position];
	}
	
	public void resize(int size) {
		double[] temp = this.value;
		this.value = new double[size];
		int a = 0;
		for (double i : temp) {
			this.value[a] = i;
			a++;
		}
	}
	
	public int length() {
		return value.length;
	}
	
	public String toString() {
		String output = "";
		for (double i : this.value) {
			output += i + " ";
		}
		return output;
	}
	
	public Vector add(Vector vect) {
		Vector output = new Vector(this.value.length);
		for (int i = 0; i < this.value.length; i++) {
			output.setPosition(this.value[i] + vect.toArray()[i], i);
		}
		return output;
	}
	
	public Vector subtract(Vector vect) {
		Vector output = new Vector(this.value.length);
		for (int i = 0; i < this.value.length; i++) {
			output.setPosition(this.value[i] - vect.toArray()[i], i);
		}
		return output;
	}
	
	public Vector multiply(Vector vect) {
		Vector output = new Vector(this.value.length);
		for (int i = 0; i < this.value.length; i++) {
			output.setPosition(this.value[i] * vect.toArray()[i], i);
		}
		return output;
	}
	
	public Vector divide(Vector vect) {
		Vector output = new Vector(this.value.length);
		for (int i = 0; i < this.value.length; i++) {
			output.setPosition(this.value[i] / vect.toArray()[i], i);
		}
		return output;
	}
	
	public Vector mod(Vector vect) {
		Vector output = new Vector(this.value.length);
		for (int i = 0; i < this.value.length; i++) {
			output.setPosition(this.value[i] % vect.toArray()[i], i);
		}
		return output;
	}

}
