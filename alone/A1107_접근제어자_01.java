package alone;

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