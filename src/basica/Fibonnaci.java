package basica;

public class Fibonnaci {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 number previous fibonnaci
		// numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		System.out.println(fib(5));

		// This for assigment - Fatorial - video 13. Assignment 1 Solution
		// 1! = 1 * 1
		// 2! = 2 * 1
		// 3! = 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1

	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return ((fib(n - 1)) + (fib(n - 2))); // Recursion in java and think as expression

	}

}
