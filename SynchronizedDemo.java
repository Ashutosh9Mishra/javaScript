
class Account{
	String name;
	String accountType;
	int balance;
	public Account(String name, String accountType, int balance) {
		this.name = name;
		this.accountType = accountType;
		this.balance = balance;
	}
	public void deposit(int amount){
		balance = amount+balance;
		System.out.println("Total amount is : "+balance);
		
	}
	public void widthraw(int amount){
		balance = balance-amount;
		System.out.println("Total Amount is : "+balance);
	}
	public void balanceenquery(){
		System.out.println("My balance is : "+balance);
	}
}


class Job1 implements Runnable{
   Job1(){
	   synchronized (this) {
	}
   }
	@Override
	public void run() {
		
		for(int i=0;i<6;i++){
			System.out.println("I am Thread : "+Thread.currentThread().getName());
		}
	}
}
public class SynchronizedDemo {

	public static void main(String[] args) {
   /*   Job1 job = new Job1();
      Thread thread = new Thread(job,"Aazam");
      thread.run();
      Thread thread2 = new Thread(job,"Anurudh");
      thread2.start();
     */
		
	}
   
}
