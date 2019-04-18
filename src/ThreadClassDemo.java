class Worker extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}

}

public class ThreadClassDemo {
	public static void main(String[] args) {
		Thread t1 = new Worker();
		Thread t2 = new Worker();
		Thread t3 = new Worker();
		t1.start();
		t2.start();
		t3.start();

	}
}
