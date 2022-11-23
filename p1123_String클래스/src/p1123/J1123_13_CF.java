package p1123;

import java.util.ArrayList;
import java.util.List;

public class J1123_13_CF {

	public static void main(String[] args) {
		// 다형성 : 부모의 참조변수로 자손의 객체 다루기
		List list = new ArrayList();
		list.add("aaa"); // 0
		list.add(1); // 1
		list.add("bbb");
		list.add("c");
		list.add(2);
		list.add("aaa");

		// 모든 데이터 삭제 - 뒤에부터 삭제해야.........................
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}

		if (list.size() == 0) {
			System.out.println("모든 데이터가 삭제됐습니다");
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

////		list.clear(); //전체삭제
//		list.remove(2); // 넣은 인덱스에 해당하는 값 지움
//		
//		if(list.size()==0) {
//			System.out.println("데이터가 없습니다.");
//		}

	}

}
