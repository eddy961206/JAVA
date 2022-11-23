package p1123;

import java.util.ArrayList;
import java.util.Scanner;

public class J1123_04_indexOf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "안녕안녕안녕";
//		String str = "안녕! 아침인사를 합니다. 안녕, 점심인사를 합니다. 안녕. 저녁인사를 합니다.";
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count  = 0;
		System.out.println(str);
		System.out.println();
		while(true) {
			count = 0;
			list.removeAll(list);
			System.out.println("\n검색하려는 단어를 입력하세요. >>");
			String input = scan.next();
			// 검색된 위치와 개수를 출력하시오.
			int idx = str.indexOf(input); // 인덱스 번호
			while (idx != -1) {
				list.add(idx);
				idx = str.indexOf(input, idx+1);
				count++;
			}
			
			for(int i =0; i<list.size(); i++) {
				System.out.println("검색된 위치 : " + list.get(i));
			}
			System.out.printf("갯수 : %d개\n",count);
			
		}
		
		
		
		
		
		
//		String str = "Hello! How are you!";
//		//			  0123456789..
//		String word = "o";
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		int idx = str.indexOf(word); //o의 위치 인덱스
//		
//		while(idx != -1) {  //'o'가 없을때까지 반복
//			list.add(idx); 
//			// 처음 idx 4 두번째는 인덱스 5 이상부터 찾아
//			idx = str.indexOf(word, idx+word.length());
//		}//while
//		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
//		System.out.printf("검색된 갯수 : %d \n",list.size());
		
		
	}

}
