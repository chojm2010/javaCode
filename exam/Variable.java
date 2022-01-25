package exam;

public class Variable {

	public static void main(String[] args) {
		// 변수 : 변하는 수.
		// 변수의 이름은 개발자가 마음대로 지을수 있음
		// but 규칙은 있음.
		
		
		// 변수명 선언의 규칙
		// 1. 숫자로 시작하면 안된다.
		// 2. $, _ 이외의 특수문자는 사용 불가.
		// 3. 키워드는 변수명으로 사용할수 없음.
		//    - new, char, case, catch, if, for, try, this
		//      throw, import, goto, do, while
		
		// 자바에서의 변수명 지정
		// 변수의 타입과 변수 명을 작성
		int myvariable = 1000000000;
		String test = "출력테스트";
		//System.out.println(myvariable);
		//System.out.println(test);
		
		// 정수형 연산(숫자연산)
		int a = 30;
		int b = 15;
		int c = 9;
		//System.out.println(a+b); // 10 + 15
		//System.out.println(a-b); // 10 - 15
		//System.out.println(a*b); // 10 * 15
		//System.out.println(a/b); // 10 / 15
		
		//System.out.println(a%c); // 30 / 9의 나머지
		//System.out.println(b%c); // 15 / 9의 나머지
		
		// 증감연산
		// 기호를 이용해서 값을 증가시키거나 감소 시킬수 있는 연산.
		int test1 = 0;
		int test2 = 5;
		
		// 증감연산자는 연산자의 위치에 따라 계산되는 순서가 다르다.
		
		//test1++; //값이 참조된 후에 증가
		//++test1; //값이 참조되기 전에 증가
		//test2--;
		//System.out.println(test1);
		//System.out.println(test2);
		//System.out.println(++test1);
		//System.out.println(--test2);
		System.out.println(test1++);
		System.out.println(test2--);
		System.out.println(test1);
		System.out.println(test2);
		
		
		// 자바의 자료형
		// 정수형
		// 1. int : 기본정수형 / 4byte(32bit) / -2^31 ~ 2^31-1 / -21억~ 21억
		// 2. byte : 1byte(8bit) / -2^7 ~ 2^7-1 / -128 ~ 127
		// 3. short : 2byte(16bit) /-2^15 ~ 2^15-1 / -32768~32767
		// 4. long : 8byte(64bit) / -2^63 ~ 2^63-1
		
		// 문자열 vs 문자형(문자)
		// 문자열 : 여러개의 문자 / 문자형 : 한개의 문자
		// 문자열
		// 1. String : 1byte 
		// 2. StringBuffer
		// 문자형
		// 1. char : 2byte
		
		// 실수형.
		// 1. float : 4byte 
		// 2. double : 8byte 
		
		// 논리형
		// 1. boolean : true / false 
		
		
		
	}

}
