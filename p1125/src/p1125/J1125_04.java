package p1125;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class J1125_04 {

	public static void main(String[] args) throws Exception {
		//파일 읽어와서 list에 담기
		ArrayList<Student> list = new ArrayList<>();
		BufferedReader br = null;
		String data = "";
		String[] temp = {};
		br = new BufferedReader(new FileReader("C:\\list.txt"));
		while (true) {
			data = br.readLine();
			if (data == null)
				break;
			temp = data.split(","); // split : 데이터를 ,로 분리해서 배열로 리턴하는 메소드.
			list.add(new Student(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]),
					Integer.parseInt(temp[4]),Integer.parseInt(temp[5]),
					Double.parseDouble(temp[6]),Integer.parseInt(temp[7])));
		}
		br.close();
		//----------------------------------------------
		int choice = 0;
		String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		String stuNum, name, checkName;
		int kor, eng, math, total, rank;
		double avg;
		int count, r_count, checkNo, flag;
		Student.count = list.size();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.성적 입력");
			System.out.println("2.성적 출력");
			System.out.println("11.성적 불러오기");
			System.out.println("12.성적 저장하기");
			System.out.println("---------------------------------");
			System.out.println("원하는 번호를 입력하세요 >>");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				while (true) {
					System.out.println("\n[성적 입력]");
					System.out.println((list.size() + 1) + "번째 학생 이름을 입력하세요.(0. 이전페이지 이동)");
					name = scan.next();
					if (name.equals("0")) {
						System.out.println("이전페이지로 이동합니다.");
						break;
					}
					System.out.println("국어점수를 입력하세요 >>");
					kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요 >>");
					eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요 >>");
					math = scan.nextInt();

					// 입력받은 데이터들로 객체 만들기
					list.add(new Student(name, kor, eng, math)); // list.size()로 학생 수 알면됨
					System.out.println(name + "학생의 성적 입력이 완료됐습니다.");
				} // while
				break;
			case 2:
				System.out.println("\n [[ 성적 출력 ]]");
				System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
				System.out.println("-------------------------------------------");
				for (int i = 0; i < list.size(); i++) {
					System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", list.get(i).stuNum, list.get(i).name,
							list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg,
							list.get(i).rank);
				} // for
				System.out.println();
				break;
				
			case 11:
				break;
				
			case 12:
				break;
			}//switch
		}//while
		
	}//main


}//class
