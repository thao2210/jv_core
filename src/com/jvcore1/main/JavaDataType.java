package com.jvcore1.main;

public class JavaDataType {
//Kiểu dữ liệu trong java
	public static void main(String[] args) {
		//Kiểu số
		//số nguyên
		int x = 10;//kieu_du_lieu ten_bien = gia_tri
		int y = 20;
		int tong = x + y;
		System.out.println(tong); //code chạy từ trên xuống dưới, phải qua trái
		int tich  = x * y;
		System.out.println(tich);
		int thuong = 205/x;
		System.out.println(thuong);
		int layDu = y % x;
		System.out.println(layDu);
		System.out.println(Integer.MAX_VALUE);
		long k = 10000000000L; 
		long tongLong = k + x;
		System.out.println(tongLong);
		//số thực
		double d = 5555.342; 
		float f = 55.666f;
		double aaa = d + f;
		System.out.println(aaa);
		
		//Ép kiểu
		int epKieu = (int) d;
		System.out.println(epKieu);
		//
		double epKieu2 = (double) 566/100; //phải ép bên phải trước bởi vì bên phải thực thi trc
		System.out.println(epKieu2);
		
		//Char
		char e = 'E';
		int keyCodeOfE = (int) e;
		char n =  (char) 78;
		System.out.println(n);
		
		//boolean: true/false
		boolean check = true;
		
		//String: kieeur doi tuong
		String s = "Doan Thu Thao";
		String s2 = s +" beautiful";
		System.out.println(s2);
	}
}
