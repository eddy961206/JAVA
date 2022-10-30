package alone;

class Print {
	
	// static 없으니까 [인스턴스 변수].
	// static 있으면 [클래스 변수].
	// 클래스 활용해서 인스턴스 만들 때 바뀌기 원하는게
	// 있다면 이렇게 [인스턴스 변수]로 만들어야.
	public String delimiter = ""; 

	// 생성자. 이름은 클래스와 같게. 
	//인스턴스 만들때 쓰이니까 static 안붙는듯?
	public Print(String delimiter) {
		this.delimiter = delimiter; 
	}
//	public Print(String _delimiter) {
//		delimiter = _delimiter; 
//	}
	public void A() {
		// static 없으니까 <인스턴스 메소드>.
		// static 있다면 <클래스 메소드>.
		// 클래스 메소드 안에선 [인스턴스 변수] 못가져옴.
		System.out.println(this.delimiter); 
		//delimiter는 [인스턴스 변수].
		//this 붙으면서 더 명시적으로 [인스턴스 변수]임을 나타냄
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
	
	
}