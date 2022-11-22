package p1122_04;

public class J1122_09_fianlly {

	public static void main(String[] args) throws Exception{
		System.out.println("프로그램 실행");
		try {
			System.out.println("DB 접속");
			System.out.println("id,pw 확인");
			System.out.println(0/0);
			System.out.println("id,pw 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외 발생해서 에러코드 출력");
		} finally {
			System.out.println("DB 접속해제");
		}
		System.out.println("----------------------------");
		System.out.println("프로그램 종료");
	}

}
