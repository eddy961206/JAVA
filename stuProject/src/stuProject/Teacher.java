package stuProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
	Scanner scan = new Scanner(System.in);
	ArrayList<Teacher> teacher_list = new ArrayList<>();
	static String address = "C:\\Users\\skyku\\teacher.txt";
	String id;
	String pw;
	int flag;

	Teacher() {
	};

	Teacher(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	void logIn() {
		while (true) {
			readFile();
			matchCheck();
			break;
		} // while
	}// login()메소드

	//파일에서 아이디, 비번 불러와서 객체에 저장하는 메소드
	void readFile() {
		String data = "";
		String[] temp = {};
		BufferedReader br = null;

		System.out.println("\n[ 로그인을 해야 접속이 가능합니다. ]");

		try {
			br = new BufferedReader(new FileReader(address));
			while (true) {
				data = br.readLine();
				if (data == null)
					break;
				temp = data.split(",");
				teacher_list.add(new Teacher(temp[0], temp[1]));
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

	}// readFile() 메소드

	
	// 입력받은 값과 아이디비번을 비교하는 메소드
	void matchCheck() {
		for (int i = 0; i < 3; i++) {
			System.out.println("\n" + (i + 1) + "번째 시도");
			System.out.println("ID를 입력하세요.(0.프로그램 종료)>>");
			String id_input = scan.next();
			System.out.println("비번을 입력하세요 >>");
			String pw_input = scan.next();
			for (int j = 0; j < teacher_list.size(); j++) {
				if (teacher_list.get(j).id.equals(id_input) && teacher_list.get(j).pw.equals(pw_input)) {
					System.out.println("로그인 됐습니다. ");
					flag = 1;
					return;
				}
			}
			if (flag == 0) {
				System.out.println("로그인 실패(3번 틀리면 아웃)");
				if (i == 2) {
					return;
				}
			}
		} // 큰for
	}

}

