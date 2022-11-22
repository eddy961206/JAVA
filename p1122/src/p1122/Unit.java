package p1122;

abstract public class Unit {
	int x,y;
	
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("현재 위치에 멈춥니다.");
	}
}
