package p1124;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class J1124_05_OutputStream {

	// 파일로 저장(OutputStream)
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			// true : 원래에 추가  false : 덮어쓰기
			os = new FileOutputStream("C:\\Users\\KV006\\a.txt",true);
			for (int i = 1; i <= 10; i++) {
				String data = i+",홍길자,100,100,99\r\n"; // \r\n : 줄바꿈
				os.write(data.getBytes()); // data String을 Byte단위로 변환
			}

			System.out.println("파일이 생성됐습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
