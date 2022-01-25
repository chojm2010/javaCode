package classExam;

//1. Phone 클래스를 상속받는 SmartPhone 클래스 생성
class Phone{
	//2. Phone 클래스의 기본 필드는 모델명과 색상
	String model;
	String color;
	
	
	Phone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
//  - 기능은 전원 키기, 끄기
	void switchOn() {
		System.out.println("전원ON 하이 빅스비");
	}
	void switchOff() {
		System.out.println("전원 OFF ㅂㅂ");
	}
//  - 벨울리기
	void ringdingdong() {
		System.out.println("띠리리리리리리리리리");
	}
//  - 전화하기
	void call() {
		System.out.println("여보세요 중국집이죠?");
	}
//  - 전화종료하기
	void calloff() {
		System.out.println("아 아니네요 ㅈㅅ");
	}
	
}
class SmartPhone extends Phone{
	//3. SmartPhone 클래스(phone 클래스의 필드를 사용해야함)
	//  -  브라우저 실행(필드)
	String browser;
	SmartPhone(String model, String color, String browser){
		super(model, color);
		this.browser = browser;
	}
	//  - 기능은 인터넷 실행하기
	//  - 카카오톡 실행하기
}

public class lunchquiz0118Ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
