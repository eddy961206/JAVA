package alone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class A1115_map {

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();

		a.put("one", 1); // put메소드는 map인터페이스에만 존재. Collection인터페이스엔 없
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 4);

		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));

		iteratorUsingForEach(a);
		iteratorUsingIterator(a);

	}

	static void iteratorUsingForEach(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		while (i.hasNext()) {
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
