package ch07;

public class Main {
	public static void main(String[] args) {
		/* ������ ���� */
		Human human = new Human();
		human.setName("��");
		human.setType('O');
		human.setAge(20);

		/* BloodHouse ��ü ���� */
		String result = ""; // action() �޼ҵ� ȣ�� ��� ����
		/* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		BloodHouse bh = new BloodHouse();//�� ���� ������ �׼��� �޾Ƽ� �ϴ��� �˾ƾ߉�
		result = bh.action(human);//�� ���� ������? ȿ������ ���ؼ�
		
		/* action() �޼ҵ� ȣ�� ��� ��� */
		System.out.println(result);
	}
}
