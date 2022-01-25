package classExam;

class Person{
	//final String nation = "대한민국";
	final String nation;
	static final String SSN = "";
	String name;
	
	public Person(String nation, String name) {
		this.nation = nation;
		this.name = name;
	}
	
	
}


public class finalExample {

	public static void main(String[] args) {
		Person p1 = new Person("이집트",  "김코딩");
		Person p2 = new Person("박코딩",  "수단");
		
		System.out.println(p2.nation);
		
		//상수는 클래스명.필드명 형식으로 호출
		System.out.println(Person.SSN);
		
		System.out.println(p1.name);
		//System.out.println(p1.ssn);
		System.out.println(p1.nation);

		System.out.println("=============절취선==================");
		
		p1.name = "박코딩";
		//p1.ssn = "122234-5678901";
		//p1.nation = "러시아";
		
		//System.out.println(p1.name);
		//System.out.println(p1.ssn);
		System.out.println(p1.nation);

		
	}

}
