package makeUpClass;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자판기 구현하기
		
		// 1. 음료 리스트 출력
		// 음료 리스트를 가질 배열,
		String[] beverageNames =  {"환타", "밀키스", "펩시"};
		// 음료의 가격을 가질 배열
		int[] beverageCost = {1100,1500, 1000};
		// 음료의 수량을 가질 배열
		int[] beverageStock = {10, 0, 3};
		// 입금할돈
		int money = 0;
		// 자판기 음료수 선택 코드
		int select = 0;
		
		int isExit = 0;
		//--------------------------------------------------
		//음료수 리스트를 출력
		do {
		System.out.println("================================");
		System.out.println("뽑고싶은 음료수를 선택하세요!");
		System.out.println("================================");
		for(int i=0; i<beverageNames.length; i++) {
			System.out.printf("%d %s: %d 남은수량 : %d\n", 
					i+1, beverageNames[i], beverageCost[i], beverageStock[i]); 
		}
		
		//2. 돈투입
		do {
			System.out.println("돈을 입금해주세요");
			Scanner sc = new Scanner(System.in);
			money = money + sc.nextInt();
		//3. 음료선택
		//4. 재고확인(분기)
		// 재고가 남았는지 남지 않았는지를 판단하는 기준
			do {
				System.out.println("음료수를 선택해 주세요");
				select = sc.nextInt();
				if(beverageStock[select-1] < 1) {
					System.out.println("해당 음료는 존재하지 않습니다.");
				}
			}while(beverageStock[select-1] <1);
		//  -재고 남았을때
		//    5번조건으로 이동
		//  -재고가 없을떄
		//    음료가 부족하다 라는 메세지 출력후 다시 선택으로 도입
		
		//5. 돈확인
		// - 입력한돈(투입한돈) : money
		//   비교대상....? : 선택한 음료수[beverageCost[select-1]
		//  - 음료수금액보다 돈이 클때
			if(money<beverageCost[select-1]) {
				System.out.println("잔액이 부족합니다.");
			//  - 음료수금액보다 돈이 작을때
				//	    투입한 금액이 부족하다 라는 메세지 출력후 돈 투입(2번)으로 도입
			}
		}while(money<beverageCost[select-1]);
		
		
		
		if(money >= beverageCost[select-1]) {
			money = money-beverageCost[select-1];
			beverageStock[select-1] -=1; 
			//6. 음료 재고 차감 후 메세지 출력
			//  - 음료 구매 완료.
			//7. 남은 금액 출력.
			System.out.printf("%s 음료수 구매 완료\n", beverageNames[select-1]);
			System.out.printf("남은 금액은 %d원 입니다 \n",money);
			//8. 거스름돈을 받을것인지 받지 않을것인지?
			System.out.println("거스름돈을 받겠습니까? Y는1번 N은0번");
			//   - 거스름돈을 받는경우
			Scanner sc1 = new Scanner(System.in);
			isExit = sc1.nextInt();
			//      자판기 이용 종료
			//   - 거스름돈을 받지 않는경우
			//      1번으로 도입
		}
		
	
		
		}while(isExit == 0);
		
		
		System.out.println("자판기를 이용해주셔서 감사합니다 ㅂㅂ");
		
		
	}

}
