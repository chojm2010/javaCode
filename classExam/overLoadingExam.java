package classExam;

class OverLoadingTest{
	
	int add(int a, int b) {
		return a + b;
	}
	long add(int a, long b) {
		System.out.println();
		return a + b;
	}
	// 2. 파라미터의 타입이 다른경우
	double add(double a, double b) {
		return a + b;
	}
	// 1. 파라미터의 개수가 다른경우
	int add(int a, int b, int c) {
		return a + b + c;
	}	
	int add(int[] a) {
		// 넘어온 모든수의 합
		int result = 0;
		for(int i=0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
	
	
}

public class overLoadingExam {

	public static void main(String[] args) {
		OverLoadingTest ov = new OverLoadingTest();
		
		System.out.println(ov.add(10, 20));
		System.out.println(ov.add(20, 40L));
		System.out.println(ov.add(1.5, 3.8));
		System.out.println(ov.add(10, 20, 30));
		
		int[] test = {300,350,400};
		System.out.println(ov.add(test));
		// TODO Auto-generated method stub
		// 메서드 오버로딩
		// 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도
		// 파라미터의 개수나 타입이 다르면, 같은 이름을 사용해서 메서드를 정의할수 있다.
		// 이것을 메서드 오버로딩이라고 한다.
		// 동명이인, 다른성격(요약해서)
		
		// 오버로딩은 왜 필요한걸까? 
		// 파라미터 값을 다양하게 받아서 처리하기 위해서.
		
		// 오버로딩의 조건
		// 1. 메서드명이 같아야한다.
		// 2. 파라미터의 개수, 타입이 달라야한다.
		// 3. 파라미터는 같지만 리턴타입이 다른 경우는 오버로딩이 아니다.
		// 4. 오버로딩된 메서드들은 파라미터로만 구별될수 있다.
	}

}
