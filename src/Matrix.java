
public class Matrix {
	
	Vector[] value;
	
	public Matrix(Vector[] vects) {
		this.value = vects;
	}
	
	public Matrix(int y, int x) {
		this.value = new Vector[y];
		for (Vector i : this.value) {
			i = new Vector(x);
		}
	}
	
	public void setPosition(int y, int x, double val) {
		this.value[y].setPosition(val, x);
	}
	
	public void setRow(int y, Vector val) {
		this.value[y] = val;
	}
	
	public double getPosition(int y, int x) {
		return this.value[y].getPosition(x);
	}
	
	public Vector getRow(int y) {
		return this.value[y];
	}
	
	public Vector[] getValue() {
		return this.value;
	}
	
	public Matrix add(Matrix m) {
		Matrix output = new Matrix(this.value.length, this.getRow(0).length());
		for (int i = 0; i < this.value.length; i++) {
			output.setRow(i, this.getRow(i).add(m.getRow(i)));
		}
		return output;
	}
	
	public Matrix subtract(Matrix m) {
		Matrix output = new Matrix(this.value.length, this.getRow(0).length());
		for (int i = 0; i < this.value.length; i++) {
			output.setRow(i, this.getRow(i).subtract(m.getRow(i)));
		}
		return output;
	}
	
	public Matrix multiply(Matrix m) {
		Matrix output = new Matrix(this.value.length, this.getRow(0).length());
		for (int i = 0; i < this.value.length; i++) {
			output.setRow(i, this.getRow(i).multiply(m.getRow(i)));
		}
		return output;
	}
	
	public Matrix divide(Matrix m) {
		Matrix output = new Matrix(this.value.length, this.getRow(0).length());
		for (int i = 0; i < this.value.length; i++) {
			output.setRow(i, this.getRow(i).divide(m.getRow(i)));
		}
		return output;
	}
	
	public Matrix mod(Matrix m) {
		Matrix output = new Matrix(this.value.length, this.getRow(0).length());
		for (int i = 0; i < this.value.length; i++) {
			output.setRow(i, this.getRow(i).mod(m.getRow(i)));
		}
		return output;
	}
	
	public int getArea() {
		return this.value.length * this.getRow(0).length();
	}
	
	public int getYLength() {
		return this.value.length;
	}
	
	public int getXLength() {
		return this.getRow(0).length();
	}
	
	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i < this.getYLength(); i++) {
			for (int a = 0; a < this.getXLength(); a++) {
				output += " " + this.getPosition(i, a);
			}
			output += "\n";
		}
		return output;
	}
}
