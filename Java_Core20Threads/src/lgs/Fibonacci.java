package lgs;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	private List<Integer> fib = new ArrayList<Integer>();

	Fibonacci(int num) {
		fib.add(0);
		fib.add(1);
		if (num > 2) {
			for (int i = 2; i < num; i++) {
				fib.add((fib.get(i - 2) + fib.get(i - 1)));
			}
		}
	}

	public int get(int index) {
		return fib.get(index);
	}

	@Override
	public String toString() {
		return "Fib [fib=" + fib + "]";
	}

}