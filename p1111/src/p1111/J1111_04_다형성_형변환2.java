package p1111;


public class J1111_04_다형성_형변환2 {

	public static void main(String[] args) {
		Car c1 = null;
		Car c2 = null;
		Ambulance a1 = new Ambulance();
		Ambulance a2 = null;
		FireEngine f1 = new FireEngine();
		FireEngine f2 = null;
		
		c1 = a1; //조상(Car)의 참조변수c1에 자손의 객체(Ambulance) 대입. Ambulance -> Car 
		c2 = f1; //조상(Car)의 참조변수c2에 자손의 객체(FireEngine) 대입. FireEngine -> Car
		
		
		f2 = (FireEngine)c1; // 에러. Ambulance -> Fire넣고 있으니까 에러
		System.out.println("확인");
		
		
//		if(c1 instanceof FireEngine) { // c1이 FireEngine의 인스턴스니?
//			f2 = (FireEngine)c1; // 맞으면 c1을 FireEngine객체로 형변환
//			System.out.println("소방차 객체입니다");
//		} else {
//			a2 = (Ambulance)c1; // 아니면 c1을 Ambulance객체로 형변환
//			System.out.println("구급차 객체입니다");
//		}
		
		
	}

}
