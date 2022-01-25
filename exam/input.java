package exam;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지금까지 데이터를 사용하려면?
		// 변수로 입력받아 해당 변수의 내용에서 처리.
		// 하지만 Scanner 클래스를 이용해서 프로그램 사용자로부터 데이터를
		// 입력받는것도 가능하다.
		
		// Scanner 메서드 정리
		// boolean : nextBoolean()
		// byte : nextByte()
		// short : nextShort()
		// int : nextInt()
		// long : nextLong()
		// float : nextFloat()
		// double : nextDouble()
		// String : next(), nextLine()
		
		
		
		// 데이터를 입력받기위해 Scanner 객체 생성.
		Scanner in = new Scanner(System.in);
		
		// next, nextline 메서드를 이용해서 사용자로부터 데이터를 입력받음
		// next() : 공백전까지의 문자를 입력받음
		// nextLine() : 입력한 문자 전체를 입력받음(개행을 기준으로 처리)
		//String test = in.next();
		//String test2 = in.nextLine();
		
		// 숫자 입력
		System.out.println("두수의 합을 계산하는 프로그램입니다.");
		System.out.println("첫번째 숫자를 입력해주세요");
		int num = in.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int num2 = in.nextInt();
		
		//System.out.println(test);
		//System.out.println(test2);
		
		// 두 수를 입력받아서 결과 더하기?
		//int a = 10;
		//int b = 20;	
		int result = 0;
		//result = num + num2;
		//System.out.println(num+num2);
		
		System.out.println("두수의 합 : " + (num+num2));
		
	}

}
