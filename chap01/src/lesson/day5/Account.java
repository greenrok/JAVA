package lesson.day5;

public class Account {

	private int balance;
	
	// getter
	public int getBalance() {
		return this.balance;
	}
	
	// setter
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금
	public void deposit(int amount) {
		this.balance = this.balance + amount;
	}
	
	// 출금
	public void withdraw(int amount) {
		this.balance = this.balance - amount;
	}
	
	
}
