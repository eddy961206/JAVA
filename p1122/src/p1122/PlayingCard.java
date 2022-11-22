package p1122;

public interface PlayingCard {
	// 상수는 public static final 전체 또는 일부 생략가능. 항상 붙기 때문에
	public static final int SPADE = 4; 
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	// 추상메소드 역시 public abstract 생략 가능
	public abstract String getCardNumber();
	String getCardKind();
}
