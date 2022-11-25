package stuProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StuCal {
	static Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<>();
	String name = "";
	String address = "C:\\studentTest.txt";
	String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	int kor, eng, math, total, count, choice, flag, rank;
	double avg;
	String id = "", pw = "";

	public StuCal() {
	}

	void logIn() {
		ArrayList<String> ids = new ArrayList<>();
		ArrayList<String> pws = new ArrayList<>();
		String data = "";
		String[] temp = {};
		BufferedReader br = null;
		loop:
		while (true) {
			System.out.println("[ 로그인을 해야 접속이 가능합니다. ]");
			
			try {
				br = new BufferedReader(new FileReader("C:\\id.txt"));
				while(true) {
					data = br.readLine();
					if(data ==null) break;
					temp = data.split(",");
					ids.add(temp[0]);
					pws.add(temp[1]);
				}
				
				for (int i = 0; i < 3; i++) {
					System.out.println(i+1+"번째 시도");
					System.out.println("ID를 입력하세요.(0.프로그램 종료)>>");
					id = scan.next();
					System.out.println("비번을 입력하세요 >>");
					pw = scan.next();
					for (int j = 0;  j< ids.size(); j++) {
						if(ids.get(j).equals(id) && pws.get(j).equals(pw)) {
							System.out.println("로그인 됐습니다. ");
							flag = 1;
							return;
						} else {
							System.out.println("로그인 실패");
							System.out.println("3번 틀리면 아웃\n");
							if(i==3) {
								break loop;
							}
							break;
							
						}
					}
				}
				
				
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

	// 메인메뉴 출력 메소드
	int main_menu() {
		System.out.println("\n [ 성적 처리 프로그램 ] ");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 학생 검색");
		System.out.println("5. 등수 처리");
		System.out.println("6. 정렬 선택");
		System.out.println("7. 파일 불러오기");
		System.out.println("8. 파일 저장하기");
		System.out.println("0. 프로그램 종료");
		System.out.println("-----------------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		choice = scan.nextInt();
		return choice;
	}// 메인메뉴 출력 메소드

	// 1. 성적 입력 메소드
	void input_score() {
		while (true) {
			System.out.println(list.size() + 1 + "번째 학생 이름을 입력하세요. (0.뒤로 가기) >> ");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				return;
			}
			System.out.println("국어 점수를 입력하세요 >>");
			kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요 >>");
			eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요 >>");
			math = scan.nextInt();

			Student s = new Student(this.name, this.kor, this.eng, this.math);
			list.add(s);
			System.out.println(name + "학생의 점수 입력이 완료됐습니다.");
		}
	} // 1. 성적 입력 메소드

	// 2. 성적 출력 메소드
	void print_score() {
		System.out.println("\n[[ 성적 출력 ]]");
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", list.get(i).stuNum, list.get(i).name,
					list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg,
					list.get(i).rank);
		}
	} // 2. 성적 출력 메소드

	// 3. 성적 수정 메소드
	void modify_main() {
		ArrayList<Integer> sameList = new ArrayList<>();
		System.out.println("수정을 원하는 학생의 이름을 입력하세요 >>");
		name = scan.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.equals(name)) {
				sameList.add(i);
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println(name + " 학생을 찾을 수 없습니다. 다시 시도하세요.");
			return;
		}

		flag = 0;
		if (sameList.size() > 1) {
			System.out.printf("%s 이름의 학생이 %d명 검색되었습니다.\n", name, sameList.size());
			for (int i = 0; i < sameList.size(); i++) {
				System.out.printf("%d. 학번 : %s, 이름 : %s\n", i + 1, list.get(sameList.get(i)).stuNum, name);
			}
			System.out.println("원하는 학생을 선택하세요 >> ");
			choice = scan.nextInt();
			sameList.set(0, sameList.get(choice - 1));
		} else if (sameList.size() == 1) {
			System.out.println(name + " 학생 조회가 완료됐습니다.");
		}

		score_edit(sameList.get(0));

	} // 3. 성적 수정 메소드

	// 3-1 점수 수정 메소드
	void score_edit(int checkNum) {
		System.out.printf("[[ %s 학생(학번 : %s) 수정 ]]\n", list.get(checkNum).name, list.get(checkNum).stuNum);
		System.out.println("1. 국어점수 수정");
		System.out.println("2. 영어점수 수정");
		System.out.println("3. 수학점수 수정");
		System.out.println("0. 수정 취소");
		System.out.println("--------------------------------");
		System.out.println("원하는 번호를 선택하세요 >> ");
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.printf("현재 %s 학생의 국어점수 : %d점\n", list.get(checkNum).name, list.get(checkNum).kor);
			System.out.println("원하는 점수를 입력하세요 : ");
			list.get(checkNum).kor = scan.nextInt();
			System.out.printf("%s 학생의 국어점수가 %d점으로 변경됐습니다.\n", list.get(checkNum).name, list.get(checkNum).kor);
			break;
		case 2:
			System.out.printf("현재 %s 학생의 영어점수 : %d점\n", list.get(checkNum).name, list.get(checkNum).eng);
			System.out.println("원하는 점수를 입력하세요 : ");
			list.get(checkNum).eng = scan.nextInt();
			System.out.printf("%s 학생의 영어점수가 %d점으로 변경됐습니다.\n", list.get(checkNum).name, list.get(checkNum).eng);
			break;
		case 3:
			System.out.printf("현재 %s 학생의 수학점수 : %d점\n", list.get(checkNum).name, list.get(checkNum).math);
			System.out.println("원하는 점수를 입력하세요 : ");
			list.get(checkNum).math = scan.nextInt();
			System.out.printf("%s 학생의 수학점수가 %d점으로 변경됐습니다.\n", list.get(checkNum).name, list.get(checkNum).math);
			break;
		case 0:
			System.out.println("수정을 취소합니다.");
			break;
		}// switch

		list.get(checkNum).total = list.get(checkNum).kor + list.get(checkNum).eng + list.get(checkNum).math;
		list.get(checkNum).avg = list.get(checkNum).total / 3.0;
	} // 3-1점수 수정 메솓

	// 4. 학생 검색 메소드
	void search_student() {
		int count = 0;
		System.out.println("검색을 희망하는 학생의 이름 전체 또는 일부를 입력하세요 >> ");
		name = scan.next();

		System.out.println("\n[[ 성적 출력 ]]");
		System.out.println("학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).name.contains(name)) {
				count++;
				System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", list.get(i).stuNum, list.get(i).name,
						list.get(i).kor, list.get(i).eng, list.get(i).math, list.get(i).total, list.get(i).avg,
						list.get(i).rank);
			}
		}
		System.out.printf("총 [%d]명의 학생이 검색됐습니다.\n", count);
	} // /4. 학생 검색 메소드

	// 5. 등수 처리 메소드
	void ranking() {
		for (int i = 0; i < list.size(); i++) {
			rank = 1;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).total < list.get(j).total)
					rank++;
			}
			list.get(i).rank = rank;
		}
		System.out.println("등수 처리가 완료됐습니다.");
	} // 5. 등수 처리 메소드

	// 6. 정렬 선택 메소드
	void sort() {
		System.out.println("[[ 정렬 선택 화면 ]]");
		System.out.println("1. 이름 순차 정렬");
		System.out.println("2. 이름 역순 정렬");
		System.out.println("3. 점수 순차 정렬");
		System.out.println("4. 점수 역순 정렬");
		System.out.println("-----------------------------------");
		System.out.println("원하는 번호를 입력하세요 : ");
		choice = scan.nextInt();

		switch (choice) {
		case 1:
			Collections.sort(list, new StudentName());
			System.out.println("이름 순차 정렬이 완료됐습니다.");
			break;
		case 2:
			Collections.sort(list, new StudentName().reversed());
			System.out.println("이름 역순 정렬이 완료됐습니다.");
			break;
		case 3:
			Collections.sort(list, new StudentTotal());
			System.out.println("점수 순차 정렬이 완료됐습니다.");
			break;
		case 4:
			Collections.sort(list, new StudentTotal().reversed());
			System.out.println("점수 역순 정렬이 완료됐습니다.");
			break;
		}// switch
	} // 6. 정렬 선택 메소드

	// 7. 파일 불러오기 메소드
	void load() {
		BufferedReader br = null;
		String[] temp = {};
		String data = "";

		try {
			br = new BufferedReader(new FileReader(address));
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				temp = data.split(",");
				if (list.size() == 0) {
					list.add(new Student(temp[0], temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]),
							Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), Double.parseDouble(temp[6]),
							Integer.parseInt(temp[7])));
				} else if (list.size() > 0) {
					int lastIndex = list.size();
					list.add(new Student(String.format("s%04d", lastIndex + 1), temp[1], Integer.parseInt(temp[2]),
							Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]),
							Double.parseDouble(temp[6]), Integer.parseInt(temp[7])));
					lastIndex++;
				}
			}
			Student.count = list.size();
			System.out.println("파일을 불러왔습니다. 출력해보세요.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	} // 1. 성적 입력 메소드

	// 8. 파일 저장하기 메소드
	void save() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(address);
			for (int i = 0; i < list.size(); i++) {
				fw.write(list.get(i).toString());
			}
			System.out.println("파일 저장이 완료됐습니다. " + address + "를 열어보세요.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	} // 8. 파일 저장하기 메소드

}
