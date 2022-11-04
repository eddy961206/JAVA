package p1104;

public class Tv {
	// 변수
	String color; //nul
	boolean power; //false;
	int channel; //0
	int volume;
	// 메소드
	void power() { 
		power =! power; 
	};
	
	void channelUp() {
		channel++;
	}
	void channedown() {
		channel--;
	}
}


