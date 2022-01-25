package classExam;

class MemberCall{
	int iv = 100;  // 인스턴스 변수 선언
	static int cv = 250; // 클래스 변수 선언

	// 인스턴스 맴버가 존재하는 시점에는 클래스 맴버는 항상 존재한다.
	// 클래스 맴버가 존재하는 시점에 인스턴스 맴버가 존재한다는 보장은 없다.
	
	int iv2 = cv; // 클래스 필드의 값을 인스턴스 필드에 삽입.
	//static int cv2 = iv; // 클래스 필드에 인스턴스 필드의값을 삽입하는것은 불가 
	static int cv2 = new MemberCall().iv; //객체 생성 방식으로 우회하는 방식이 존재함.
	
	void instanceMethod1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod1() {
		//System.out.println(iv);
		System.out.println(cv);
	}
	
}


public class StaticExam {
	public static void main(String[] args) {
		MemberCall me = new MemberCall();
		
		System.out.println(me.cv);
		System.out.println(me.iv);
		System.out.println(me.iv2);
		
	}
}
