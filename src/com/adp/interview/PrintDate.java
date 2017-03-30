package com.adp.interview;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PrintDate {

	public static void main(String[] args) {
		Date date = new Date();
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd   HH:mm:ss");
		 System.out.println(dateFormat.format(date));

	}

}
