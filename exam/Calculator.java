package exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 계산기 만들기
		// 계산기 기능 최소사항
		// 1. 최소 2개 이상의 숫자를 입력받을것(2개도 ok)
		// 2. 입력받은 2개의 숫자의 사칙연산이 가능해야한다.
		
		// 2022/01/13 조준모 계산기 기능추가
		// 추가사항 : 연산별 기능 정리
//		- 수행할 연산을 사용자가 입력하도록 처리하세요(사칙연산)          
//	    - 연산자가 +,-,*,/ 이외의 문자가 들어오면 
//	          해당연산은 수행할수 없습니다.
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("계산기 입니다. 연산할 부호를 입력해주세요.");
		char code = in.next().charAt(0);
		System.out.println("첫번째수 입력");
		int a = in.nextInt();
		System.out.println("두번째수 입력");
		int b = in.nextInt();

		switch(code) {		
			case '+':
				System.out.println("계산결과");
				System.out.println("덧셈 : " + (a+b));
				break;
			case '-':
				System.out.println("계산결과");
				System.out.println("뺄셈 : " + (a-b));
				break;
			case '*':
				System.out.println("계산결과");
				System.out.println("곱셈 : " + (a*b));
				break;
			case '/':
				System.out.println("계산결과");
				System.out.println("나눗셈 : " + (a/b));
				break;
			default:
				System.out.println("연산부호를 잘못 입력했습니다.");
		}
		
		
		
		// 계산기 기능개조 1(문제)
		// 만약 a가 b보다 작으면 b-a로 진행하세요.		
		
		
		// 계산기 기능개조 2(문제)
		// 만약 a가 b보다 작으면 b/a로 진행하세요.
		
		
		
	}

}
