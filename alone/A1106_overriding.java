package alone;

class Calculator4 {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
        return ((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator4 {
     
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    // 부모의 메소드를 overriding 하려면
    // 부모 메소드의 서명signature(메소드 이름, 리턴 타입, 매개변수의 갯수/타입/순서)이 
    // overriding 하려는 자식 메소드와 일치해야만 함.
    
    
    public int avg() {
    	return super.avg(); 
    } // super : 현재 클래스의 부모클래스. 부모클래스의 avg()메소드 호출. 
    // super로 부모거 일단 호출한 이후에 원하는데로 기능 추가하면 됨. 그러면 부모 메소드는 안바뀌고
    // 자식것만 바뀜. 복붙 후 편집한다 생각하면. 
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class A1106_overriding {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
