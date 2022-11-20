package alone;

import java.util.ArrayList;
import java.util.Collections;

public class A1117_ArrayList_정석 {
	public static void main(String[] args) {
		// 기본 길이(용량capacity)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		// ArrayList에는 객체만 저장가능
		list1.add(5); // 오토박싱으로 자동으로 Integer객체로 만들어줘서 가능
		list1.add(new Integer(4)); // 이건 왜 이러는지?
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		// ArrayList(Collection c) 생성자 사용
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// subList메소드는 사실 읽기 전용. 그냥 보여주려고 새 ArrayList 만든 것.

		print(list1, list2); // list1:[5, 4, 2, 0, 1, 3] list2:[4, 2, 0]

		Collections.sort(list1);// 순서대로 정렬(오름차순) //list1:[0, 1, 2, 3, 4, 5]
		// Collections는 Util클래스, Collection은 인터페이스.
		Collections.sort(list2); // list2:[0, 2, 4]
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		// 포함하고 있냐 true

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2); // list1:[0, 1, 2, 3, 4, 5] list2:[0, 2, 4, A, B, C]

		list2.set(3, "AA"); // 치환 바꿔버리기
		print(list1, list2); // list1:[0, 1, 2, 3, 4, 5] list2:[0, 2, 4, AA, B, C]

		list1.add(0, "1"); //0번째 자리에 '문자열'1을 넣는다. 원래는 int만 들어가있었는데.
		print(list1, list2); // list1:[1, 0, 1, 2, 3, 4, 5] list2:[0, 2, 4, AA, B, C] 
		System.out.println(list1.indexOf("1")); // 0 - String 1의 인덱스
		System.out.println(list1.indexOf(1)); // 2 - Integer 1의 인덱스
		
//		list1.remove(1); // Integer 1을 지우는 게 아니라 index가 1인 애(0)를 지워 
//		print(list1, list2); // list1:[1, 1, 2, 3, 4, 5] list2:[0, 2, 4, AA, B, C]
		
		// 숫자 1을 지우고 싶으면 
		list1.remove(new Integer(1)); //삭제할 땐 형식 정확하게
		print(list1, list2); // list1:[1, 0, 2, 3, 4, 5] list2:[0, 2, 4, AA, B, C]
		
		// 겹치는 것만 남겨놓음
		list1.retainAll(list2); 
		print(list1, list2);// list1:[0, 2, 4] list2:[0, 2, 4, AA, B, C] 
		
		// list2에서 list1에 포함된 객체들 삭제
		for (int i = list2.size()-1; i >=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);// list1:[0, 2, 4] list2:[AA, B, C] 
		
		

	}// main

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}

}// class
