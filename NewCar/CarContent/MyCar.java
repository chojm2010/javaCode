package NewCar.CarContent;

public class MyCar {

	// 필드
	// 차 이름
	String name;
	Accel accel;
	Engine engine;
	Handle handle;
	Wheel wheel;
	 
	public MyCar(String name) {
		this.name = name;
		this.accel = new Accel(name);
		this.engine = new Engine(name);
		this.handle = new Handle();
		this.wheel = new Wheel("매우 좋은 바퀴");
	}
	
	// 메서드
	// 차 달리기, 
	public void letsGo() {
		// accel 클래스에서 엑셀 밣기 클래스와
		accel.push();
		// wheel 클래스에서 바퀴 움직이기 클래스 호출
		wheel.go();
	}
	//시동걸기, 
	public void ready() {
	// engine 클래스에서 만들 시동걸기 메서드 호출
		engine.start();
	} 
	//멈추기, 
	public void stop() {
	//engine 클래스에서 멈추기 메서드 호출
		engine.off();
	}
	//왼쪽으로 꺾기, 
	public void turnLeft() {
	// handle 클래스에서 왼쪽으로 꺾기 메서드 호출
		handle.left();
	}
	//오른쪽으로 꺾기
	public void turnRight() {
		//handle클래스에서 오른쪽으로 꺾기 메서드 호출
		handle.right();
	}
	
	
}
