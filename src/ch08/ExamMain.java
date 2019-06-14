package ch08;

//생성자의 활용 방법, 어떤 경우에 생성자가 유용하게 쓰이는가
public class ExamMain {// 수학과 영어의 평균을 구하자

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

//      생성자를 쓰는이유 편할려고 (코드가 줄어듬)
//      생성자를 안만들면 컴파일러가 만들어줌
//      생성자를 하나라도 만들면 컴파일러가 관여안함