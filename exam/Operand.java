package exam;

public class Operand {

	public static void main(String[] args) {
		// 연산자와 항
		// 항(operand) : 연산에 사용되는 값
		// 연산자(operator) : 항을 이용하여 연산하는 기호
		
		// 연산자의 종류
		// 1. 산술연산자(사칙연산)
		
		// 2. 대입연산자
		//    - 변수에 값을 대입할때 사용하는 연산자.( ex ) =, +=, -=, *=, /=) 
		//  좌항을 a, 우항을 b라 두고 진행. 
		//  a = b : 변수 a에 b의 내용을 할당.
		//  a +=b : 변수 a에 b의 내용을 더한후 결과값을 할당.
		//  a -=b : 변수 a에 b의 내용을 뺀 후 결과값을 할당.
		//  a *=b : 변수 a에 b의 내용을 곱한후 결과값을 할당.
		//  a /=b : 변수 a에 b의 내용을 나눈후 몫 값을 할당.
		//  a %=b : 변수 a에 b의 내용을 나눈후 나머지 값을 할당.
		//  a &=b : 변수 a에 변수 a와 b의 내용을 and 연산 후 결과값을 할당.
		//  a |=b : 변수 a에 변수 a와 b의 내용을 or 연산 후 할당.
		//  a ^=b : 변수 a에 변수 a와 b의 내용을 xor 연산 후 할당.
		
		int a = 4, b = 5;
		//a +=b; // a = a+b
		//System.out.println(a);
		//System.out.print(b);
		int result1 = a -=b;
		int result2 = a =-b;
		
		System.out.println(result1);
		System.out.println(result2);
		   
		// 3. 증감연산자
		
		// 4. 비교연산자
		//    - 피연산자 사이의 상대적 크기를 판단하는 연산자
		//      좌항을 a, 우항을 b라 두고 진행.
		//      a==b : a와 b가 같으면 True를 리턴
		//      a!=b : a와 b가 다르면 True를 리턴
		//		a>b :  a가 b를 초과하면 True를 리턴
		//		a>=b : a가 b 이상이면 True를 리턴
		//		a<b :  a가 b 미만이면 True를 리턴
		//		a<=b : a가 b 이하면 True를 리턴
		//		int num1 = 10;
		//		int num2 = 20;
		//		
		//		System.out.println((num1 <= num2));
		
	
		// 5. 논리연산자
		// 주어진 논리식을 판단해 참과 거짓을 결정하는 연산자
		// 주로 조건문에서 많이 활용된다.
		//  AND     OR
		//	x y     x y
		//  0 0 0   0 0 0
		//  0 1	0	0 1 1
		//  1 0	0	1 0 1
		//  1 1	1	1 1 1
		
		// NOT : 0->1 / 1->0 결과가 참이면 거짓을 출력 결과가 거짓이면 참을 출력.
		// !<--- not
		// && <--- and
		// || <--- or
		
		
		// 논리연산자 예시
		int test1 = 30, test2=40;
		
		boolean result3; 
		// AND 조건 예시
		//result3 = (test1 > 20) && (test2 > 50);
		
		//OR 조건 예시
		result3 = (test1 > 20) || (test2 > 50);
		
		System.out.println(result3);
		
		// AND OR 조건 예시2 
		// 1. 회원가입을 받는데 조건이 나이가 성인 이상이거나 학력이 대졸인 사람 
		 //   - OR조건
		// 2. 쌀을 사러 마트에 왔는데 쌀이 이천에서 만들어졌고 가격이 6만원 이하인 쌀.
		//    - AND조건
		
		
		// 6. 삼항연산자, instanceof 연산자
		// 피연산자가 3개인 조건연산자.
		// ex) 조건식 ? 리턴값1 : 리턴값2
		//     ? 앞의 조건식에따라 결과값이 참이면 리턴값1번 출력
		// 				       결과값이 거짓이면 리턴값2번 출력
		
		//삼항연산자 예시
		int threeOper1 = 15, threeOper2 = 20;
		String result5;
		
		result5 = (threeOper1 - threeOper2 < 0) ? "양수" :"음수" ;
		System.out.println(result5);
		
		
		
		
		
		
		
		
	}

}
