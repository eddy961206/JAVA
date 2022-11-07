package alone;

class Accounting {
	// 공급가는 인스턴스마다 다를테니까 static 안 붙임. 인스턴스변수.
    public double valueOfSupply;
    
    // 부가세율은 인스턴스마다 공통이니까 static 붙여서 클래스변수로 남겨놔.
    public static double vatRate = 0.1;
	
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	} 
	public double getVAT() {
		return 	valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
 	
	
}

public class AccountingApp {
//    // 공급가
//    public static double valueOfSupply;
//    // 부가가치세율
//    public static double vatRate = 0.1;
// 
 
    public static void main(String[] args) {
    	Accounting a1 = new Accounting(10000.0);
    	Accounting a2 = new Accounting(20000.0);
        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);
        System.out.println("VAT : " + a1.getVAT());
        System.out.println("VAT : " + a2.getVAT());
        System.out.println("Total : " + a1.getTotal());
        System.out.println("Total : " + a2.getTotal());
 
    }
 
}