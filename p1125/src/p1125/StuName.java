package p1125;

import java.util.Comparator;

public class StuName implements Comparator<Stu>{

	@Override
	public int compare(Stu o1, Stu o2) {
		return o1.name.compareTo(o2.name); //이름 순차정렬
	}


}
