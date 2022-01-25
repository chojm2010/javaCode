package exam;

import java.util.Scanner;

public class lunchQuiz0112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//이름, 나이, 키(소수점 단위1자리까지), 전화번호, 몸무게
		
		System.out.println("개인정보 입력 프로그램입니다.");
		
		System.out.println("사용자의 이름을 입력해주세요");
		String name = sc.nextLine();
		
		System.out.println("사용자의 나이를 입력해주세요");
		int age = sc.nextInt();
		System.out.println("사용자의 키를 입력해주세요");
		float height = sc.nextFloat();
		sc.nextLine();
		System.out.println("사용자의 전화번호를 입력해주세요");
		String phone = sc.nextLine();
		System.out.println("사용자의 몸무게를 입력해주세요");
		float weight = sc.nextFloat();
		
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("전화번호 : " + phone);
		System.out.println("체중 : " + weight);
	}

}
