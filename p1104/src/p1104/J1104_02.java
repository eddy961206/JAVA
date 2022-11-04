package p1104;


public class J1104_02 {

	public static void main(String[] args) {
		
		String[] name = new String[10];
		
		Student s1 = new Student();
		Student s2 = new Student();
		// 1명의 값을 넣어서 출력을 하시옹.ㅏ
		// 홍길동,100,100,99,299,96.67,1
		
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 99;
		s1.total = 299;
		s1.avg = 96.67;
		s1.rank = 1;
		
		s2.name = "이순신";
		s2.kor = 34;
		s2.eng = 43;
		s2.math = 54;
		s2.total = 131;
		s2.avg = 43.66;
		s2.rank = 2;
		
		System.out.println(s1.name);
		System.out.println(s1.kor);
		System.out.println(s1.eng);
		System.out.println(s1.math);
		System.out.println(s1.total);
		System.out.println(s1.avg);
		System.out.println(s1.rank);
		
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.math);
		System.out.println(s2.total);
		System.out.println(s2.avg);
		System.out.println(s2.rank);
		
		
		System.out.printf("이름\t국어\t영어\t수학\t총합\t평균\t등수\n");
		System.out.println("------------------------------------------------------");
		
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t\n",
					s1.name,s1.kor,s1.eng,s1.math,s1.total,s1.avg,s1.rank);
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t\n",
					s2.name,s2.kor,s2.eng,s2.math,s2.total,s2.avg,s2.rank);
		
	}

}
