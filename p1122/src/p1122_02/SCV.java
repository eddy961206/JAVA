package p1122_02;

public class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	// 수리 메소드 - GroundUnit 받아
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r; 
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
		}
	}
}
