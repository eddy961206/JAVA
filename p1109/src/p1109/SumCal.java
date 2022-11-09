package p1109;

public class SumCal {
	
	// 메서드 정의
	// 처음 숫자부터 나중 숫자까지 합을 구하는 메소드 
	int sum(int input1, int input2) {
		int result = 0;
		for (int i = input1; i <= input2; i++) {
			result += input1++;
		}
		return result;
	}
	
}
