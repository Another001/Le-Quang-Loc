package baiii3;

public class Circle {
	private double bankinh;
	public void setBankinh(double x) {
		bankinh = x;
		return;
	}
	public double getDientich() {
		return bankinh * bankinh * 3.14159;
	}
	public double getChuvi() {
		return bankinh * 2 * 3.14159;
	}
}