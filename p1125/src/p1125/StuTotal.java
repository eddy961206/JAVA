package p1125;

import java.util.Comparator;

public class StuTotal implements Comparator<Stu> {

	@Override
	public int compare(Stu o1, Stu o2) {
		if (o1.total > o2.total) {
			return 1;
		} else if (o1.total < o2.total) {
			return -1;
		}
		return 0;
	} // 점수 순차정렬

}
