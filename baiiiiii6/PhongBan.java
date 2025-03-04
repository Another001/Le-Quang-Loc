package baiiiiii6;

import baiii3.Nhanvien;

public class PhongBan {
		private String tenPhongBan;
		private byte soNhanVien;
		public static final byte SO_NV_MAX = 100;
		private Nhanvien[] dsnv;
		public boolean themNhanVien(Nhanvien nv){
		if (soNhanVien < SO_NV_MAX) {

		dsnv[soNhanVien] = nv; soNhanVien++;
		return true;
		} else return false;

		}
		public Nhanvien xoaNhanVien(){
		if (soNhanVien > 0) {

		Nhanvien tmp = dsnv[soNhanVien-1];
		dsnv[soNhanVien-1] = null; soNhanVien--;
		return tmp;
		} else return null;

		}
		

		public PhongBan(String tenPB){

		dsnv = new Nhanvien[SO_NV_MAX];
		tenPhongBan = tenPB; soNhanVien = 0;

		}
		public double tongLuong(){
		double tong = 0.0;
		for (int i=0;i<soNhanVien;i++)

		tong += dsnv[i].tinhLuong();

		return tong;

		}
		public void inTTin(){

		System.out.println("Ten phong: "+tenPhongBan);
		System.out.println("So NV: "+soNhanVien);
		System.out.println("Thong tin cac NV");
		for (int i=0;i<soNhanVien;i++)
		dsnv[i].inTTin();

		}

}
