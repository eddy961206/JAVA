package p1125;

import java.util.ArrayList;
import java.util.Scanner;

public class J1125_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		int choice = 0;
		// 파일에 있는 것을 읽어와서 
		list.add(new Student("s0001","홍길동",100,100,100,300,100.0,0));
		list.add(new Student("s0002","유관순",100,100,100,300,100.0,0));
		list.add(new Student("s0003","이순신",100,100,100,300,100.0,0));
		
		Student.count = list.size();
		
		while(true) {
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("-------------------------------");
			System.out.println("원하는 번호를 선택하세요 >> ");
			
			
			
			
		}// true
		
		
		
		
		
		
		
	}

}
