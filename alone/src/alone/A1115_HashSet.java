package alone;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class A1115_HashSet {
	// set - 중복없이 고유한 값만 저장 (집합이 영어로 set. 집합개념이라고 보면. 집합도 중복 허용안함. 순서도 X)
	// list - 중복허용. 모든 값 저장. 순서대로 저장. 
	// 결국 둘의 가장 큰 차이는 !!!! 중복/순서 !!!!
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
//		Collection<Integer> A = new HashSet<Integer>(); 이렇게도 가능. 
//		Collection<Integer> A = new ArrayList<Integer>(); 이것도 가능. 
//	    Collection이 최고조상이나 마찬가지니까. 다형성 덕분에 가능.
		A.add(1);
		A.add(2);
		A.add(3);
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B)); //false. B가 A의 부분집합이냐 - 거짓
		System.out.println(A.containsAll(C)); //true. C가 A의 부분집합이냐 - 참
		
		A.addAll(B); // A∪B 합집합 - 1,2,3,4,5가 됨
//		A.retainAll(B); // A∩B 교집합 - 3
//		A.removeAll(B); // A-B 차집합 - 1,2
		
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
		
		
	}//main
}//class
