import java.util.Scanner;

public class FibonacciNumber {

	static int fib(int n) {

		if (n <= 1)
			return n;

		return fib(n - 1)
				+ fib(n - 2);
	}

	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter an integer to print fibonacci series(>1):");
		int N = scnr.nextInt();
        
		System.out.println("The Fibonacci series till " + N + "th number of the series:");

		for (int i = 0; i < N; i++) {

			System.out.print(fib(i) + " ");
		}

		scnr.close();
	}
}
