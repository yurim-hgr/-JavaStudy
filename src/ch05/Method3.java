package ch05;

public class Method3 {

	static void third() {
		System.out.println("third ȣ��");
		System.out.println(4 / 0);

	}

	static void second() {
		third();

	}

	static void first() {
		second();
	}

	public static void main(String[] args) {
		first();
		// Stack(LIFO, FILO), Queue(FIFO)
		// �߻�ȭ �������κκ��� ������°� ex) ����� ����Ư¡�� ��������, �ȴٸ��� �ִ� ��

	}
}
