package ch05;

public class Method3 {

	static void third() {
		System.out.println("third 호출");
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
		// 추상화 공통적인부분을 끄집어내는것 ex) 사람의 공통특징은 숨을쉰다, 팔다리가 있다 등

	}
}
