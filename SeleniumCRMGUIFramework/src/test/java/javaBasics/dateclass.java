package javaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateclass {

	public static void main(String[] args) {
		Date dateObj=new Date();
		//System.out.println(dateObj);
		
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String actDate = sim.format(dateObj);
		System.out.println(actDate);
		Calendar cal = sim.getCalendar();
		//-30 is date before the current date
		cal.add(Calendar.DAY_OF_MONTH, -30);
		String dateRequries = sim.format(cal.getTime());
		System.out.println(dateRequries);
		//30 is date after the current date
		cal.add(Calendar.DAY_OF_MONTH, 30);
		String dateRequries1 = sim.format(cal.getTime());
		System.out.println(dateRequries1);
		
		
		
	}

}
