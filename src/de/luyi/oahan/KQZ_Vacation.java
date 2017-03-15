package de.luyi.oahan;

import java.util.Date;

public class KQZ_Vacation {
	private int EmployeeID;
	private int VacationType;
	private String REASON;
	private Date BeginDay;
	private Date EndDay;
	
	private short PrdStatus;
	private Date ShiftDate;
	private short IsDayAdjust;
	private Date BeginTime;
	private Date EndTime;
	private int PrdLen;
	private short BeginChk;
	private short EndChk;
	private int BeginSpan;
	private int EndSpan;
	private short BeginChkStatus;
	private short EndChkStatus;
	private Date NewBeginTime;
	private Date NewEndTime;
	private long BeginID;
	private long EndID;
	private short ISCHECK;
	private Date createdtime;
	
	public KQZ_Vacation() {
		EmployeeID = 0;
		PrdStatus = 0;
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
		ISCHECK = 1;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public void setVacationType(int vacationType) {
		VacationType = vacationType;
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

	public void setBeginTime(Date beginTime) {
		BeginTime = beginTime;
	}

	public void setEndTime(Date endTime) {
		EndTime = endTime;
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

	public void setNewBeginTime(Date newBeginTime) {
		NewBeginTime = newBeginTime;
	}

	public void setNewEndTime(Date newEndTime) {
		NewEndTime = newEndTime;
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

	public void setREASON(String rEASON) {
		REASON = rEASON;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public int getVacationType() {
		return VacationType;
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

	public Date getBeginTime() {
		return BeginTime;
	}

	public Date getEndTime() {
		return EndTime;
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

	public Date getNewBeginTime() {
		return NewBeginTime;
	}

	public Date getNewEndTime() {
		return NewEndTime;
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

	public String getREASON() {
		return REASON;
	}

	public Date getCreatedtime() {
		return createdtime;
	}

}
