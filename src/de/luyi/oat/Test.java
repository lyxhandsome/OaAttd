package de.luyi.oat;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		test.getDate();
	}
	
	public void getDate(){
		long dayms = 1000*60*60*24;
		long buf = (new Date()).getTime();
		Date[] dateArr = new Date[3];
		int[] a = new int[3];
		
		
		dateArr[0] = new Date();
		dateArr[0].setTime(buf);
		
//		for(int i=0; i<2; i++) {
//			(dateArr[i]).setTime(buf);
//			a[i] = i;
//			buf = buf+dayms;
//			System.out.println(i);
//			System.out.println(a[i]);
//			System.out.println(dateArr[i]);
//		}
//		
//		for(int i=0; i<3; i++) {
//			System.out.println(i);
//			System.out.println(a[i]);
//			System.out.println(dateArr[i]);
//		}
	}
	
}
