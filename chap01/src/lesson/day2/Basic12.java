package lesson.day2;

public class Basic12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		
		while (i<=100) {
			sum += i;
			i++;
			if (sum > 3000) break;
		}
		System.out.println(sum);
	}
}
