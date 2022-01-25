package classExam;

class FishBreadUp{
	
	static String bread = "일반 밀가루";
	String cream;
	
	FishBreadUp(String cream){
		this.cream = cream;
	}
	
	// FishBreadUp 클래스를 통해 인스턴스를 마음껏 생성해보세요.
	// 생성한 인스턴스를 통해 cream 필드를 채워 넣으시고
	// 만들고싶은 붕어빵들을 완성해주세요!
}

public class FishMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제
		// 붕어빵을만드는 FishBreadUp이라는 클래스를 생성해주세요.
		// 메인 클래스 이름은(main 메서드가 들어올 함수) FishMain으로 생성해주세요.
		
		// FishBreadUp 클래스에서 클래스변수 문자형변수 cream을 선언해주세요
		
		// FishBreadUp 클래스를 통해 인스턴스를 마음껏 생성해보세요.
		// 생성한 인스턴스를 통해 cream 필드를 채워 넣으시고
		// 만들고싶은 붕어빵들을 완성해주세요!
		FishBreadUp fish1 = new FishBreadUp("슈크림");
		FishBreadUp fish2 = new FishBreadUp("민초");
		FishBreadUp fish3 = new FishBreadUp("연어");
		
		System.out.println(fish1.cream+"붕어빵 제작 완료");
		System.out.println(fish2.cream+"붕어빵 제작 완료");
		System.out.println(fish3.cream+"붕어빵 제작 완료");

	}

}
