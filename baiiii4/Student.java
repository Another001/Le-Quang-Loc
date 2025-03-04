package baiiii4;
import java.util.Scanner;

public class Student {
	private String name;
	private int year;
	public Student(String name, int year){
		this.name = name;
		this.year = year;
	}
	public void change(String name, int year) {
		this.name = name;
		this.year = year;
	}
	public void get() {
		System.out.println("Ten hoc sinh: " + name);
		System.out.println("Nam: " + year);
	}
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int year = scanner.nextInt();
	String name = "Le Quang Loc";
	Student hocsinh = new Student(name, year);
	hocsinh.get();
	}
}
