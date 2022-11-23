package p1123;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class J1123_10_시간 {

	public static void main(String[] args) {
		Date now = new Date();
		Calendar now2 = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 날짜를 내 맘대로 포멧 
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MM월 dd일 HH시 mm분 ss초");
		
		
		String nowTime1 = sdf1.format(now); //2022-11-23 16:27:37
		String nowTime2 = sdf1.format(now2.getTime()); //2022-11-23 16:29:45
		String nowTime3 = sdf2.format(now2.getTime()); //22년 11월 23일 16시 32분 13초

		System.out.println(nowTime1);
		System.out.println(nowTime2); 
		System.out.println(nowTime3); 
		
	}

}
