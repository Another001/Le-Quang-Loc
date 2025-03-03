package baiiii4;

public class TestNV {
	public static void main(String[] args) {
		Nhanvien NV1 = new Nhanvien("Hoang Gia Huy", 100000, 3, 5000000);
		Nhanvien NV2 = new Nhanvien("Vu Hoang Doc", 10, 0, 0);
		System.out.println(NV1.tinhLuong());
		System.out.println(NV2.tinhLuong());
	}
}
