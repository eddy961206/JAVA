package p1108;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car() { // 기본생성자(매개변수 아무것도 안받을 경우 사용됨)

		// 같은 클래스의 다른 생성자 호출 -> this
		// 원랜 this대신 Car가 들어가야 되는데 Car라고 하면 컴터가 헷갈려하니까.
//		this("white","Auto",4);
		
		// this 위에 뭐 써봤자 소용 없으니까 this를 맨 위에 두어야.
//		door = 5; // this 아래에 쓰는 건 가능.
	} 
	
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
