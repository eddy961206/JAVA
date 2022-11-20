package alone;

// 멤버의 접근제어자 : public, protected, default, private

// 클래스의 접근제어자 : public, default  - 패키지와 관련. default는 같은 패키지 안에서만 사용가능. 
// 클래스의 접근제어자 - public은 다른 패키지에서도 가능. public은 클래스 내에서 하나만 존재할 수. 제목과 같아야.

class AA {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class A1107_접근제어자_01 {
    public static void main(String[] args) {
    	AA a = new AA();
        System.out.println(a.y());
        
        // 아래 코드는 오류 발생. 
        //z()메소드는 private으로 지정돼서 선언된 클래스(A) 내부에서만 사용가능.
        //System.out.println(a.z());
        
        System.out.println(a.x());
    }
}