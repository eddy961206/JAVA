package alone;

import java.util.ArrayList;
//https://opentutorials.org/module/516/6446
public class A1115_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		// ArrayList 클래스의 add()메소드는 기본적으로 매개변수로 Object 타입을 받음. 
		// 따라서 꺼낼 때도 Object이므로 형변환을 해서 사용해야. - 1번 참고
		// 하지만 제네릭으로 String만 들어오라고 명시하면
		// 꺼내서 사용할 때 굳이 형변환 필요없음. - 2번 참고
		al.add("two");
		al.add("three");
		
		for (int i = 0; i < al.size(); i++) {
//			String value = (String)al.get(i); // 1번
			String value = al.get(i); // 2번
			
			System.out.println(value);
		}
	}
}
