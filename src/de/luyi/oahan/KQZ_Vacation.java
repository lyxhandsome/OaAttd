package de.luyi.oahan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KQZ_Vacation {
	private int EmployeeID;
	private String Name;
	private Date BeginDay;
	private Date EndDay;
	private String VacationType;
	private String REASON;
	
	private short PrdStatus;
	private Date ShiftDate;
	private short IsDayAdjust;
	private int PrdLen;
	private short BeginChk;
	private short EndChk;
	private int BeginSpan;
	private int EndSpan;
	private short BeginChkStatus;
	private short EndChkStatus;
	private long BeginID;
	private long EndID;
	private short ISCHECK;
	private Date createdtime;
	
	public KQZ_Vacation() {
		EmployeeID = 0;
		Name = null;
		BeginDay = null;
		EndDay = null;
		VacationType = null;
		REASON = null;
		PrdStatus = 0;
		ShiftDate = new Date();
		IsDayAdjust = 0;	
		PrdLen = 0;
		BeginChk = 0;
		EndChk = 0;
		BeginSpan = 30;
		EndSpan = 30;
		BeginChkStatus = 0;
		EndChkStatus = 0;
		BeginID = 0;
		EndID = 0;
		ISCHECK = 0;
		createdtime = new Date();
	}
	

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setBeginDay(Date beginDay) {
		BeginDay = beginDay;
	}

	public void setEndDay(Date endDay) {
		EndDay = endDay;
	}

	public void setVacationType(String vacationType) {
		VacationType = vacationType;
	}

	public void setREASON(String rEASON) {
		REASON = rEASON;
	}

	public void setPrdStatus(short prdStatus) {
		PrdStatus = prdStatus;
	}

	public void setShiftDate(Date shiftDate) {
		ShiftDate = shiftDate;
	}

	public void setIsDayAdjust(short isDayAdjust) {
		IsDayAdjust = isDayAdjust;
	}

	public void setPrdLen(int prdLen) {
		PrdLen = prdLen;
	}

	public void setBeginChk(short beginChk) {
		BeginChk = beginChk;
	}

	public void setEndChk(short endChk) {
		EndChk = endChk;
	}

	public void setBeginSpan(int beginSpan) {
		BeginSpan = beginSpan;
	}

	public void setEndSpan(int endSpan) {
		EndSpan = endSpan;
	}

	public void setBeginChkStatus(short beginChkStatus) {
		BeginChkStatus = beginChkStatus;
	}

	public void setEndChkStatus(short endChkStatus) {
		EndChkStatus = endChkStatus;
	}

	public void setBeginID(long beginID) {
		BeginID = beginID;
	}

	public void setEndID(long endID) {
		EndID = endID;
	}

	public void setISCHECK(short iSCHECK) {
		ISCHECK = iSCHECK;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public String getName() {
		return Name;
	}

	public Date getBeginDay() {
		return BeginDay;
	}

	public Date getEndDay() {
		return EndDay;
	}

	public String getVacationType() {
		return VacationType;
	}

	public String getREASON() {
		return REASON;
	}

	public short getPrdStatus() {
		return PrdStatus;
	}

	public Date getShiftDate() {
		return ShiftDate;
	}

	public short getIsDayAdjust() {
		return IsDayAdjust;
	}

	public int getPrdLen() {
		return PrdLen;
	}

	public short getBeginChk() {
		return BeginChk;
	}

	public short getEndChk() {
		return EndChk;
	}

	public int getBeginSpan() {
		return BeginSpan;
	}

	public int getEndSpan() {
		return EndSpan;
	}

	public short getBeginChkStatus() {
		return BeginChkStatus;
	}

	public short getEndChkStatus() {
		return EndChkStatus;
	}

	public long getBeginID() {
		return BeginID;
	}

	public long getEndID() {
		return EndID;
	}

	public short getISCHECK() {
		return ISCHECK;
	}

	public Date getCreatedtime() {
		return createdtime;
	}
}
