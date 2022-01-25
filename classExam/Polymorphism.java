package classExam;
//문제
public abstract class Dog{
	// 필드 : 색깔
	public String color;
	// 기본 행동 : 깨물기, 밥먹기, 짖기,
	public void bite() {
		System.out.println("깨물기");
	}
	public void eat() {
		System.out.println("밥먹기");
	}
	public void bowwow() {
		System.out.println("으르릉왈왈");
	}
}
class Viggle extends Dog{
	
}
class GoldenRetriever extends Dog{
	public void swim() {
		System.out.println("헤엄치기!");
	}
}
// 부모클래스 Dog를 상속받는
// Viggle 클래스와 GoldenRetriver 클래스를 생성하시고
// 이중 GoldenRetriver 클래스는 수영을 할수 있다 가정하고 
// swim 메서드를 추가하세요

// Dog 클래스의 기본기능


public class Polymorphism {

	public static void main(String[] args) {
		
		// 객체의 형변환 -> 바꾼 자료형으로 사용하겠다.
		//  - 인스턴스가 변하는 것은 아니다.
//		Dog d1 = new Dog();
		//GoldenRetriever d2 = new GoldenRetriever();
		//아래의 코드는 개는 리트리버다 라고 얘기하는것과 같음
		//GoldenRetriever d2 = (GoldenRetriever)d1;
		
		// 비글은 개다 라고 얘기하는것과 같음.
		// 객체의 형변환
//		Dog dd = new Viggle(); 
//		Viggle v1 = (Viggle)dd;
		
		// 리트리버는 개다
		// 개는 리트리버다
		
		
		// 다형성
		// 객체지향 언어의 특성중 하나
		// 여러가지 형태에 속할수 있는 성질이란 뜻으로
		// 하나의 객체 인스턴스가 여러가지 자료형을 가질수 있는것.
		
		// is-a
		// 1. 산소는 기체이다
		// 2. 사모에드는 개다
		// 3. 코리안숏헤어는 고양이다.
		// 4. 프로그래밍 언어는 JAVA다.  -- x
		
		// 문제
		// 부모클래스 Dog를 상속받는
		// Viggle 클래스와 GoldenRetriver 클래스를 생성하시고
		// 이중 GoldenRetriver 클래스는 수영을 할수 있다 가정하고 
		// swim 메서드를 추가하세요
		
		// Dog 클래스의 기본기능
		// 필드 : 색깔
		// 기본 행동 : 깨물기, 밥먹기, 짖기,
		
		//instanceof
		// 해당 인스턴스가 특정 클래스의 인스턴스인지 확인하는 연산자.
		// (변수명or 인스턴스명) instanceof (클래스명)
		Dog dog = new GoldenRetriever();
		
		System.out.println(dog instanceof GoldenRetriever); //true
		System.out.println(dog instanceof Dog); // 
		System.out.println(dog instanceof Viggle);
		
	}

}
