package com.trungtamjava.main;

import java.text.DecimalFormat;

import com.trungtamjava.model.BaoVe;
import com.trungtamjava.model.KeToan;
import com.trungtamjava.model.LeTan;

public class MainSalary {
public static void main(String[] args) {
    DecimalFormat convertVal = new DecimalFormat("#");
    convertVal.setMaximumFractionDigits(9);
	double totalSalSec = BaoVe.secuSalary(18.5);
	double totalSalRep = LeTan.recepSalary(190);
	double totalSalAcc = KeToan.accountSalary(200);
	System.out.println(convertVal.format(totalSalSec));
	System.out.println(convertVal.format(totalSalRep));
	System.out.println(convertVal.format(totalSalAcc));
}
}
