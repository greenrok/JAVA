package lesson.day5;

import java.util.Random;

public class PracticeCode_day5 {
	
	public void checkSameNumber() {
		// 6개의 임의의 수를 출력할 때 중복이 생성되지 않도록 한다.
		// Random 클래스를 이용하여 6개의 숫자(1~45)를 중복 허용하여 출력하는 코드 작성
		Random rd = new Random();
		int arr[] = new int[6];
		
		for (int i=0; i<6; i++) {
			int num = rd.nextInt(45)+1;
			boolean flag = false; 
			
			for (int j=0; j<=i; j++) {
				if (arr[j] == num) {
					flag = true;
					break;
				}
			}
			
			if (!flag) {
				arr[i] = num;
				System.out.println(arr[i]);
			} else {
				i--;
			}
			
		}
		// 중복을 허용하지 않고 6개의 숫자를 추출하는 코드를 작성
	}
}
