package lesson.day2;

public class Basic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 324178;
		// 위 금액을 5만 1만, 5천, 1천, 5백, 1백, 50, 10, 5, 1원 짜리 화폐로 계산
		
		int oman_m = amount / 50000;
		int change = amount % 50000;
		
		int iman_m = change / 10000;
		change = change % 10000;
		
		int ocheon_m = change / 5000;
		change = change % 5000;
		
		int icheon_m = change / 1000;
		change = change % 1000;  
		
		int oback_m = change / 500;
		change = change % 500;
		
		int iback_m = change / 100;
		change = change % 100;
		
		int oship_m = change / 50;
		change = change % 50;
		
		int iship_m = change / 10;
		change = change % 10;
		
		int owon_m = change / 5;
		change = change % 5;
		
		int iwon_m = change / 1;
		
		System.out.println("오만원권 : " + oman_m + "장");
		System.out.println("일만원권 : " + iman_m + "장");
		System.out.println("오천원권 : " + ocheon_m + "장");
		System.out.println("일천원권 : " + icheon_m + "장");
		System.out.println("오백원권 : " + oback_m + "장");
		System.out.println("일백원권 : " + iback_m + "장");
		System.out.println("오십원권 : " + oship_m + "장");
		System.out.println("일십원권 : " + iship_m + "장");
		System.out.println("오원권 : " + owon_m + "장");
		System.out.println("일원권 : " + iwon_m + "장");
		
	}

}
