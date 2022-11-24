package p1124;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class J1124_07_filewriter {

	public static void main(String[] args) {
		Writer fw = null; //다형성
		try {
			fw = new FileWriter("C:\\Users\\KV006\\write.txt");
			for(int i = 1; i<=10; i++) {
				String data = i + "번째 줄을 저장합니다\r\n";
				fw.write(data); // 문자 저장가능-byte변경 불필요.  data.getByte(); 원랜 이렇게 했었어야하는데 얘는 그냥 이렇게 써도.
			}
			System.out.println("파일에 저장하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

//		OutputStream os = null;
//		try {
//			os = new FileOutputStream("C:\\Users\\KV006\\write.txt");
//			
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}

	}

}
