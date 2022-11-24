package p1124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class J1124_09_BufferedReader_파일저장_복습 {

	public static void main(String[] args) {
		//파일 저장 
		FileWriter fw = null;
		String data = "";
		try {
			fw = new FileWriter("C:\\Users\\KV006\\list.txt");
			
			data = String.format("%s,%s,%d,%d,%d,%d,%.2f,%d \r\n","s0001","홍갈동",100,100,100,300,100.0,0);
			fw.write(data);
			data = String.format("%s,%s,%d,%d,%d,%d,%.2f,%d \r\n","s0002","유관순",90,90,90,270,90.0,0);
			fw.write(data);
			
			System.out.println("파일에 글자가 저장됐습니다.");
			
			
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
