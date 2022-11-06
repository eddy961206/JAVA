package alone;


// overloading : 원래 메소드와 이름은 같지만
// 매개변수의 갯수와 형식이 다른 메소드를 만드는 것.


class CalculatorOverload{
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    // 위 아래의 메소드가 이름이 같은데도 오류가 안걸리는 게 overloading때문.
    // 이름은 같아도 매개변수 갯수가 다르니 자바가 둘이 다른 메소드로 인식함.
    
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.setOprands(left, right); 
        // this.left = left;, this.right = right; 가 중복되니까 원래 메소드를 통째로 호출.
        
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
    
   
}

// overriding 과 overloading 차이 :
// overriding은 복붙하는 메소드끼리 서명이 같아야만 함. 
// overloading은 복붙하는 메소드끼리 서명이 달라야만 함.
// 공통점 :  둘 다 오리지날 메소드랑 이름이 같다는 것. 
  

class OverloadingDemo {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    // int A (){System.out.println("void A()");} //이건 오류. 리턴타입이 혼자 int로 달라서.
    // overloading 될려면
    // 메소드 이름은 같아야하고 매개변수는 달라야되지만
    // 리턴 타입은 같아야함. 다르면 안됨.
}

class OverloadingDemo2 extends OverloadingDemo{ //상속받
    void A (String arg1, String arg2){
    	System.out.println("sub class : void A (String arg1, String arg2)");
    	} // 이건 overloading. 부모것들 중에 매개변수 두 개 받는 거 없으니까.
    void A (){System.out.println("sub class : void A ()");}
    // 이건 overriding. 부모것들 중에 똑같이 인자 없는 게 있으니까 덮어씌어버림.(물론 부모 껀 살아있음)
}

public class A1106_overloading {
      
    public static void main(String[] args) {
          
    	CalculatorOverload c1 = new CalculatorOverload();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
        
        
        OverloadingDemo od = new OverloadingDemo();
        od.A();  // void A()
        od.A(1); // void A (int arg1)
        od.A("coding everybody"); // void A (String arg1)
        
        OverloadingDemo2 od2 = new OverloadingDemo2();
        od2.A(); // sub class : void A ()
        od2.A(1); // void A (int arg1)
        od2.A("coding everybody"); // void A (String arg1)
        od2.A("coding everybody", "coding everybody"); 
        // sub class : void A (String arg1, String arg2)
    
         
    }
  
}