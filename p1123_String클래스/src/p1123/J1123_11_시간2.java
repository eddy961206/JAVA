package p1123;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class J1123_11_시간2 {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// 현재 시간을 가져옴
		String nowTime1 = sdf1.format(System.currentTimeMillis());
		
		LocalDateTime nowTime2 = LocalDateTime.now(); // 자바8 이후

		System.out.println(nowTime1); // 2022-11-23 16:35:45
		System.out.println(nowTime2); // 2022-11-23T16:35:45.895493300
		System.out.println(System.currentTimeMillis()); // 1669188945896
	}

}
