package de.luyi.oahan;

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
	
	public Date[] getVacationday() {
		if(BeginDay == null || EndDay == null) {
			return new Date[0];
		}
	
		long dayms = 1000*60*60*24;
		long buf = BeginDay.getTime();
		int days = (int) ((EndDay.getTime() - BeginDay.getTime())/dayms);
		Date[] dateArr = new Date[days+1];
		for(int i=0; i<days+1; i++) {
			dateArr[i] = new Date();
			dateArr[i].setTime(buf);
			buf = buf+dayms;
		}
		return dateArr;
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
