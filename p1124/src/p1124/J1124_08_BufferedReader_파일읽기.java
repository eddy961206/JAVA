package p1124;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;

import p1124_02_연습.Student;

public class J1124_08_BufferedReader_파일읽기 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\KV006\\write.txt"));
//				while(true) {
//					String line = br.readLine();
//					if(line == null) break;
//					System.out.println(line);
//				}

			// 문서에 있는 글자를 ArrayList에 저장해서 출력하시오
			while (true) { //ArrayList에 저장
				String line = br.readLine();
				if (line == null)
					break;
				String[] str = line.split(",");
				list.add(new Student(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]),
						Integer.parseInt(str[4]), Integer.parseInt(str[5]), Double.parseDouble(str[6]),
						Integer.parseInt(str[7])));
			} //while
			
			//출력
			System.out.println("\n [[ 성적 출력 ]]");
			System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
			System.out.println("-------------------------------------------");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", list.get(i).stuNum, list.get(i).name,
						list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg,
						list.get(i).rank);
			} // for
			System.out.println();
			
//				// 배열로 분리를 해서 각각 1줄씩 출력을 해보세요.
//				for (int i = 0; i < str.length; i++) {
//			        String[] str = line.split(",");
//					System.out.println(str[i]);
//				}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
