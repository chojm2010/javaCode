package classExam;

import interFaceExam.Doggy2;
import interFaceExam.Samoade;

//인터페이스를 사용
// 접근지정자 interface 클래스명(인터페이스명)



public class InterFaceExam {

	public static void main(String[] args) {
		// interface : 추상화를 좀더 구체적으로 도움을 주는 도구
		//             실무에서 굉장히 많이 사용하는 방식.
		Samoade dog4 = new Samoade("왈왈이");
		dog4.eat();
		
		System.out.println(dog4.getName());
	}

}
