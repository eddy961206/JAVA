package p1124_02_연습;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class J1124_14_연습33 {

	public static void main(String[] args) throws Exception{
		ArrayList<Student> list = new ArrayList<>();
		FileWriter fw = null;
		String[] stu = new String[2];
		String data = "";
		list.add(new Student("홍길동", 100, 100, 99));
		list.add(new Student("유관순", 90, 90, 99));

		// list를 String 저장하시오.
		// list3.txt에.

		for (int i = 0; i < list.size(); i++) {
			stu[i] = String.format("%s,%d,%d,%d \r\n", list.get(i).name, list.get(i).kor, list.get(i).eng, list.get(i).math);
		}

		try {
			fw = new FileWriter("C:\\Users\\KV006\\list3.txt");

			for (int i = 0; i < stu.length; i++) {
				fw.write(stu[i]);
			}
			System.out.println("학생들 정보가 입력됐습니달");
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
