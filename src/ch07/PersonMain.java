package ch07;

import java.util.Scanner;

public class PersonMain {
	
	static Person inputData() {
		Person p1 = new Person();
				
		Scanner s = new Scanner(System.in);
		System.out.println("첫번쩨 사람의 정보를 입력해주세요");
		
		System.out.println("이름 : ");
		String name = s.nextLine();
		p1.name= name;
				System.out.println("키  : ");
		float height = s.nextFloat();
		p1.height = height;
		
		System.out.println("몸무게  : ");
		float weight = s.nextFloat();
		p1.weight = weight;
		
		return p1;// 참조자료형들의 기본값 null- 아무것도 없음.
	}
	
	static void print(Person p) {
		System.out.printf("%S  %s  %s", 
			p.name, p.height,p.weight + "\t");
		
	}
	public static void main(String[] args) {
		Person p1 = inputData(); //위에있는것 을 고대로 넣는것
		Person p2 = inputData();
		
		print(p1);
		print(p2);
	}
	
}
