package java0120;

public class Test34 extends Salary{

	String department;
	
//			  ②생성자 : name, salary,department를 넘겨받아 각각 필드에 대입
//			             필요하면 부모 생성자 호출할수도 있다
	public Test34(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
//			  ③메서드 : getInfomation2()메서드에서 부서출력
	public void getInfomation2() {
		System.out.println("부서 : " + department);
	}
}
