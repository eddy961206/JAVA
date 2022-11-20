package 예제;

class Country {
	String name;
	int gold;
	int silver;
	int bronze;
	int total;

	public Country() {
	}

	Country(String name, int gold, int silver, int bronze) {
		this.name = name;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
		total = this.gold + this.silver + this.bronze;
	}
	public String toString() {
		return String.format("%s : %d / %d / %d  total : %d\n", 
				this.name, this.gold, this.silver, this.bronze, this.total);
	}
	
}

public class 동계올림픽 {

	public static void main(String[] args) {
		Country[] countries = new Country[4];

		countries[0] = new Country("norway", 1, 2, 3);
		countries[1] = new Country("germany", 0, 0, 2);
		countries[2] = new Country("nederland", 3, 2, 3);
		countries[3] = new Country("canada", 6, 2, 2);

		for (int i = 0; i < 10; i++) {
			int r_num = (int) (Math.random() * 4);
			countries[r_num].gold++;
			countries[r_num].total = countries[r_num].gold + countries[r_num].silver + countries[r_num].bronze;
			r_num = (int) (Math.random() * 4);
			countries[r_num].silver++;
			countries[r_num].total = countries[r_num].gold + countries[r_num].silver + countries[r_num].bronze;
			r_num = (int) (Math.random() * 4);
			countries[r_num].bronze++;
			countries[r_num].total = countries[r_num].gold + countries[r_num].silver + countries[r_num].bronze;
		}
		
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i].toString());
		}

	}
}
