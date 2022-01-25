package exam;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for + 배열 -> 숫자 입력받아 출력하기.
		
		// 필요한 변수들
		int count = 0; // 1. 입력받을 숫자의 개수
		int[] num; // 2. 입력받을 배열
		int findNum = 0;  // 3. 검색 할 숫자

		Scanner scn = new Scanner(System.in);
		// 1. 배열의 크기를 사용자에게서 입력받음
		System.out.println("생성 할 배열의 크기를 입력하세요.");
		count = scn.nextInt();
		num = new int[count];
		// 2. 배열의 크기만큼 숫자를 배열에 삽입
		System.out.println(count + "개의 숫자를 입력하세요");
		for(int a = 0; a<num.length; a++) {
			num[a] = scn.nextInt();
		}
		// 3. 배열에 들어있는 숫자를 검색
		boolean chk = false;
		System.out.println("검색할 숫자 ? :");
		findNum = scn.nextInt();
		for(int a = 0; a<num.length; a++) {
			if (findNum == num[a]) {
				chk = true;
				System.out.println(findNum+"의 위치는" +a+ "번째 입니다.");
			}
			
		}// for end
		
		if(!chk) {
			System.out.println(findNum+"는 존재하지 않습니다.");
		}
		
		
		
	}

}
