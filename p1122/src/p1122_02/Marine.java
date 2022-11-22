package p1122_02;

public class Marine extends GroundUnit {
	public Marine() {
		super(40);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Marine" + ", " + hitPoint;
	}
}
