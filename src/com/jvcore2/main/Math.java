package com.jvcore2.main;

public class Math {
	public static void main(String[] args) { // hàm
		int kq = tongHaiSo(10,20);
		System.out.println(kq);
		System.out.println("END");
		hieuHaiSo(50,30,5);
		hieuHaiSo(30,20);
		hieuHaiSo(30.5,20);
		hieuHaiSo(kq,10);
		int tich = tichHaiSo(2,5);
		System.out.println(tich);
		hieuHaiSo(tich,5);
		System.out.println("thuong la " + thuongHaiSo(30,2));
	}

	// ham void
	public static int tongHaiSo(int x, int y) { // hàm (declare/định nghĩa)
		int tong = x + y;
		hieuHaiSo(50,30,5);
//		/System.out.println(tong);
		return tong;
	}
	
	public static void hieuHaiSo(int x, int y, int z) { // hàm (declare/định nghĩa)
		int hieu = x - y - z;
		return;
	}
	
	//overload: trùng tên hàm, khác tham số truyền vào
	public static void hieuHaiSo(int x, int y) { // hàm (declare/định nghĩa)
		int hieu = x - y ;
		System.out.println(hieu);
	}
	//overload: trùng tên hàm, trùng tham số nhưng khác kiểu dữ liệu của tham số truyền vào
	public static void hieuHaiSo(double x, double y) { // hàm (declare/định nghĩa)
		double hieu = x - y ;
		System.out.println(hieu);
	}
	
	public static int tichHaiSo(int x, int y){
		int tich = x * y;
		return tich;
	}
	
	public static long thuongHaiSo(int x, int y){
		long thuong = x / y;
		return thuong;
	}
}
