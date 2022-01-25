package makeUpClass2;

class Mankind{
	//맴버변수(필드)
	// 클래스 내에 선언된 변수
	// 맴버변수 - 인스턴스변수, 정적변수
	
	// 인스턴스변수 : 인스턴스 생성후 접근가능한 변수
	// 인스턴스변수는 인스턴스의 생성과 소멸 생명주기와 동일.
	//  - 인스턴스가 소멸하면 인스턴스 변수도 소멸
	
	// 정적변수 : 인스턴스를 생성하지 않아도 접근가능한 변수.(클래스변수)
	//  -> mankind 클래스에서 동일한 메모리를 참조 하고 있어서 변수를 공유하는 상황.
	
	String name;   //인스턴스 변수
	int age;
	String gender;//인스턴스 변수
	static String nation = "korea"; // 정적변수
	
	//this : 자기자신 클래스를 지정.
	//       -> 인스턴스를 구별하기위한 방법(키워드).
	Mankind(String name ){
		this.name = name;
	}
	
	// 오버로딩
	// 여러개의 생성자나 메서드를 같은 이름으로 선언하되
	// 파라미터의 개수나 혹은 타입을 다르게주어 선언하는 방식.
	// -> 동명이인, 다른성격
	
	// 생성자 오버로딩, 메서드 오버로딩.
	Mankind(String name, int age ){
		this.name = name;
		this.age = age;
	}
	
	//메서드 : 객체의 행동(함수)
	// 메서드의 종류
	// 리턴값이 없는 메서드는 void 키워드를 사용해야 한다.
	// 리턴값이 있는 메서드는 내부에 return과 키워드가 int, String등의 타입이어야한다.
	// (키워드가 존재해야한다_)
	// 1. 리턴값이 있고 파라미터도 있는 메서드	
	int test(int a) {
		return 150;
	}
	// 2. 리턴값이 있지만 파라미터는 없는 메서드
	int test() {
		return 100;
	}
	// 3. 리턴값은 없지만 파라미터가 있는 메서드
	void chk_nation2(String nation) {
		if(nation=="japan") {
			System.out.println("일본인입니다.");
			return; // 리턴값 없는 리턴 키워드는 메서드 실행을 종료.
		}
		System.out.println("한국인입니다.");
	}
	// 4. 리턴값은 없지만 파라미터도 없는 메서드
	void chk_nation() {
		if(nation=="japan") {
			System.out.println("일본인입니다.");
			return; // 리턴값 없는 리턴 키워드는 메서드 실행을 종료.
		}
		System.out.println("한국인입니다.");
	}
	
}

public class ObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체지향 프로그래밍
		// 객체 : 현실세계의 사물, 물질
		//       현실세계에서 존재하는것을 컴퓨터의 세계로 구성할 대상.
		
		// 자바 -> 객체지향 언어. 클래스를 기반으로 모든 코드들이 구성.

		//객체지향 프로그래밍 : 유지보수의 어려움을 느꼈기 때문에 나온 개념.
		
		//객체의 속성. 행동.
		// 객체에는 속성과 행동이 존재
		// 객체의 속성 : 객체가 가지고 있거나 설명할수 있는 것들
		// 객체의 행동 : 객체가 할수 있는 행위.
		
		// 인간 -> 속성 : 이름, 나이, 성별, 키, 혈액형
		// 인간의 행동 : 밥먹기, 잠자기, 영화보기, 운동하기
		
		// 클래스 : 객체의 청사진
		// 프로그래밍에서 객체 생성에서 가장 작성해야할 코드.
		
		// 객체 생성.
		// 자료형 int, double, char -> 기본자료형 
		// String, Scanner -> 참조자료형.
		Mankind man1 = new Mankind("김코딩1", 31, "남자");
		
//		man1.age = 30;
//		man1.name = "김코딩";
//		man1.gender = "남자";
//		
		// 객체생성 -> 인스턴스 생성 or 클래스 생성
		// 객체설계 -> 클래스 설계
		
		// 클래스 내부에 선언된 변수 : 필드(맴버변수)
		System.out.println(man1.age);
		System.out.println(man1.nation);
		
		//
		
	}

}
