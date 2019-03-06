
public class Vector {
	
	private double[] value;
	
	public Vector(double[] value) {
		this.value = value;
	}
	
	public Vector() {
		this.value = new double[1];
	}
	
	public void addValue(double value) {
		double[] temp = new double[this.value.length + 1];
		for (int i = 0; i < this.value.length; i++) {
			temp[i] = this.value[i];
		}
		temp[temp.length - 1] = value;
		this.value = temp;
	}
	
	public double[] getValue() {
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
}
