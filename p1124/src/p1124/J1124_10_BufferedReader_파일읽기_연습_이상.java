package p1124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import p1124_02_연습.Student;

public class J1124_10_BufferedReader_파일읽기_연습_이상 {
	// 파일 읽기
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		BufferedReader br = null;
		String data = "";
		String[] temp = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\KV006\\list.txt"));
			// 1번째

			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				temp = data.split(",");
				list.add(new Student(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]),
						Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), Double.parseDouble(temp[6]),
						Integer.parseInt(temp[7])));
			}

			System.out.println("\n [[ 성적 출력 ]]");
			System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
			System.out.println("-------------------------------------------");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", list.get(i).stuNum, list.get(i).name,
						list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg,
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
