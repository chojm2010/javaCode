package interFaceExam;

public interface Doggy2 {

	// 인터페이스도 추상클래스 처럼 abstract 메서드를 이용해서
	// 추상메서드를 생성한다.
	
	// 인터페이스의 특징 
	// 1. 생성자를 선언 및 정의할수 없음
	//  - 인터페이스의 사용 용도 
	//    추상클래스는 확장을 위해서 사용하지만 
	//    인터페이스는 메서드의 규약을 위해 사용하는 경우가 많기 때문.
	// 2. 인터페이스 내에서 선언하는 필드는 모두 상수형태로 선언.
	// 3. 인터페이스 내에서 선언된 메서드는 추상 메서드로 작업해야한다.
	//     - 자바 1.8버전 기준
	// 4. 상속받는 클래스는 반드시 인터페이스의 메서드를 오버라이딩 해야한다.
	// 5. 인터페이스의 내용을 실제로 구현하는 클래스는 implements해야한다.
	
	// 추상클래스 vs 인터페이스
	// 1. 생성자 정의 가능여부
	// 2. 변수 접근 제어 지시자 다양성 여부
	// 3. 추상 메서드 다양성 여부
	
	public static final String color = "검정";
	
	public abstract void playing();
	
	public abstract void sleep();
	
	public abstract void eat();
	
	
	
	
	
}
