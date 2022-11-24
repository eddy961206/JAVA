package p1124_02_연습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class J1124_11_입력연습 {
	public static void main(String[] args) {
		//list2.txt에 
		//s0001,홍갈동,100,100,100,300,100.00,0 
		//s0002,유관순,90,90,90,270,90.00,0 
		FileWriter fw = null;
		String data = "";
		try {
			fw = new FileWriter("C:\\Users\\KV006\\list2.txt");
			
			data = String.format("%s,%s,%d,%d,%d,%d,%.2f,%d \r\n", "s0001","홍길동", 100,100,100,300,100.0,0);
			fw.write(data);
			data = String.format("%s,%s,%d,%d,%d,%d,%.2f,%d \r\n", "s0002","유관순", 90,90,90,270,90.0,0);
			fw.write(data);
			
			System.out.println("파일에 글자가 저장됐습니다!!!!!....");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		//출력 연습
		ArrayList<Student> list = new ArrayList<>();
		BufferedReader br = null;
		String[] temp = null;
//		String data2 = "";
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\KV006\\list2.txt"));
			
			while (true) {
				data = br.readLine();
				if(data == null) break;
				temp = data.split(",");
				list.add(new Student(temp[0],temp[1],Integer.parseInt(temp[2]),Integer.parseInt(temp[3])
						,Integer.parseInt(temp[4]),Integer.parseInt(temp[5]),Double.parseDouble(temp[6])
						,Integer.parseInt(temp[7])));
			}
			
			System.out.println("\n [[ 성적 출력 ]]");
			System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
			System.out.println("-------------------------------------------");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", 
						list.get(i).stuNum, list.get(i).name,
						list.get(i).kor, list.get(i).eng, list.get(i).math, 
						list.get(i).total, list.get(i).avg,
						list.get(i).rank);
			} // for
			System.out.println();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
