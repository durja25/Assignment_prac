package JBK.assign2;

public class Math_ex {
	int x = 10, y = 20;
	float z;

	void add() {
		z = x + y;
		display(z);
	}

	void sub() {
		z = x - y;
		display(z);
	}

	void mul() {
		z = x * y;
		display(z);
	}

	void div() {
		z = x / y;
		display(z);
	}

	private void display(float ans) {
		System.out.println(ans);
	}
}
