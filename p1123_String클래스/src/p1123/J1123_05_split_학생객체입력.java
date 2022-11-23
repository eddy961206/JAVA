package p1123;

import java.util.ArrayList;

public class J1123_05_split_학생객체입력 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		String[] stu = { "Alessandro,92,91,94", 
						 "Yorke,92,98,97", 
						 "Daffy,94,98,97", 
						 "Rollins,81,91,99", 
						 "Ellswerth,90,90,98"};
		// stu배열을 Student 객체로 만들어서
		// ArrayList에 입력하시오

		for (int i = 0; i < stu.length; i++) {
			String[] stu1 = stu[i].split(","); // 홍길동,100,100,100(다 String) ...
			list.add(new Student(stu1[0], Integer.parseInt(stu1[1]), Integer.parseInt(stu1[2]),
					Integer.parseInt(stu1[3])));
		}
		
		for(int i = 0; i<list.size(); i++) {
			System.out.printf("%s %s %d\n",
					list.get(i).stuNum, list.get(i).name, list.get(i).total);
			
		}
//
//		for (int j = 0; j < stuarr2.length; j++) {
//			Student s = new Student(stuarr2[0], Integer.parseInt(stuarr2[1]), Integer.parseInt(stuarr2[2]),
//					Integer.parseInt(stuarr2[3]));
//		}

//		String name =  "홍길동/홍길자/홍길순/유관순/이순신/김구/김유신";
//		String[] names = name.split("/");
//		System.out.println("이름 : "+name);
//		
//		for(int i = 0; i<names.length; i++) {
//			System.out.println("이름 : " + names[i]);
//		}

//		String hobbys = "golf, swim, game, book, run";
//		String[] hobby = hobbys.split(", "); //리턴값 String배열
//		System.out.println("취미 : "+ hobbys);
//		
//		for(int i = 0; i<hobby.length; i++) {
//			System.out.println("취미 " +hobby[i]);
//		}

	}

}
