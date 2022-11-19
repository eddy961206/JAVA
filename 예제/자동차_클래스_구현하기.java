package 예제;

public class 자동차_클래스_구현하기 {

	class Car {
		String name;
		int cc;
		int size;

		Car() {
		}

		Car(String name, int cc, int size) {
			this.name = name;
			this.cc = cc;
			this.size = size;
		}

		void accelerate() {
			System.out.println("가속합니다");
		}

		void changeGear() {
			System.out.println("기어 변경합니다");
		}

		void honk() {
			System.out.println("빵빵");
		}

	}

	public static void main(String[] args) {

	}

}
