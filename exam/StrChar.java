package exam;

public class StrChar {

	public static void main(String[] args) {
		// 문자와 문자열
		// 문자(char)
		// 한 개의 문자값에 대한 자료형
		char a = 68; // 숫자(아스키코드) 혹은 유니코드로 작성하여 1개의 문자를 출력.
		System.out.println(a);
		// 아스키 코드 : 영문 알파벳을 사용하는 대표적인 문자 인코딩
		//             7비트 인코딩이 특징이고, 33개의 출력불가 제어문자와
		//			   95개의 출력가능문자들로 구성되어 있음(총 128)
		//             알파벳 대/소문자의 코드값이 다른것도 특징.
		//             A: 65, a: 97 / M :77, m : 109 / Z : 90, z: 122  
		
		// 유니코드 : 전 세계의 모든 문자를 컴퓨터에 일관되게 표현하고 다룰수 있도록
		//          설계된 산업 표준.(한국에서는 UTF-8을 일반적으로 사용)
		
		// 문자열 : 문장 
		// 리터럴 : 객체 생성없이 고정된 값을 그대로 대입하는 방법.
		// \문자열 리터럴 생성 방식
		String test1 = "happy day";
		String test2 = "happy day";
		// 생성자를 이용한 문자열 생성방식
		String test3 = new String("happy day");
		String test4 = new String("happy day");
		
		// 퀴즈
		//String test2 = "1234"; //문자열
		
		System.out.println(System.identityHashCode(test1));
		System.out.println(System.identityHashCode(test2));
		System.out.println(System.identityHashCode(test3));
		System.out.println(System.identityHashCode(test4));
		System.out.println(test3);
		
		//리터럴 vs 객체 생성자
		// 둘의 출력결과는 사실 똑같지만
		// 메모리에 할당되는 영역은 다르다.
		
		// 원시자료형 : 오직 리터럴로만 값을 세팅할수 있는 자료형 
		// int, long, double, float, boolean, char
		
		// String의 경우 리터럴과 객체 표현식을 모두 사용할수 있는 특별한 자료형.
	}
	

}
