package stuProject;

import java.util.Comparator;

public class StudentTotal implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.total<o2.total) {
			return -1; //오른쪽이 왼쪽보다 크면 -1 반환. 그 반대는 1 리턴.
		} else if(o1.total>o2.total) {
			return 1;
		}
		return 0;
	}

}
