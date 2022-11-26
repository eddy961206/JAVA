package lotto;

import java.util.ArrayList;

public class Lotto {
	ArrayList<Integer> lotto_num_list = new ArrayList<>();
	static int count;
	String type;
	
	Lotto() {}
	
	Lotto(int[] temp_num){
		count++;
		for (int i = 0; i < 6; i++) {
			lotto_num_list.add(temp_num[i]);
		}
	}

	
}
