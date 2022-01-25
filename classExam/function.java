package classExam;

import java.util.Scanner;

public class function {

	public static void sayHi(String hello) {
		System.out.println(hello);
	}
	
	// 1부터 넘어온 파라미터까지의 합을 계산하는 함수.
	// 100 -> 결과값으로 5050;
	
	public static int calSum(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum +=i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		// 두수의 합을 구하는 함수.
		// 인수(argument)     = 값, 변수, 참조등 함수로 전달되는 값
		// 매개변수(parameter) = 함수, 메서드에서 사용되는 전달된 값을 받는 변수.
		String hello = "안녕하소";
		
		sayHi(hello); //변수 hello는 함수 sayHi로 전달될 인수.
		sayHi("아 도대체 모르겠네 ㅠㅠㅠ");
		
		int result=calSum(10);
		System.out.println(result);
		int result2 =mulNum(10, 20);
		System.out.println(result2);
		//문제
		//파라미터를 정수형으로 2개를 입력받아 
		//입력받은 두 수의 곱을 출력하는
		//mulNum 함수를 만들어 주세요.
	}
	//파라미터가 2개
	public static int mulNum(int num1, int num2) {
		//return : 함수를 종료하고 어떠한 값을 반환할때 사용하는 키워드
		return num1 * num2;
	}
	

}
