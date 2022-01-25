package java0121;

import exam.Calculator;

public class Cal {
	int a;
	int b;
	
	public Cal(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int result(Operate operate) {
		return operate.operate(a, b);
	}
}
