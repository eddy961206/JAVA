package p1107;

public class Tv {

	// 속성
	String color; //= ""; // 티비 색상
	boolean power; //= false; // 전원
	int channel; //= 0; // 채널

	// 아래는 다 메소드
	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

}
