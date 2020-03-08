package com.jvcore2.hinhhoc;

import com.jvcore2.main.ThuVienToanHoc;

public class HinhChuNhat {
	public static int chuViHinhChuNhat(int dai, int rong) {
		return ThuVienToanHoc.tichHaiSo((dai + rong), 2);
	}

	public static int dienTichHinhChuNhat(int dai, int rong) {
		return ThuVienToanHoc.tichHaiSo(dai, rong);
	}
}
