package makeUpClass;

class Salary{
	String name;
	int salary;
	
	Salary(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void getInfomation1() {
		System.out.printf("¿Ã∏ß : %s\n", name);
		System.out.printf("ø¨∫¿ : %s\n", salary);
	}
}

class Test34 extends Salary{
	String department;
	
	public Test34(String name, int salary, String department){
		super(name, salary);
		this.department = department;
	}
	
	void getInfomation2() {
		System.out.printf("∫Œº≠ : %s\n", department);
	}
}

public class Homework_0118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test34 ob = new Test34("æﬂ√∂¥Î¿Â", 85000000, "√∂±‚πÊ");
		ob.getInfomation1();
		ob.getInfomation2();

	}

}
