package p1121_03_학생성적_ArrayList활용;

public class J1121_10 {

	public static void main(String[] args) {
		String str = String.format("%05d", 121); //00121 - String.format()활용.
		int num = 1;
		int num2 = 121;
		int num3 = 1234;
		System.out.println(String.format("stu%05d", num)); // stu00001
		System.out.println("s"+num2);
		System.out.println("s"+num3);
	}

}
