package NewCar.CarContent;

public class Handle {

	// ��ȸ��
	void left() {
		//��ȸ���� �Ҷ� �����̸� Ű�� ������.
		//�ܼ��� �޼���ó���� �ƴ�
		//�޼��� ȣ���� ���� ó��
		leftLight();
		System.out.println("��ȸ�� �ؿ�!");
		leftLightOff();
	}
	void leftLight() {
		System.out.println("���� ������ on");
	}
	void leftLightOff() {
		System.out.println("���� ������ off");
	}
	
	
	// ��ȸ��
	void right() {
		rightLight();
		System.out.println("��ȸ�� �ؿ�!");
		rightLightOff();
	}
	void rightLight() {
		System.out.println("���� ������ on");
	}
	void rightLightOff() {
		System.out.println("���� ������ off");
	}
}
