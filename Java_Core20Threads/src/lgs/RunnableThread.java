package lgs;

public class RunnableThread implements Runnable {
	private Fibonacci f;
	private int num;

	public RunnableThread(int num) {
		this.num = num;
		f = new Fibonacci(num);
	}

	@Override
	public void run() {
		try {
			for (int i = num - 1; i >= 0; i--) {
				System.out.print(f.get(i) + " ");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("End Runnable_Thread");
		}

	}

}