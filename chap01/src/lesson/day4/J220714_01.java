package lesson.day4;

public class J220714_01 {
	public void testWhile() {
		// 반복문 중에 while
		int number = 2394528;
		int total = 0;
		boolean flag = false;
		while (!flag) {
			int splitNumber = number % 10;
			System.out.println(splitNumber);
			total += splitNumber;
			number /= 10;
			if (number <= 0) flag = true;
		}
		System.out.println(total);
	}
	
	boolean testWhile2(int number) {
		int count = 0;
		int i = number;
		boolean result = false;
		while (true) {
			if (number % i == 0) {
				count++;
			}
			i--;
			if (i == 0) break;
		}
		if (count == 2) {
			result = true;
		}
		
		return result;
	}
	
	public void testWhile03() {
		// 소수 판별 
		int number = 10;
		boolean a = (number % 2) > 0;
		boolean b = (number % 3) > 0;
		if (a==true || b==true) {
			System.out.println("소수입니다");
		} else {
			System.out.println("소수가 아닙니다");
		}
	}
}
