package ch08;

//�������� Ȱ�� ���, � ��쿡 �����ڰ� �����ϰ� ���̴°�
public class ExamMain {// ���а� ������ ����� ������

			public static void main(String[] args) {
			Exam e1 = new Exam(90, 70);
//			e1.engScore = 90;
//			e1.mathScore = 70;
			
			Exam e2 = new Exam(70, 100);
//			e2.engScore = 70;
//			e2.mathScore = 100;
			
//			Exam[] ex = {e1, e2};
			Exam[] ex = {new Exam(90, 70), new Exam(70, 100)};
		}
	}

//      �����ڸ� �������� ���ҷ��� (�ڵ尡 �پ��)
//      �����ڸ� �ȸ���� �����Ϸ��� �������
//      �����ڸ� �ϳ��� ����� �����Ϸ��� ��������