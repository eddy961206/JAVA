package p1124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class J1124_03_Map {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();  //제네릭 설정 안해서 다 Object로 들어가있
		list.add("aaa");
		list.add("bbb");
		list.add("aaa");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------------------");
		
		HashSet set = new HashSet();
		set.add("111");
		set.add("222");
		set.add("111");
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("----------------------------");
		
		HashMap map = new HashMap();
		map.put("admin", 1111);
		map.put("admin1", 1111);
		map.put("admin2", 1111);
		map.put("admin", 1111); // key는 중복 허용 X
		
		Iterator it2 = map.entrySet().iterator();
		while (it2.hasNext()) {
			 System.out.println(it2.next());
		} //순서X
		
		
		
	}

}
