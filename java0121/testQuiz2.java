package java0121;

import java.util.Scanner;


public class testQuiz2 {
	static Scanner sc = new Scanner(System.in);
	private double area;
	final double PI = 3.141592;

	public testQuiz2() {
		this.area = 0;
	}

	public void circle() {
		int r;

		System.out.println("\n**** ���� ���� ****");
		System.out.print("������ : ");	r = sc.nextInt();

		area = r * r * PI;
		output();
	}

	public void triangle() {
		int b, h;

		System.out.println("\n**** �ﰢ���� ���� ****");
		System.out.print("��  �� : ");	b = sc.nextInt();
		System.out.print("��  �� : ");	h = sc.nextInt();

		area = (double)b * h / 2;
		output();
	}

	public void trapezoid() {
		int a, b, h;

		System.out.println("\n**** ��ٸ����� ���� ****");
		System.out.print("�Ʒ��� : ");	a = sc.nextInt();
		System.out.print("��  �� : ");	b = sc.nextInt();
		System.out.print("��  �� : ");	h = sc.nextInt();

		area = (double)(a + b) * h / 2;
		output();
	}

	public void output() {
		System.out.printf("���� : %.2f\n\n", area);
	}

	public int menu() {
		int n;

		System.out.println("**** �������� ****");
		System.out.println("1. �ﰢ��");
		System.out.println("2. ��");
		System.out.println("3. ��ٸ���");
		System.out.println("4. ����");
		System.out.print("���� : ");
		n = sc.nextInt();

		switch (n) {
			case 1 :	triangle();		break;
			case 2 :	circle();		break;
			case 3 :	trapezoid();	break;
			case 4 :	System.out.println("\n�����մϴ�^.^");
		}
		
		return n;
	}

	public static void main(String[] args) {
		testQuiz2 ob = new testQuiz2();
		
		while(true){
			if(ob.menu() == 4) break;;
		}
		sc.close();
	}
}