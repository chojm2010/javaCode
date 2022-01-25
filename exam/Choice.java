package exam;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제어문
		// 프로그램의 순차적인 흐름을 제어하는 방법
		// -> 순차적 흐름을 제어하고 이때 명령문을 통해 제어.
		// 제어문 : 조건문, 반복문,
		
		// 제어문에 속하는 명령문들은 중괄호로 둘러쌓여져 있음
		// 중괄호 영역을 블록이라 칭함.
		
		// 조건문
		// 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 하는 제어문.
		// if~ else / switch
		
		// if문
		// if (조건식) {
		//		조건이 참일때 실행하는 코드.
		//	}
		
		// 조건 생성.
		
		// 새벽까지 술을 마시고 택시를 타고 집에 가려하는데
		int money = 15000;
		// 잔액이 3만원 이상이면 택시를 타고 
//		if (30000<=money) {
//			System.out.println("택시타고 집에 가는중!");
//		}
//		// 그렇지 않으면 걸어간다.
//		else {
//			System.out.println("돈없어서 걸어 가는중 ㅜㅜ");
//		}
//		
		// 조건을 문자로 처리
		// 문자로 처리도 당연히 가능하다.
//		String stu1 = "대학생";
//		
//		if(stu1=="고등학생") {
//			System.out.println("청담고등학교로 가고 있습니다.");
//		}
	
		// 여러개의 조건을 가지는 조건문(else if)
		// 나이별 요금계산 프로그램
		// 코드에서 필요한것들
		// 정수형 변수(나이, 요금)
//		int age, charge;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("강남식당에 오신것을 환영합니다. 나이가 어떻게 되세요?");
//		age = sc.nextInt();
//		// 조건 
//		// 1. 0~6세 요금을 받지 않는다.
//		
//		if(age>0 && age<7) {
//			System.out.println("6세까지는 요금을 받지 않습니다");
//		}// 조건문 종료 블록
//		// 2. 7~12세는 미취학 아동으로 분류. 요금은 5000원을 받는다.
//		else if(age<=12) {
//			System.out.println("미취학 아동입니다 요금은 5천원 입니다.");
//		}// 미취학아동 조건 종료 블록
//		// 3. 13세~19세는 청소년으로 분류 요금은 10000원을 받는다.
//		else if(age<=19) {
//			System.out.println("청소년 입니다 요금은 10000원 입니다.");
//		}// 청소년 조건 종료 블록
//		// 4. 20세 부터는 성인으로 분류 요금은 15000원을 받는다.
//		else if(age>=20) {
//			System.out.println("성인입니다");
//		}
//		else {
//			System.out.println("잘못된값 입니다.");
//		}
		
		// 실습문제
		// 값을 입력받고 값이 0~100 사이면  
		// 입력한 값은 '입력받은값' 입니다.를 출력하시고
		// 100보다 큰 경우는 너무 큰 값을 입력하셨습니다. 를 출력
		// 0보다 작은값을 입력했다면 음수는 입력받을수 없습니다를
		// 출력해주세요.
		
		// 문제해결 ROADMAP
		
		
		// 0을 기준으로 움직인다.
		//  - 0보다 작은경우, 0~100 사이, 100 이상
		
		//값을 입력받을 변수 설정(입력받을 값이 정수)
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		num = scn.nextInt();
		// 1. 0보다 작은경우
		if(num<0) {
			System.out.println("음수는 입력하실수 없습니다.");
		}// if end
		// 2. 0~100 사이
		else if(num>=0 && num <=100) {
			System.out.printf("입력받은 값은 %d 입니다", num);
		}
		// 3. 100 이상
		else if(num>=101) {
			System.out.println("너무 큰값을 입력하셨습니다.");
		}
		
		// 순서도
		// 어떠한 일을 처리하는 과정.
		// 프로그래밍 뿐만 아니라 문제의 분석, 디자인설계에서도 사용.
		
		
	}

}
