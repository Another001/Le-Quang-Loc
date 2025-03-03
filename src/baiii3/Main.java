package baiii3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle tron = new Circle();
		Square vuong = new Square();
		Vector v = new Vector(1, 2, 3);
		Vector u = new Vector(3, 4, 5);
		Vector k = v.cong(u);
		k.inra();
		double x = scanner.nextDouble();
		tron.setBankinh(x);
		vuong.setCanh(x);
		System.out.println(tron.getDientich());
		System.out.println(vuong.getDientich());
		scanner.close();
	}
}