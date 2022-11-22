package p1122;

public class J1122_01 {

	public static void main(String[] args) {
//		Player p1 = new Player(); //추상클래스의 객체는 못만듦.
		AudioPlayer a1 = new AudioPlayer();
		DVDPlayer d1 = new DVDPlayer();
		
		a1.play();
		
	}

}
