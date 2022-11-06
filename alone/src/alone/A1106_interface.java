package alone;

public class A1106_interface {
	// 인터페이스 : 만드는 사람과 만든 걸 활용해서 사용하려는 사람간의 규약. 중간 설계도같은 역할
	// 인터페이스에서 정해놓은 시그니쳐 대로 안 만들면 양측 다 컴파일 안 되니까 안전.
	
	// 특징 1) 인터페이스 내의 메소드들은 다 public이어야 함. 다른 파일에서 가져다 써야 하니까.
	// 특징 2) 인터페이스 내에서 정의한 메소드들 모두 사용해야. 빠트리면 안 됨. 설계도에 있는 거 빼먹으면 안되듯이.
	
	// abstract와 interface의 차이 :
	// abstract는 내용이 없는 빈 메소드 뿐만 아니라 내용이 있는 메소드도 포함될 수 있는 '클래스'.
	// interface는 내용이 없는 빈 메소드'만' 존재해야 하는 '클래스가 아닌' 고유의 형식.
	
	// abstract는 상속을 해줘야만 사용가능
	// interface는 상속도 물론 가능하지만 implements 붙여서 사용해야 함.
	
	// 인터페이스는 원랜 파일 따로 저장. 중간점 설계도니까.
	// 특징 0) 아래처럼 시그니쳐만 있고 내용은 없는 '빈 메소드'여야 함. 마치 abstract처럼. 
	interface I1{
	    public void x();
	} // 클래스가 아님. 인터페이스는 인터페이스 그 자체임. 인터페이스는 클래스의 한 종류가 아님.
	 
	interface I2{
	    public void z();
	}
	 
	// 특징 3) 하나의 클래스가 여러개의 인터페이스를 구현 가능.
	// A는 I1과 I2의 메소드인 x()와z() 모두 구현해야 함.
	class A implements I1, I2{
	    public void x(){} 
	    public void z(){}   
	}
	
	interface I3{
	    public void x();
	}
	 
	interface I4 extends I3{
	    public void z();
	}
	
	// 특징 4) 인터페이스끼리 상속 가능.
	// 클래스로 구현할 때 자식 뿐 아니라 
	// 부모 인터페이스 안의 메소드들까지도 싹 다 구현해야함.
	class B implements I4{
	    public void x(){} //자식 인터페이스
	    public void z(){}   //부모 인터페이스 까지
	}
	
	
}
