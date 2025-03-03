package baiii3;

public class Vector {
	private double a, b, c;
	Vector(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Vector cong(Vector v) {
		return new Vector(v.a + this.a, v.b + this.b, v.c + this.c);
	}
	public Vector tru(Vector v) {
		return new Vector(-v.a + this.a, -v.b + this.b, -v.c + this.c);
	}
	public double tichvohuong(Vector v) {
		return v.a * this.a + v.b * this.b + v.c * this.c;
	}
	public void inra() {
		System.out.println(a + " " + b + " " + c);
	}
}