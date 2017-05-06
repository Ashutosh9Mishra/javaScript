

class Job implements Runnable{
public void run(){ 
	for(int i=1;i<=5;i++){
		System.out.println("I is"+ i +"Thread" + Thread.currentThread().getName());
		}
	}}

public class ThreadExample {

	public static void main(String[] args) {
		Job job=new Job();
		Thread worker=new Thread(job,"ram");
		Job job2=new Job();
		worker.setDaemon(true);
		Thread worker2=new Thread(job2,"sita");
		worker.start();
		worker2.start();
		//System.out.println("worker" +worker.isDaemon());
	//System.out.println(""Main"+ Thread.currentThread().isDaemon());
	}

}
