package lesson.day2;

public class Basic09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for (int i=0; i<100; i++) {
			if (i%3==0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
