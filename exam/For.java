package exam;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// for문
		// 반복문의 일종, while문과 다르게
		// 반복문 시작시 조건을 세부적으로 지정후 진행하는 문법
		
		//for (초기식; 조건식; 증감식){
		//
		//}
		
		//10번찍어서 안넘어가는 나무 없다.
//		int tree = 0;
//		for (int i=1; i<11; i++){
//			System.out.println("나무를 도끼로 "+i+"번째 찍었습니다.");
//		}
		//while vs do-while vs for
		//각각 어느때에 쓰이면 유리한가?
		//while : 조건 결과가 참/거짓 이거나, 사용자가 원하는 상황에서만 프로그램을 종료할때
		//do-while : 조건 결과가 참/거짓 이거나, 사용자가 원하는 상황에서만 프로그램을 종료할때
		//for : 특정 수의 범위, 횟수와 관련하여 반복될때 사용, 배열과 궁합이 좋음.
		
		//for문의 초기식, 조건식, 증감식은 생략이 가능.
		//나무에 스트레스를 푸는 벌목꾼
//		int i=0;
//		for(;;) {
//			i++;
//			System.out.println("나무를 도끼로 "+i+"번째 찍었습니다.");
//		}

		//for문 사용예시2
		//1~10까지 합을 더하되 짝수는 제외
		int result = 0;
		for(int i=0; i<10; i++) {
//			if(i%2!=0) {
//				result = result + i;// result +=i
//			}
			if(i%2==0) {
				//continue : 해당 키워드를 만날시 반복문의 처음으로 되돌아가는 키워드
				// 상황에따라 반복을 수행하고 싶지 않다면 사용하는 키워드
				continue;
			}
			result = result + i;
		}
		System.out.println(result);
		
		// for문의 응용
		// 구구단.
		// 구구단 3단을 출력하세요
		// ex) 3 * 1 = 3
		//     3 * 2 = 6
		//     3 * 9 = 27
		
		// 3단출력
		// 1. 3이라는 숫자가 하나 고정되어야하고
		// 2. 1~9까지 반복.
//		Scanner sc = new Scanner(System.in);
//		int gugu = 3;
//		for(int i=1; i<10; i++) {
//			System.out.println(gugu+" * "+ i + " = " + gugu * i);
//		}
		
		// for문의 중첩(이중 for문)
		// for문 안에 for문을 한번 더 사용할수 있음
		// 2단부터 9단까지 전부 출력
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+" * "+ j + " = " + i * j);
			}// for end
		}// for end
		
		
		
		
	}

}
