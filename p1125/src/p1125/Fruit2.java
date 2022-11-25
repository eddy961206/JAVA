package p1125;

public class Fruit2 implements Comparable<Fruit>{
	String name;
	int price;
	
	Fruit2(){}
	
	Fruit2(String name, int price){
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Fruit o) {
		
//		if(o.price<this.price) {
//			return 1; //1: 순차정렬 -1: 역순정렬
//		}else if(o.price>this.price) {
//			return -1;
//		} //오름차순 (순차정렬)
		
		if(o.price<this.price) {
			return -1; 
		}else if(o.price>this.price) {
			return 1; 
		} //내림차순
		return 0;
	}
	
}
