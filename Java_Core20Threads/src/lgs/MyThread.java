package lgs;

public class MyThread extends Thread {
	private Fibonacci f;
	private int num;

	public MyThread(int num) {
		this.num = num;
		f = new Fibonacci(num);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < num; i++) {
				System.out.print(f.get(i) + " ");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("End My_Thread");
		}
	}
}