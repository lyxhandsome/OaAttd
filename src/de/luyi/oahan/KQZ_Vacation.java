package de.luyi.oahan;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class KQZ_Vacation {
	private int EmployeeID;
	private Date BeginDay;
	private Date EndDay;
	private short VacationType;
	private String REASON;
	
	private short IsDayAdjust;
	private short ISCHECK;
	
	public KQZ_Vacation() {
		EmployeeID = 0;
		BeginDay = null;
		EndDay = null;
		VacationType = 0;
		REASON = null;
		IsDayAdjust = 1;	
		ISCHECK = 0;
	}
	
	public ArrayList<Date> getVacationday() {
		ArrayList<Date> dateArrl = new ArrayList<Date>();
		Calendar cal = Calendar.getInstance();
		cal.setTime(BeginDay);
		dateArrl.add(BeginDay);
		do {
			cal.add(Calendar.DATE, 1);
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
				cal.add(Calendar.DATE, 1);
			else
				dateArrl.add(cal.getTime());
		} while (!cal.getTime().equals(EndDay));
		
		return dateArrl;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public void setBeginDay(Date beginDay) {
		BeginDay = beginDay;
	}

	public void setEndDay(Date endDay) {
		EndDay = endDay;
	}

	public void setVacationType(String vacationType) {
		switch (vacationType) {
			case "事假":
			case "护理假":
				VacationType = 0;
				break;
			case "病假":
				VacationType = 1;
				break;
			case "年休假":
				VacationType = 2;
				break;
			case "产假":
				VacationType = 3;
				break;
			case "婚假":
				VacationType = 4;
				break;
			case "探亲假":
				VacationType = 5;
				break;
			case "丧假":
				VacationType = 6;
				break;
		}
	}

	public void setREASON(String rEASON) {
		REASON = rEASON;
	}


	public void setIsDayAdjust(short isDayAdjust) {
		IsDayAdjust = isDayAdjust;
	}


	public void setISCHECK(short iSCHECK) {
		ISCHECK = iSCHECK;
	}


	public int getEmployeeID() {
		return EmployeeID;
	}

	public Date getBeginDay() {
		return BeginDay;
	}

	public Date getEndDay() {
		return EndDay;
	}

	public short getVacationType() {
		return VacationType;
	}

	public String getREASON() {
		return REASON;
	}

	public short getIsDayAdjust() {
		return IsDayAdjust;
	}


	public short getISCHECK() {
		return ISCHECK;
	}

}
