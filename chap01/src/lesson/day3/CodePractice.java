package lesson.day3;

public class CodePractice {
	// 누구나 사용할 수 있는 메소드이며, 1~10까지 합계를 구하는 코드를 가지고 있다.
	public void calcuSum() {
		// 구현부분
		int sum = 0;
		int number = 1;
		for (int i=1; i<11; i++) {
			sum += number;
			number++;
		}
		System.out.println(sum);
	}
	
	// 마지막 값을 외부로부터 입력 받아 외부로 계산 값 전달
	public int calcuSum(int endnum) {
		int result = 0;
		int sum = 0;
		int number = 1;
		for (int i=1; i<=endnum; i++) {
			sum += number;
			number++;
		}
		result = sum;
		
		return result; // 외부로 전달하기 위해서는 필수로 체크 // 없으면 에러
	}
}

// 위 코드는 실행이 안된다
// main 메서드가 없기 떄문에

