package 성적프로그램_최종시험연습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StuCal {
	static Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<>();
	String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	String name;
	int kor, eng, math, total, choice, rank, count, flag, checkNum;
	double avg;

	public StuCal() {
	}

	// 메인화면 출력 메소드
	int print_main() {
		System.out.println("\n [ 성적 처리 프로그램 ] ");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 학생 검색");
		System.out.println("4. 성적 수정");
		System.out.println("5. 등수 계산");
		System.out.println("6. 파일로 저장");
		System.out.println("7. 파일 불러오기");
		System.out.println("0. 프로그램 종료");
		System.out.println("-----------------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		return choice;
	}// 메인화면 출력 메소드

	// 1. 성적입력 메소드
	void input_score() {
		while (true) {
			System.out.println((list.size() + 1) + "번째 학생의 이름을 입력하세요 : (0.뒤로가기)");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				return;
			}
			System.out.println("국어점수를 입력하세요 : ");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요 : ");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요 : ");
			math = scan.nextInt();
			Student s = new Student(name, kor, eng, math);
			list.add(s);
			System.out.println(s.name + "학생의 성적 입력이 완료됐습니다.");
		} // while
	}// 1. 성적입력 메소드

	// 2. 성적출력 메소드
	void print_score() {
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수\n");
		System.out.println("------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", list.get(i).stuNum, list.get(i).name,
					list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg,
					list.get(i).rank);
		}
	} // 2. 성적출력 메소드

	// 3. 학생검색 메소드
	void student_search() {
		System.out.println("[[ 학생 검색 ]]");
		System.out.println("검색할 학생의 이름의 일부 또는 전체를 입력하세요 : ");
		scan.nextLine();
		name = scan.nextLine();
		System.out.println("\n [[ 성적 출력 ]]");
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-------------------------------------------");
		count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.contains(name)) {
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", list.get(i).stuNum, list.get(i).name,
						list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg,
						list.get(i).rank);
				count++;
			} // if
		} // for
		System.out.printf("찾고자 하는 학생 [ %d ] 명이 검색됐습니다. \n", count);
	} // 3. 학생검색 메소드

	// 4. 성적 수정 메인 메소드
	void edit_main() {
		ArrayList<Integer> sameList = new ArrayList<>(); 
		System.out.println("수정할 학생의 이름을 입력하세요 : ");
		scan.nextLine();
		name = scan.nextLine();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.equals(name)) {
				sameList.add(i);
				flag = 1;
			}
		}
		
		if(sameList.size()>1) {
			System.out.printf("%d명의 %s학생이 검색됐습니다.\n",sameList.size(),name);
			System.out.printf("어느 학생을 선택하시겠습니까? \n");
			for (int i = 0; i < sameList.size(); i++) {
				System.out.printf("%d. 학번 : %s \t 이름 : %s\n",i+1,list.get(sameList.get(i)).stuNum,name);
			}
			choice = scan.nextInt();
			sameList.set(0, sameList.get(choice-1));
		} else if (sameList.size()==1) {
			System.out.println(name + "학생이 검색됐습니다.");
		}
		
		if (flag == 0) {
			System.out.println(name + "학생을 찾을 수 없습니다. 다시 시도하세요.");
			return;
		}
		flag = 0;

		edit_score(sameList.get(0));

	}// 4. 성적 수정 메인 메소드

	// 4-2. 점수 수정 메소드
	void edit_score(int checkNum) {
		System.out.printf("\n[%s학생(학번: %s) 성적 수정]\n", list.get(checkNum).name,list.get(checkNum).stuNum);
		System.out.println("1. 국어성적 수정");
		System.out.println("2. 영어성적 수정");
		System.out.println("3. 수학성적 수정");
		System.out.println("0. 뒤로가기");
		System.out.println("--------------------------");
		System.out.println("원하는 번호를 입력하세요 : ");
		choice = scan.nextInt();

		switch (choice) {
		case 1: // 1. 국어성적 수정
			System.out.printf("현재 %s 학생의 %s점수 : %d\n", list.get(checkNum).name, title[2], list.get(checkNum).kor);
			System.out.printf("원하는 %s 점수를 입력하세요 : \n", title[2]);
			list.get(checkNum).kor = scan.nextInt();
			System.out.printf("%s학생의 %s점수가 %d점으로 변경되었습니다.\n", list.get(checkNum).name, title[2],
					list.get(checkNum).kor);
			break;
		case 2: // 2. 영어성적 수정
			System.out.printf("현재 %s 학생의 %s점수 : %d\n", list.get(checkNum).name, title[3], list.get(checkNum).eng);
			System.out.printf("원하는 %s 점수를 입력하세요 : \n", title[3]);
			list.get(checkNum).eng = scan.nextInt();
			System.out.printf("%s학생의 %s점수가 %d점으로 변경되었습니다.\n", list.get(checkNum).name, title[3],
					list.get(checkNum).eng);
			break;
		case 3: // 3. 수학성적 수정
			System.out.printf("현재 %s 학생의 %s점수 : %d\n", list.get(checkNum).name, title[4], list.get(checkNum).math);
			System.out.printf("원하는 %s 점수를 입력하세요 : \n", title[4]);
			list.get(checkNum).math = scan.nextInt();
			System.out.printf("%s학생의 %s점수가 %d점으로 변경되었습니다.\n", list.get(checkNum).name, title[4],
					list.get(checkNum).math);
			break;
		case 0: // 0. 뒤로가기
			System.out.println("수정을 취소합니다.");
			break;
		}// switch
		list.get(checkNum).total = list.get(checkNum).kor + list.get(checkNum).eng + list.get(checkNum).math;
		list.get(checkNum).avg = list.get(checkNum).total / 3.0;
	}// 4-1. 점수 수정 메소드

	// 5. 등수계산 메소드
	void ranking() {
		for (int i = 0; i < list.size(); i++) {
			rank = 1;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).total < list.get(j).total) {
					rank++;
				}
			}
			list.get(i).rank = rank;
		}
		System.out.println("등수 계산이 완료됐습니다.");
	} // 5. 등수계산 메소드

	// 6. 파일 저장 메소드
	void save() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Users\\skyku\\Student.txt");
			for (int i = 0; i < list.size(); i++) {
				fw.write(list.get(i).toString());
			}
			System.out.println("파일이 저장됐습니닼");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}// 6. 파일 저장 메소드

	// 7. 파일에 있는 거 불러오는 메소드
	// 홍길동,100,100,100 형식으로 넣어져있어야 함
	void load() {
		BufferedReader br = null;
		String[] student = {};
		String data = "";
		String[] temp = {};
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\skyku\\Student.txt"));
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				temp = data.split(",");
				list.add(new Student(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),
						Integer.parseInt(temp[3])));
			}
			System.out.println("파일내용 불러오기가 완료됐습니다. 성적출력해서 확인해보세요.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}// 7. 파일에 있는 거 불러오는 메소드

}// class
