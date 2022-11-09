package p1109;

public class J1109_01_객체복사 {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		System.out.println(c1.color);                     
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		Car c2 = new Car("purple","auto",8);
		
		
//		Car class의 생성자 :  (매개변수 타입이 Car타입)
//		Car(Car c){
//			this(c.color,c.gearType,c.door);
//		} ↓
		Car c3 = new Car(c2); // 객체복사 //깊은복사
//		c3 = c2; 이건 주소공유임. 하나 바꾸면 둘 다 바뀌어. 복사 아냐 //얕은복사
		
		
		
	}

}
