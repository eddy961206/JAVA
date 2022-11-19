package alone;

abstract class Calculator2 {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	int _sum() {
		return this.left + this.right;
	};

	int _avg() {
		return _sum() / 2;
	};

	public abstract void sum(); // 추상메소드니까 틀만.

	public abstract void avg(); // 추상메소드니까 틀만.

	public void run() {
		sum();
		avg();
	}
}

class CalculatorDecoPlus extends Calculator2 {
	public void sum() {
		System.out.println("+ sum :" + _sum());
	} // _sum() 메소드가 CalculatorDecoPlus에 없으니까 
	  // 부모인 Calculator2의 것을 사용함. 

	public void avg() {
		System.out.println("+ avg :" + _avg());
	}
}

class CalculatorDecoMinus extends Calculator2 {
	public void sum() {
		System.out.println("- sum :" + _sum());
	}

	public void avg() {
		System.out.println("- avg :" + _avg());
	}
}

public class A1106_abstract2 {
	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();

		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}

}
