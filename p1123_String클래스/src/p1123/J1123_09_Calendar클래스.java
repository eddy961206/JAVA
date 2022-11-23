package p1123;

import java.util.Calendar;
import java.util.Date;

public class J1123_09_Calendar클래스 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); // 현재 시간 가져옴
		// [ 일자 ]
		System.out.println("년도 : "+ today.get(Calendar.YEAR));
		System.out.println("월 : "+ (today.get(Calendar.MONTH)+1)); // 달은 0부터 11까지.
		System.out.println("일 : "+ today.get(Calendar.DATE));
		// 1-일 2-월 3-화 4-수 5-목 6-금 7-토
		System.out.println("요일 : "+ today.get(Calendar.DAY_OF_WEEK));
		
		// [ 시간 ]
		System.out.println("오전/오후 : "+ today.get(Calendar.AM_PM)); // 0오전 1오후
		System.out.println("시 : " + today.get(Calendar.HOUR));
		System.out.println("분 : " + today.get(Calendar.MINUTE));
		System.out.println("초 : " + today.get(Calendar.SECOND));
		System.out.println("밀리초 :" + today.get(Calendar.MILLISECOND));
	}

}
