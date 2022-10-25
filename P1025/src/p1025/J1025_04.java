package p1025;

public class J1025_04 {

	public static void main(String[] args) {
		System.out.println(10/3.0);
		
		// 지시자 - || %s : String || %d : 정수형 || %f : 실수형 || %c : 문자 ||
		System.out.printf("%f\n",10/3.0);  //printf는 줄바꿈 안해주니까 \n 추가해 3.3333333333333335

		String name = "홍길동";
		int kor = 100;
		int eng = 100;
		int math = 99;
		int total = kor + eng +math;
		double avg = total/3.0;
		System.out.println("이름    국어     영어    수학    합계    평균");
		System.out.println("------------------------");
		System.out.printf("%s    %d    %d    %d    %d    %.1f\n", name,kor,eng,math,total,avg);   //"%.1f\n"면 소수점 첫째자리
//		System.out.printf("국어:%d, 영어:%d, 수학:%d, 평균:%.1f\n", kor,eng,math,avg);   //"%.1f\n"면 소수점 첫째자리
//		System.out.println("국어:"+kor+ ", 영어:" + eng + ", 수학:"+ math + ", 평균:"+avg); //변수 많을수록 println이 불리함. 10진수만 표현
		
	}

}
