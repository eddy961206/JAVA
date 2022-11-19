package alone;

import java.util.EmptyStackException;
import java.util.Stack;

public class A1118_Stack {
	public static void main(String[] args) {
		
		
		Stack st = new Stack();
		String expression = "(((3+5)*8-2)";
		
		System.out.println("expression: "+expression);
		
		try {
			for(int i =0; i < expression.length(); i++) {
				char c = expression.charAt(i);
				
				if (c=='(') {
					st.push(c);
				} else if (c==')') {
					st.pop();
				}
			}
			
			System.out.println(st.size());
			
			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
			
		} catch (EmptyStackException e) {
			System.out.println("예외발생 : 괄호가 일치하지 않습니다");
		}
		
	}
}
