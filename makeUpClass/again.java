package makeUpClass;

public class again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문 : 명령어를(코드)반복적으로 실행하는 방법
		// for, while, do while, foreach  
		// break, continue
		// for vs while
		// for문은 반복횟수가 정해져 있을때 사용하면 유리.
		// while은 반복횟수가 기약없을때 사용하면 유리
		
		// for(초기값 ; 조건값 ; 증감값) 
		// 
		
//		for(int a=0; a<10; a++) {
//			System.out.println(a);
//		}
	
		// while문
		// 반복 횟수가 정해져 있지 않을때 사용.
		// while문은 종료조건을 만나지 못하면 무한으로 반복한다.
//		while(조건식) {
//			//반복할 내용
//		}
		int b = 0;
		while(true) {
			System.out.println("나는 멈추지 않는 폭주기관차 ㅋㅋ");
			b++;
			if(b==10) {
				System.out.println("슈퍼맨이 기차를 부셔버림");
				break;
			}
		}
	
	}
	
	

}
