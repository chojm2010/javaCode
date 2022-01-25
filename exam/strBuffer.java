package exam;

public class strBuffer {
	public static void main(String[] args) {
	// stringbuffer : 문자열을 추가하거나 변경할때 주로 사용하는 자료형
	// 문자 추가시 객체를 따로 생성할 필요가 없기 때문에 메모리 사용에서 이득을
	// 많이 가져갈수 있음.
		
	// stringBuffer의 모순점
	// 자료형 크기 자체가 무거운편.(string의 2배)
	// String과 StringBuffer는 전략적으로 선언이 필요	
		
	// StringBuffer : 변경작업이 많을때
	// String : 변경작업이 거의 없을때.
		
	// 퀴즈
	// 다음의 문장을 출력해보세요(방법은 자유롭게)
	// hello 2022 java web devTeam
	StringBuffer sb = new StringBuffer();
	sb.append("hello");
	sb.append(" ");
	sb.append("2022");
	sb.append(" ");
	sb.append("java");	
	sb.insert(0, "everybody");
	
	String result = sb.toString();
	System.out.println(result);
	
	String result2 = "";
	result2 += "hello";
	result2 += "test";
	
	}
}
