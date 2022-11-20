package 예제;

class User {
	String name;
	Boolean isMale;
	double point;

	User() {
	}
	User(String name, Boolean isMale) {
		this.name = name;
		this.isMale = isMale;
		this.point = Math.random() * 5;
	}

	public String toString() {
		if (isMale == true) {
			
		}
		return String.format("%s(%s: %.1f)\n", name, isMale, point);
	}

}

public class 소개팅매칭 {
//회원들의 가능한 매칭 쌍을 출력 시켜주세요. 매칭 기준은 아래와 같습니다.
//성별이 다를 것.
//평점차이가 0.8점 이상 차이나지 않을 것.

	public static void main(String[] args) {
		User[] users = new User[10];
		users[0] = new User("소희	", false);
		users[1] = new User("영수", true);
		users[2] = new User("정혁", true);
		users[3] = new User("민수", true);
		users[4] = new User("정희", false);
		users[5] = new User("경훈", true);
		users[6] = new User("태희", false);
		users[7] = new User("지수", false);
		users[8] = new User("효정", false);
		users[9] = new User("지국", true);

		for (int i = 0; i < users.length; i++) {
			for (int j = i+1; j < users.length; j++) {
				User source = users[i];
				User target = users[j];

				if (source.isMale != target.isMale) {
					if (Math.abs(source.point - target.point)< 0.8) {
						System.out.println(source.toString() + " - " + target.toString());
					}
				}

			}
		}

	}
}
