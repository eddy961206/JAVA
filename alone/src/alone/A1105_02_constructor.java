package alone;

class Calculator {
	
	int left, right; //전역변수이자 인스턴스변수. static 유무랑 상관없음. 


	// 생성자. 메소드들 중 가장 먼저 실행됨. 
	// 없으면 자동으로 기본생성자가 만들어짐.
	// 기본생성자 특징 : 매개변수가 없고, 클래스 이름과 같고, 내용비어있음. 	
	public Calculator(int left,int right) {
		this.left = left;
		this.right = right;
	} //이건 기본생성자 아냐. 내가 직접 만든거니까.
	
	
	// 기본생성자를 명시적으로 만듦. 원랜 자동으로 만들어주는데
	// 혹여나 커스텀 생성자가 있어서 컴파일러가 자동으로 안만들어주면 낭패니까
	// 상속 시 하위 클래스가 쓰라고 미끼처럼 빈 생성자 만들어놓은 거. 
	// 이렇게 안하면 하위 클래스에서 부모 클래스의 생성자를 자동으로 부를 때 없다고 오류 뜸. 
	public Calculator()	{}
	// 얘 없이도 하위클래스가 부모클래스인 Calculator 클래스의 생성자를
	// 참조하고 싶으면 하위클래스에서 super 사용. 아래 참조.
	
	
	// 생성자 없이 사용하려면 :
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
		// 여기서 this가 없어도 실행가능. 어차피 sum메소드 내에 left와 right가 없으니
		// 자동으로 전역변수를 찾아 가져오니까. 하지만 
		// sum메소드의 인자로 전역변수를 사용한다는 걸 더 명시적으로 하려고 this붙인 거.
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

class SubstractableCalculator extends Calculator { 
	// 상속받은 클래스(자식)의 인스턴스를 만들면 자식의 생성자를 호출하기 전에 
	// 부모의 '기본'생성자를 자동으로 호출함. 
	// 그래서 Calculator(상위 클래스)에 'public Calculator(){}' 를 써서
	// 의도적으로 기본생성자를 만듦. 
	// 그러나 'public Calculator(){}' 도 필요 없으려면 아래처럼 super 사용.
	public SubstractableCalculator(int left, int right) {
		super(left,right); 
		// "부모 클래스의 생성자에 left와 right를 집어넣겠다"
		// super가 부모클래스란 뜻. super()는 부모클래스의 생성자. 그 안에 left,right를 전달.
		// 부모의 생성자와 같은 역할을 하는 생성자를 하위클래스에 만들고 싶을 때,
		// 굳이 똑같은 내용을 하위클래스에 한번 더 쓰지 말고 이렇게 
		// 하위클래스에다가 super를 통해서 매개변수를 상위클래스의 생성자로 보내면 됨.
		
		// 상위(부모)클래스에 아무런 생성자도 내가 만들어놓지 않았다면
		// 컴파일되면서 컴터가 알아서 자동으로 기본생성자를 만들어놓기 때문에
		// 하위(자식)클래스에 생성자가 필요 없어짐.
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	} 
}


public class A1105_02_constructor {
	public static void main(String[] args) {
//		// 직접 만들어 놓은 생성자가 있을 때 사용법. 
//		Calculator c1 = new Calculator(10,20); 
//		c1.sum();
//		c1.avg();
		
//		// 직접 만들어 놓은 생성자가 없을 때 사용법.
//		// new뒤에 붙어있는 Calculator()가 사실 생성자. 
//		// 직접 만들어 놓은 생성자가 없기때문에 여기선 Calculator()는 기본생성자.		
		Calculator c2 = new Calculator();
		c2.setOperands(10, 20);
		c2.sum();
		c2.avg();

		SubstractableCalculator c3 = new SubstractableCalculator(20,35);
		c3.setOperands(10, 20); //substractableCalculator클래스엔 setOperands라는 메소드가 없음에도 상속을 받은거라 사용가능.
		c3.substract();
	}
}



















