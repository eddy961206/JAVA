package alone;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class A1118_Queue {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while (true) {
			System.out.print(">>");
			try {
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다");
					System.out.println(" history - 최근에 입력한 명령어를"+ MAX_SIZE+"개 보여줍니다");
					
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					//입력 받은 명령어를 저장하고,
					save(input);
					
					//LinkedList의 내용을 보여준다
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while (it.hasNext()) {
						System.out.println(++i+"."+it.next());
					}
					
				} else {
					save(input);
					System.out.println(input);
				} // if(input.equalsIgnoreCase("q")) {
				
				
			} catch (Exception e) {
				System.out.println("예외 발생 : 입력오류입니다.");
			} 
		}//while

	}// main

	public static void save(String input) {
		// queue에 저장
		if(!"".equals(input)) //(!input.equals("")로 했을때 input이 null이면 오류걸리니까.
			q.offer(input);
		
		// queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제하다.
		if(q.size() > MAX_SIZE) q.remove();
		
	}

}// class
