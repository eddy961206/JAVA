package p1122;

public class Tank extends Unit{
	void move(int x, int y) {
		System.out.printf("%d,%d로 이동합니다.  \n",x,y);
	}
	
	void changeMode() {
		System.out.println("사거리가 길어졌습니다");
		System.out.println("강해졌습니다");
	}
	
}
