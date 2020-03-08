package com.jvcore2.mainx;

import com.jvcore2.main.ThuVienToanHoc;

public class Main {
public static void main(String[] args) {
	int a = 10;
	int b = 20;
	double c = 10.8;
	double d = 2.5;
	
	int tong  = ThuVienToanHoc.tongHaiSo(a, b);
	double tongD = ThuVienToanHoc.tongHaiSo(c, d);
	int hieu = ThuVienToanHoc.hieuHaiSo(a, b);
	double hieuD = ThuVienToanHoc.hieuHaiSo(c, d);
	
	System.out.println("tong = " + tong);
	System.out.println("tong = " + tongD);
	System.out.println("hieu = " + hieu);
	System.out.println("hieu = " + hieuD);
}
}
