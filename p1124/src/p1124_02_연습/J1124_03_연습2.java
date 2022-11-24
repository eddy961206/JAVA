package p1124_02_연습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class J1124_03_연습2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String data = "";
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\KV006\\list2.txt"));
			while(true) {
				data = br.readLine();
				if(data == null) break;
				System.out.println(data);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
