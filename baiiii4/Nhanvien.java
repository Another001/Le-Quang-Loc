package baiiii4;

public class Nhanvien {
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	private double LUONG_MAX;
	Nhanvien(String a, double b, double c, double d) {
		tenNhanVien = a;
		luongCoBan = b;
		heSoLuong = c;
		LUONG_MAX = d;
	}
	public double tinhLuong() {
		return heSoLuong * luongCoBan;
	}
	public void inTTin() {
		System.out.println("Ten nhan vien: " + tenNhanVien);
		System.out.println("Luong co ban: " + luongCoBan);
		System.out.println("He so luong: " + heSoLuong);
		System.out.println("Luong toi da: " + LUONG_MAX);
		return;
	}
	public boolean Tangluong(double x) {
		if(x * luongCoBan > LUONG_MAX) {
			return false;
		}
		else {
			heSoLuong = x;
			return true;
		}
	}
}