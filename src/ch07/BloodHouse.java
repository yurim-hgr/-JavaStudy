package ch07;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; // �������� ���̸� Ȯ���Ͽ� ����
		boolean isPossible = false; // ���� ���� ����
		/* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		age = human.getAge(); 
		
		/* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		if(age >= 16 && age <= 69) {
			isPossible = true;
			
		}
		
		return isPossible;
	}

	public String action(Human human) {//�׼ǿ��ٰ� �۾��� ��Ŵ
		String result = ""; // ���� ��� ����
		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
		boolean isPossible = isPossible(human);
		
		/* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		/* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		if(isPossible) {
			result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�.";
		}else { 
			result = "";
		}
		return result;
	}
}