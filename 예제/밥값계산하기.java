package 예제;

// https://cloudstudying.kr/studies/55
class Food {
	String name;
	int price;
	int count, total;

	public Food() {
	}

	Food(String name, int price) {
		this.name = name;
		this.price = price;
		count = 1;
		total = price;
	}

	Food(String name, int price, int count) {
		this(name, price);
		this.count = count;
		total = this.price * count;
	}

}

public class 밥값계산하기 {
	public static void main(String[] args) {

		Food[] foods = new Food[3];
		foods[0] = new Food("돈까스", 8000, 16);
		foods[1] = new Food("칼국수", 6000, 8);
		foods[2] = new Food("왕만두", 5000);

		for (int i = 0; i < foods.length; i++) {
			System.out.printf("%s * %d = %d\n", foods[i].name, foods[i].count, foods[i].total);
		}

	}
}
