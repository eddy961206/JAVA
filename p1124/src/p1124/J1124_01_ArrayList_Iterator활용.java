package p1124;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class J1124_01_ArrayList_Iterator활용 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");
		list.add("555");
		list.add("111");
		
		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// 읽기 표준화 (잘 안씀) - 이렇게 순서대로 읽기만 할 수 있음
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// iterator 객첸 일회용. 다시 초기화해야..
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}//main

}//class
