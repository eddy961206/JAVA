package alone;

class Calculator5{
	
	//private으로 설정. 인스턴스에서 못 꺼내오게.
    private int left, right;
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    // private으로 설정. 설계도 내부에서만 사용/편집 가능.
    private int _sum(){
        return this.left+this.right;
    }
    
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++");
    }
    
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}
  
public class A1107_접근제어자_02 {
    public static void main(String[] args) {        
        Calculator5 c1 = new Calculator5();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
    }
}
