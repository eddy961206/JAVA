package p1124;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class J1124_06_InputStream {

	// 파일 읽어오기(InputStream)
	public static void main(String[] args) {
		// C:/users/kv006/input.txt
		InputStream is = null;
		try {
			byte[] b = new byte[1024];
			is = new FileInputStream("C:\\Users\\KV006\\a.txt");
			is.read(b); //1바이트씩 읽 - b넣으면 1024바이트씩 읽.
//			System.out.println(b); //이렇게 하면 안됨. 가져온 데이터 자체가 보여짐.
			System.out.println(new String(b)); //가져온 데이터를 String으로 변환해서 콘솔에 보여줌
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				is.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
