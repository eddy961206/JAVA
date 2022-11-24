package p1124;

import java.util.ArrayList;
import java.util.Iterator;

import p1124_02_연습.Student;

public class J1124_02_Set_Iterator활용 {
	public static void main(String[] args) {

		// list -> 순서O, 중복O
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 100, 100, 99));
		list.add(new Student("홍길자", 20, 50, 93));
		list.add(new Student("홍길순", 43, 32, 29));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student s = it.next(); // 객체 저장한 다음에 그 객체로 접근해야 값이 나옴.
			System.out.println(s.stuNum + "," + s.name + "," + s.kor + "," + s.eng);
//			System.out.println(it.next()); // 객체의 주소가 나옴.
		}

		// set -> 순서X, 중복X
//		HashSet set = new HashSet();
//		set.add("111");
//		set.add("222");
//		set.add("333");
//		set.add("111");
//		set.add("222");
//		set.add("1");
//		
//		Iterator it = set.iterator();
//		while(it.hasNext()) 
//			System.out.println(it.next());

	}
}
