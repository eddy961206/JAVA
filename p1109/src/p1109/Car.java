package p1109;

public class Car {
	static int carNo = 0;
	String color;
	String gearType;
	int door; // 변수 많으면 생성자 무조건 만들게돼있음

//	Car(){} //기본생성자. 웬만하면 만들어.
	// 따로 구현부 작성 안하면 iv에 null, 0이 들어가있음

	Car() {
//		this("white", "auto", 4); // this()는 같은 클래스 내 다른 생성자 호출.
		// 매개변수 3개 집어넣었으니까 매개변수 3개를 요구하는 생서자를 알아서 호출하게 됨.
	}

//	Car(){ //암것도 입력 안받으면 아래처럼 자동으로 지정됨
//		color = "white";
//		gearType = "auto";
//	}

//	// 생성자 - 매개변수 1개짜리
//	Car(String color){
//		this.color = color;
//		gearType = "auto";
//	}

	// 생성자 - 매개변수 3개짜리
	Car(String color, String gearType, int door) {
		this.color = color; // lv를 iv로 지정하는 this.
		this.gearType = gearType;
		this.door = door;
	}

	// 생성자 - 매개변수 타입이 Car타입. 인스턴스 복사용
	Car(Car c) {
		this(c.color, c.gearType, c.door);
	}

}
