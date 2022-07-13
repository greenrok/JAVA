package lesson.day3;

public class MyCalendar {
	// data, process 정보 2개가 들어간다
	// data 변수로 표현(필드, 속성)
	// process 메소드로 표현
	public void viewMonth() {
		int startDay = 1;
		int lastDay = 31;
		System.out.println("2022년 5월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0; i<startDay; i++) {
			System.out.print("\t");
		}
		int day = 1;
		for (int i=0; i<lastDay; i++) {
			day = i+1;
			System.out.print(day+"\t");
			if ((day+startDay)%7==0) {
				System.out.println();
			}
		}
	}
}
