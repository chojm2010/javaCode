package classExam;

//2대의 car 클래스의 인스턴스를 선언해서 
//this 키워드가 무엇을 하는지 알아보기.
class CarTest{
	// 
	static int wheel = 4;
	
	String model;
	int speed;
	
	//생성자 
	CarTest(String model){
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(50);
//		for(int i=1;i==150;i++) {
//			this.setSpeed(i);
//			System.out.println(this.model +"speedUp"
//			   +"시속:"+this.speed+"km/h");
//		}
		
	}//run method end
	
	
}



public class classKeyword {

	public static void main(String[] args) {
		
		CarTest car1 = new CarTest("2021아반떼N");
		CarTest car2 = new CarTest("벤츠S클래스");
		
		System.out.println(car1.model);
		
		car1.run();
		car2.setSpeed(80);
		System.out.println("car1 speed : " +car1.speed);
		System.out.println("car2 speed : " +car2.speed);
		//car2.run();
		// this, static, final, super
		
		// 인스턴스 맴버
		// 객체를 생성한 후에 사용할수 있는 필드, 메서드
		// 인스턴스 필드와 메서드는 객체에 소속된 맴버이기 때문에
		// 객체(인스턴스) 없이는 사용이 힘들다.
		
		// this 
		// 객체별로 인스턴스 맴버에 접근하기위해 사용하는 키워드
		// this -> 참조변수로 인스턴스 자신을 가리킨다.
		// this를 사용할수 있는것은 인스턴스 맴버뿐이다.
		
		// this는 모든 인스턴스 메서드에 숨겨진 채로 존재.
		// this는 생성자와 메서드의 매개변수 이름이 필드와 동일할때
		// 인스턴스 맴버인 필드임을 명시하고자 할때 사용.
		
		// 문제
		// 붕어빵을만드는 FishBreadUp이라는 클래스를 생성해주세요.
		// 메인 클래스 이름은(main 메서드가 들어올 함수) FishMain으로 생성해주세요.
		
		// FishBreadUp 클래스에서 클래스변수 문자형변수 cream을 선언해주세요
		
		// FishBreadUp 클래스를 통해 인스턴스를 마음껏 생성해보세요.
		// 생성한 인스턴스를 통해 cream 필드를 채워 넣으시고
		// 만들고싶은 붕어빵들을 완성해주세요!
		
		// static(고정)
		// 클래스에 고정된 멤버로서 객체를 생성하지 않고 사용할수 있는 필드와 메서드.
		// 클래스에 소속된 멤버(메서드영역)이기때문에 클래스 멤버라고도 부른다.
		// 접근지정자 선언후 사용하거나 타입 지정전 사용
		// 클래스의 로딩이 끝난후에 사용이 가능하다
		
		// 클래스에서 어떠한 필드에 static을 선언한다 = 해당 클래스가 생성할 객체에서 해당 필드는 모두 공통된값 
		
		// 클래스 메서드(static)
		// 인스턴스 메서드 : 메서드 작업 수행시 (메서드 실행시) 필드를 필요로 하는 메서드.
		// static 메서드 : 인스턴스와 관계없는 메서드를 클래스 메서드(static메서드)로 정의
		//   - 인스턴스 변수(클래스 필드)가 필요 없는 메서드 생성시.
		//   - 클래스 메서드(static 메서드)의 경우는 인스턴스 생성 없이 호출이 가능하다.
		//   - 클래스 메서드 호출시 인스턴스가 존재 할수도 하지 않을수도 있음.
		//   - 위의 이유로 클래스 메서드에서 인스턴스 변수를 사용하지 말아야한다.
		
		// 인스턴스 맴버가 존재하는 시점에는 클래스 맴버는 항상 존재한다.
		// 클래스 맴버가 존재하는 시점에 인스턴스 맴버가 존재한다는 보장은 없다.
		
		// final
		// 상속과 관련된 키워드
		// 초기값이 저장되면 이것이 최종값이 되어서 프로그램 실행도중 수정할수 없도록 처리하는 키워드
		
		// 상수(constant) - 불변의 값
		// 불변의 값을 저장하는 필드를 자바에서 상수라 부른다.
		// 상수의 개념을 듣게되면 final 키워드가 적용된 필드를 상수로 인식할수 있다.
		// 하지만 final 필드는 객체마다 저장이 된다는 점, 그리고 생성자의 
		// 파라미터를 통해서 다른 값을 가질수가 있음.
		
		// 불변의 값
		// 1. 객체(인스턴스)마다 다른값을 가지지 않아야한다.
		// 2. 공용성을 띠고 있어야한다.
		// 3. 여러가지 값으로 초기화될 필요가 없다.
		
		// 상수는 static + final 키워드를 모두 작성해야한다.
		// static final <---- 클래스에만 포함.
		// 코드의 가독성을 위해서 상수는 모두 대문자로 작성하는것이 개발자들끼리의 관례
		// 상수의 경우 _(스네이크 표기법을 이용해서 작성)

	}

}
