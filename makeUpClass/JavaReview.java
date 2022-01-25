package makeUpClass;

public class JavaReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JVM
		// 어떠한 환경에서도 자바를 실행해주는 가상 머신.
		//  -> java <-> jvm 과 상호 작용
		//  -> java -> os, system에 독립적 -> 다른 os에서 프로그램 변경을 하지 않아도
		//  ->   실행이 가능
		//   oracle homepage -> SE 다운로드 
		
		// JDK (Java Development Kit, 자바 개발 도구)
		//  = 개발에 필요한 실행파일등을 담고 있는 도구 -> 
		
		//변수선언 연습
		// 변수선언 규칙
		// 1. 변수명 앞에 숫자는 불가
		// 2. 변수명에 제한은 없지만 변수명은 의미를 파악하기 쉽도록 작성.
		// 3. 예약어 사용불가 
		// 4. 특수문자는 _, $만 허용
		
		
		// 아래처럼 변수명을 최대한 의미가 있고 알아보기 쉽도록 작성할것
		// int emp_hr_code = 10;
		
		//형변환
		// 자바의 경우 변수의 타입 지정이 매우 중요.
		// 서로 다른 타입의 피연산자간 연산을 수행해야할때 한쪽의 타입을
		// 변경해 주는것
		
		// 연산자
		// 어떠한 연산을 수행하는 기호.
		// 피연산자 -> 연산자의 작업대상
		
		// 1. 산술연산자(사칙연산, %, shift 연산)
		
		// 2. 비교연산자(>, <, >=, <=, ==, !=)
		// 이상, 이하, 미만, 초과, 동등, 비동등
		
		// 3. 논리연산자
		// AND, OR, NOT
		// AND : && / 둘다 참이여아만 참인조건 1*1 = 1
		// OR : || / 둘중 하나라도 참이면 참인조건 0+1 = 1
		
		// 4. 삼항연산자
		// 조건식 ? 참일때값 : 거짓일때값
		int num1 = 30, num2 = 30, num3 =25;
		int result;
		int result2;
		//둘중 누가더 크냐?
		result = (num1 - num2 > 0) ? num1 : num2;
		
		result2 = (result - num3 > 0) ? result: num3;
		System.out.println(result2);
		//문제
		//다음 3개의 변수중 가장 큰수를 삼항연산자로만 찾아보세요
		
		
		
		
	}

}
