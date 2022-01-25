package exam;

import java.util.Scanner;

public class quizAns0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.콜라 자판기 만들기
		// 문제해결 ROADMAP
		// - 콜라의 가격은 1000원
		int cola = 1000;
		// 자판기에 금액 투입
		//  - 금액투입 = 사용자가 가격 직접 입력
		//             (Scanner 클래스 호출)
		int charge;
		Scanner sc = new Scanner(System.in);
		System.out.println("콜라자판기 입니다. 금액을 투입해 주세요!");
		charge = sc.nextInt();
		System.out.println(charge);
		// 투입한 금액보다 콜라의 가격이 클 때
		// 잔돈에 대한(얼마남았냐) 출력값이 필요.(잔돈 계산이 필요)
		if(charge > cola) {
			System.out.printf("콜라를 뽑았습니다. 잔액은 %d원 남았습니다.", 
					(charge-cola));
		}
		// 투입한 금액과 콜라의 가격이 같을 때
		else if(charge==cola) {
			System.out.println("콜라를 뽑았습니다. 잔액은 없습니다.");
		}
		// 투입한 금액이 콜라의 가격보다 클때 
		else if(charge<cola) {
			System.out.println("투입한 금액이 작아 콜라를 뽑을수 없습니다.");
		}
		else {
			System.out.println("?????????? 에러입니다.");
		}
	}

}
