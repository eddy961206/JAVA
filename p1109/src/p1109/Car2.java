package p1109;

public class Car2 {

	static int carNo; // cv. 공통 공유
	int cNo; // iv. 해당 인스턴스만 사용
	String color;
	String gearType;
	int door;
	
	{	
		carNo++; 
		cNo = carNo;	
	} // 인스턴스 초기화블럭. 모든 생성자에 다 적용되는 공통적인 부분. 잘 안써.
	// static붙으면 클래스초기화블럭. 클래스변수 자체가 객체 선언 없이 쓰는건데 이건 생성자에 들어가는거니까 거의 안쓰임

	Car2() { // 기본생성자
		
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	Car2(Car2 c){
		carNo++;
		cNo = carNo;
	}
	
	
}
