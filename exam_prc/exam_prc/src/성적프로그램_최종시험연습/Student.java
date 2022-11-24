package 성적프로그램_최종시험연습;

import java.util.Scanner;

public class Student {
	String stuNum;
	String name;
	int kor,eng,math,total,rank;
	double avg;
	static int count;
	
	
	{
		count++;
		stuNum = String.format("s%04d", count); 
	}
	
	public Student() {}


	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
		avg = total/3.0;
	}


	@Override
	public String toString() {
		return String.format("%s %s %d %d %d %d %.2f %d \r\n", stuNum, name, kor, eng, math, total, avg, rank);
	}
	
	
	
	
}
