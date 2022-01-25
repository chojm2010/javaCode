package classExam;
//사람이 테이블에 앉아 밥을먹는것을 코드로 
//public class People{
//	
//	private final Table table;
//	private final Spoon spoon;
//	private final Rice rice;
//	
//	public People(Table table, Spoon spoon, Rice rice) {
//		this.table = table;
//		this.spoon = spoon;
//		this.rice = rice;
//	}
//	
//	public void eat() {
//		table.seat();
//		spoon.taken();
//		spoon.scoop(rice);
//		rice.eaten();
//	}
//	
//}

//abstract 클래스 : 추상클래스
// 추상화를 좀더 구체적으로 도와주는 키워드
abstract class Dog2{
	// 필드 : 색깔
	public String color;
	
	public Dog2(String color) {
		this.color = color;
	}
	
	// 추상메서드
	// 추상메서드는 메서드 명, 리턴타입, 파라미터만 선언하고 내용은 정의하지 않음.
	// 내용정의는 하위 클래스에서 재정의하여 사용.
	public abstract void bite(); 
	public abstract void eat();
	
	public void bowwow(){
		System.out.println("왈왈");
	}
	
}

// 추상클래스를 상속받는다면
// 추상클래스의 추상메서드를 반드시 오버라이딩 해야한다
class Huskey extends Dog2{

	public Huskey(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bite() {
		// TODO Auto-generated method stub
		System.out.println("쾈");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}




	
}
class Sibadog extends Dog2{
	public Sibadog(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("헤엄치기!");
	}

	@Override
	public void bite() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}



public class Abstration {
	
	

	public static void main(String[] args) {
		//추상화 : 내용보다 핵심적인 개념을 추려내는 것	
		// 1. 핵심적인것을 추려낸다
		// 2. 추려낸것들을 노출시킨다.
		// 3. How보다 what에 포커스를 둔다.
		
		// ex)밥을 먹는다.
		// 밥을 먹는다 라는 행동에 숨겨진 행동들
		//  - 식탁에 앉기(무슨식탁이지?)
		//    플라스틱 식탁? , 철식탁?, 나무식탁?
		//  - 숟가락 들기(무슨 숫가락이지?)
		//     금수저? 은수저? 플라스틱?
		//  - 밥푸기(무슨밥이지?)
		//     쌀밥? 흑미밥?
		//  - 밥을 입으로 가져가기

	Huskey dog1 = new Huskey("검정");
	dog1.bite();
	
	Sibadog dog2 = new Sibadog("갈색");
	dog2.eat();
	
	Dog2 dog3 = new Huskey("흰색");
	dog3.bite();
	
	
	}

}
