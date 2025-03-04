package baiiiii5;

public class Nhanvien {
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	private double LUONG_MAX;
	private static int dem = 0;
	public Nhanvien(String a, double b, double c, double d) {
		tenNhanVien = a;
		luongCoBan = b;
		heSoLuong = c;
		LUONG_MAX = d;
		dem ++;
	}
	public Nhanvien(){
		dem ++;
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
	public static double tinhTongLuong(Nhanvien... Nhanviens) {
        double sum = 0;
        for (Nhanvien nv : Nhanviens) {
            sum += nv.tinhLuong();
        }
        return sum;
    }
}
