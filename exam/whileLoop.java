package exam;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문
		// 프로그램내에서 똑같은 명령을 일정 횟수 반복하여 수행하도록
		// 제어하는 명령문
		// 프로그램이 처리하는 대부분의 코드는 반복적인 형태가 많음
		// 가장 많이 사용하는 제어문
		// 1. while문
		// 2. do/while문
		// 3. for문
		// 4. Enhanced for문
		
		// 반복문 진짜 필요할까?
		// 반복문을 통해 불필요한 작업을 최소화 할수 있음
		
		// while
		// 특정한 조건을 만족할때까지 계속해서 주어진 명령문을 반복 실행.
		
//		while(조건식) {
//			조건식의 결과가 참인동안 반복적으로 실행하고자 하는 명령문.
//		}
		
		// while문 사용시 주의사항
		// while문은 조건이 참인동안 계속 수행하는 반복문 이기 때문에
		// 만약 종료지점이 명확하지 않다면 끝도 없이 반복.
		// while문 사용시에는 반드시 종료조건을 잘 달아주어야한다.
//		int a = 0;
//		while(a<10) {
//			System.out.println("나는 계속 실행중이야~");
//		}
		
		//while문의 종료조건 부여방법 1
		//while문을 컨트롤할 변수를 선언하고 
		//그 변수의 값을 반복마다 증가시켜서 결국에는 false 조건을
		//만족할수 있도록 처리한다.
//		int a = 0;
//		while(a<10) {
//			a++;
//			System.out.printf("나는 계속 실행중이야~ %d", a);
//			System.out.println();
//		}
		//while 종료조건 부여방법2
//		int a = 0;
//		while(true) {
//			
//			a++;
//			System.out.printf("나는 계속 실행중이야~ %d", a);
//			System.out.println();
//			if(a==10) {
//				break;
//			}
//		}		
		
//		while문의 응용
//	    가게의 하루장사!(커피 타이쿤)
//      하루의 커피수량을 5개로 가정하고 
//      만약 커피가 다 팔리면 프로그램을 종료.
//      커피를 다팔았을때 그날의 최종 정산 결과를 출력.
		Scanner s = new Scanner(System.in);
		int coffee = 5;
		int money = 0;
		int result = 0;
		while(coffee > 0) {
			System.out.println("손님이 왔습니다. 커피를 얼마에 파시겠습니까?");
			money = s.nextInt();
			coffee--;
			System.out.println("남은 커피의 수는"+coffee+"개 입니다.");
			money +=money;
		}
		
		System.out.printf("최종 정산 금액 : %d" , money);
		
//		문제) 점수를 입력받아 80점 이상이면 합격메시지를
//		그렇지 않으면 불합격 메시지를 출력하는 작업을 반복하다가
//		0에서 100점 이외의 점수가 입력되면 종료하는 프로그램을 작성해보세요
		
	}

}
