package baiii3;

public class Square {
	private double canh;
	public void setCanh(double x) {
		canh = x;
		return;
	}
	public double getDientich() {
		return canh * canh;
	}
	public double getChuvi() {
		return canh * 4;
	}
}