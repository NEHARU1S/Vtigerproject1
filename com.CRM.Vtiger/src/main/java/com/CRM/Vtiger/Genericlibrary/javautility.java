package com.CRM.Vtiger.Genericlibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class javautility {
	
	public String getdateandtime(String pattern) {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value = sdf.format(date);
		return value;
		
		
	}

}
