package p1122;

public class Marine extends Unit {
	void move(int x, int y) {
		System.out.printf("%d,%d로 이동합니다.  \n",x,y);
	}
	
	void stimPack() {
		System.out.println("이동속도와 사격속도가 빨라졌습니다");
		System.out.println("대신 체력이 줄어들었습니다ㄷㄷ");
	}
	
}
