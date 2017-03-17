package de.luyi.oat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) throws Exception {
		Test test = new Test();
		ArrayList<Date> dayarrl = test.getDate();
		Iterator<Date> it = dayarrl.iterator();
		while (it.hasNext()) {
			Date vacday = it.next();
			System.out.println(vacday);
		}
	}

	public ArrayList<Date> getDate() throws Exception {
		ArrayList<Date> dateArrl = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		DateFormat datefmtday = new SimpleDateFormat("yyyy/MM/dd");
		Date BeginDay = datefmtday.parse("2017/03/12");
		Date EndDay = datefmtday.parse("2017/03/16");
		cal.setTime(BeginDay);
		dateArrl.add(BeginDay);
		do {
			cal.add(Calendar.DATE, 1);
			System.out.println(datefmtday.format(cal.getTime()));
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
				cal.add(Calendar.DATE, 1);
			else
				dateArrl.add(cal.getTime());
		} while (!cal.getTime().equals(EndDay));
		return dateArrl;

	}

}
