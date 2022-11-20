package alone;

class Student implements Cloneable {
//	clone()메소드를 사용하려면 Cloneable이란 인터페이스를 구현해야함.
	 
	String name;

	Student(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
//	이 Cloneable이란 인터페이스는 Checked예외(필수처리)인 Exception을 조상으로 하는 
//	CloneNotSupportedException이라는 예외를 처리해야함.
		return super.clone();
	}
}

public class A1115_clone {
	public static void main(String[] args) {
		Student s = new Student("ㅇㅇ");
		try {
			Student s2 = (Student) s.clone();
//			clone이라는 메소드는 Object를 리턴하기 때문에 그걸 다시 Student로 형변환 해주면 됨
			System.out.println(s.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
