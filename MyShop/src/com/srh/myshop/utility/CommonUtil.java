package com.srh.myshop.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {
	
	
	public static String getTodaysDate(){		

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh:mm:ss");
		String returnDate = dateFormat.format(date);
		
		return returnDate;
	}
	

}
