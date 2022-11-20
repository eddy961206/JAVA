package 예제;

import java.util.Scanner;

//1000미터 높이에서 가만히 떨어뜨린 자유낙하하는 물체의 t 초 후 고도를 구하는 프로그램을 제공되는 코드를 활용하여 작성해주세요. 
//(등가속운동을 하는 물체의 이동거리 공식을 이용할 것)

public class 자유낙하물체고도 {
	public static void main(String[] args) {
		// 키보드로부터 입력받기 위한 변수
		Scanner scan = new Scanner(System.in);
		// 중력 가속도
		double gravity = -9.81;
		// 떨어지는 시간
		System.out.println("몇 초 후의 고도를 알기 원하나요? : ");
		double fallingTime = scan.nextDouble();
		// 초기 높이
		double initialPosition = 1000.0;
		double finalPosition = 0.0; 
		
		
		// 공식 x(t) = 0.5at^2 + v0t + x0
		finalPosition = 0.5 * gravity* Math.pow(fallingTime, 2) + 0 + initialPosition;
		
		
		System.out.printf("%.2f 초 후, 물체의 고도는 %.2f m\n", fallingTime, finalPosition);
	}
}
