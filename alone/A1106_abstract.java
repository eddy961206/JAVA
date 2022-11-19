package alone;

// 추상이란 : 구체적인 로직 없이 말 그대로 추상적으로 뼈대만 만들어놓고
// (시그니쳐만 - 즉, 메소드 이름, 매개변수 갯수와 타입, 리턴 타입), 
// 구체적 로직은 나중에 사용하는 쪽이 알아서 커스터마이징해서 쓸 수 있도록 한 것.

// 사용법 : 추상클래스내의 메소드를 사용하려면 
// 반드시 해당 추상클래스를 상속받은 '자식클래스'를 사용해야 함. '상속'을 강제함.

// 클래스 내에 하나라도 abstract메소드가 있다면 그 클래스는 추상클래스가 되는 것임. 
abstract class A { 
	
	// 본체(중괄호)가 있는 메소드는 abstract 키워드를 가질 수 없.
	// public abstract int c(){System.out.println("Hello")} 안됨
	public abstract int b();

	
	// 추상 클래스 내에도 추상 메소드가 아닌 일반 메소드가 존재 할 수 있음.
	public void d() {
		System.out.println("world");
	}
}


class B extends A { //B클래스가 A클래스로부터 상속 받.
	// 부모클래스(A)가 추상클래스라면
	// 부모인 A에 있던 추상메소드 (b())를 
	// 자식클래스(B)에 overriding 해야 작동가능.
	public int b() {
		return 1;	
	}
	// 부모클래스에서 추상적이게 틀만 존재하던 b()메소드를
	// 자식클래스에서 구체적으로 만든 것.
}

public class A1106_abstract {
	public static void main(String[] args) {
		// A는 추상클래스라서 상속을 받아서 사용해야만 함. 
		// 아래처럼 직접적으로 A 클래스의 인스턴스를 만드는 것 자체가 안됨.
//		A obj = new A(); 
		
		// 추상클래스인 A클래스를 상속받은 B클래스로 인스턴스 만들어서 사용해야.
		B objB = new B();
		System.out.println(objB.b()); // 1 나옴.
		
		// 추상클래스(A) 내에 있는 모든 메소드들은 
		// 추상메소드(b())든 일반메소드(d())든 상관없이
		// 모두 다 상속을 받은 클래스(B)를 활용해야 사용가능.
		objB.d(); // world
	}
}