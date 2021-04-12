package lgs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();

		MyThread a = new MyThread(num);
		System.out.print("���� Thread  : ");
		a.start();
		a.join();
		System.out.print("���� Runnable: ");
		RunnableThread b = new RunnableThread(num);
		new Thread(b).start();

	}
}
