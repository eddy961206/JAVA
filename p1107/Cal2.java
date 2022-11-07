package p1107;

public class Cal2 {

	// 사각형 넓이 구하는 계산식
	// 직사각형 rect : 가로*세로
	// 마름모 rhom: 대각선길이*대각선길이 / 2
	// 사다리꼴 trape : (밑변+윗변)/2 * 높이

	int rect(int width, int height) {
		int result = width * height;
		return result;
	}

	double rhom(int width, int height) {
		double result = width * height / 2.0;
		return result;
	}

	double trape(int width, int upper, int height) {
		double result = (width + upper) * height / 2.0;
		return result;
	}

}
