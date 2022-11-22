package p1122_02;

public class Unit {
	int hitPoint; // 현재 체력
	final int MAX_HP; // 최대 체력 - 객체생성될 때 꼭 값이 들어가야
	
//	// 생성자 단에서 상수에 값 지정 안해주면 그 이후엔 넣을 수 없기 때문에 에러발생.
//	Unit(){} 	
	
	// 생성자에 최대체력 입력되지 않으면 에러
	Unit(int hp) {
		MAX_HP = hp;//생성자 통해서만 이 상수값 지정가능.
	}
	
	
	
	
}
