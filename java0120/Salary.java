package java0120;

public class Salary {
	String name;
	int salary;
	
	Salary(String n, int s){
		this.name =n; 
		this.salary =s;
	}
	void getInfomation1() {
		System.out.println("ÀÌ¸§ : " + name);
		System.out.println("¿¬ºÀ : " + salary + "¿ø");
	}
}
