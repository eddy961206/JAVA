package p1124_02_연습;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class J1124_12_같이 {

	public static void main(String[] args) {
		// 글자를 문서파일로 저장 - FileWriter.
		// OutputStream은 영상 사진등 큰 데이터용.
		// Writer, Reader는 byte로 치환 필요없어
		FileWriter fw = null;
		BufferedReader br = null;
		String data = "";
		try {
			// 문서 저장
			fw = new FileWriter("C:\\Users\\KV006\\list2.txt",true); //true여야 제대로 됨. 왜그런진 모름
			for (int i = 0; i < 10; i++) {
				data = (i + 1) + "번째 줄을 저장 \r\n";
				fw.write(data);
			}

			System.out.println("파일이 저장됐습니닼");
			// 문서 저장----------------------

			
			// 문서 읽기-------------------------------
			br = new BufferedReader(new FileReader("C:\\Users\\KV006\\list2.txt"));
			while (true) {
				data = br.readLine();
				if(data == null) break;
				System.out.println(data);
			}
			
			System.out.println("출력이 완료됐습니다");
			
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
