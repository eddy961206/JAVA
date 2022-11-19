package alone;

class Calculator3 {
	
	// final <-> abstract. 
	// final은 추상과 정반대. 상속/변경을 불가능하게.
	
	// final은 1. 변수 / 2. 메소드 / 3. 클래스에 사용가능.
	// 1. 변수(필드) 앞에 final 붙으면 - '값 변경 불가',
	// 2. 메소드 앞에 final 붙으면 - 'overriding 불가'
	// 3. 클래스 앞에 final 붙으면 - '상속 불가'
	
	
	// static은 만들어지는 모든 인스턴스에 '공통적'으로 적용된다는 뜻
	// final은 '바뀌지 않는다'는 뜻
    static final double PI = 3.14;

    
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
//        Calculator3.PI = 6; // 이러면 오류. final로 해놔서
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class A1106_final {
 
    public static void main(String[] args) {
 
        Calculator3 c1 = new Calculator3();
        System.out.println(c1.PI);
        //Calculator3.PI = 10; // 이러면 오류. final로 해놔서
 
 
    }
 
}