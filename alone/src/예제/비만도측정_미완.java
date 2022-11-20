package 예제;

import java.util.Scanner;

class Person {
	double height;
	int weight;
	double bmi;
	static final double NORMAL = 18.5; //18.5 넘어야 정상
	static final double OVERWEIGHT = 25; //25보다 넘어야 과체중
	static final double FAT = 30; //30 넘어야 비만

	Person() {
	}

	Person(int height, int weight) {
		this.height = height*100/10000.0; //m단위로 변환
		this.weight = weight;
		bmi = (double)weight / Math.pow(height, 2)*10000;
	}

	void obesity() {
		
		// 저체중 기준 몸무게
		double underweight = Math.pow(height, 2) * NORMAL;
		// 정상 기준 몸무게
		double normal_weight = Math.pow(height, 2) * OVERWEIGHT;
		// 과체중 기준 몸무게
		double overweight = Math.pow(height, 2) * FAT;
		
		if (bmi < NORMAL) {
			System.out.println("저체중입니다");
			System.out.printf("정상이 되려면 %.1fkg 더 쪄야 합니다", weight - underweight);
		} else if (bmi < OVERWEIGHT) {
			System.out.println("정상입니다");
			System.out.printf("%.1fkg 더 찌면 과체중입니다", normal_weight - weight);
		} else if (bmi < FAT) {
			System.out.println("과체중입니다");
			System.out.printf("정상이 되려면 %.1fkg 빼야 합니다", normal_weight - weight);
			System.out.printf("%.1fkg 더 찌면 비만입니다", overweight - weight);
		} else {
			System.out.println("비만입니다");
			System.out.printf("정상이 되려면 %.1fkg 빼야 합니다", overweight - weight);
		}
	}// 메소드

}

public class 비만도측정_미완 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요 : ");
		int weight = scan.nextInt();
		System.out.println("키를 입력하세요 : ");
		int height = scan.nextInt();

		Person p = new Person(height, weight);
		p.obesity();
	}
}
