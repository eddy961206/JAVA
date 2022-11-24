package p1124;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class J1124_04_Map2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); //제네릭 붙여ㅕ .타입정하기, 형변환 필요,		map.put("admin", 1111);
		map.put("aaa", 2222);
		map.put("admin2", 3333);

		System.out.println(map.get("admin")); // key 넣으면 value출력 1111
		System.out.println(map.size()); // 3
		if(map.containsKey("aaa")) {
			System.out.println("aaa key가 존재합니다");
		} else {
			System.out.println("aaa key가 존재하지 않ㅅ,ㅂ니다");
		}
		
		
//		Iterator it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		Iterator<String> it = map.keySet().iterator(); // keySet - key값만.
//		while (it.hasNext()) {
//			String keys = it.next();
//			System.out.println(keys + "-" + map.get(keys));
//			//map.get()하면 value값 반환
//		}

	}

}
