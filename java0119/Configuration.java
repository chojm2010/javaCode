package java0119;

public class Configuration {
	// 싱글톤 패턴 적용 클래스
	// 정적변수에 저장하여 인스턴스에 접근할수 있도록한다.
	private static Configuration config;
	
	private String test1 = "테스트1";
	private String test2 = "테스트2";
	
	// 그와 동시에 인스턴스를 생성할수 있는 특정한 정적 메서드를 통해서만
	// 인스턴스를 생성하도록 처리하고 인스턴스는
	public static Configuration getInstance() {
		if (config == null) {
			config = new Configuration();
		}
		return config;
	}
	
	public String getTest1Name() {
		return test1;
	}
	public String getTest2Name() {
		return test2;
	}
}
