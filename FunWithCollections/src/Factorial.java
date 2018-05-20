import java.util.Stack;

public class Factorial {
	public static long factorial(int n) {
		long result;
		if (n <= 1) {
			return 1;
		}
		else {
			long temp = factorial(n-1);
			result = n * temp;
		}
		return result;
	}

	private static class FactFrame {
		public int n;
		public long res;
		public int loc;
		public FactFrame(int n, long r, int l) {
			this.n=n;
			this.res=r;
			this.loc=l;
		}
	}

	public static long factorialWithStack (int n) {
		Stack<FactFrame> stack = new Stack<FactFrame>();
		stack.push(new FactFrame(n, 0, 1));
		long localRes = 0;
		while (!stack.empty()) {
			FactFrame next = stack.pop();
			int localN = next.n;
			localRes = next.res;
			switch (next.loc) {
			case 1:
				if (localN <= 1) {
					localRes = 1;
					if (!stack.empty()) {
						stack.peek().res = localRes;
					}
				}
				else {
					stack.push(new FactFrame(localN, 0, 2));
					stack.push(new FactFrame(localN-1, 0, 1));
				}
				break;
			case 2:
				localRes = localRes * localN;
				if (!stack.empty()) {
					stack.peek().res = localRes;
				}
			}
		}
		return localRes;
	}

	public static long factorialTailRecursive(int n) {
		return factorialTailRecursive(n,1);
	}

	private static long factorialTailRecursive(int n, long r) {

		return r;
	}

	public static long factorialIterative(int n) {
		return factorialIterative(n,1);
	}

	private static long factorialIterative(int n, long r) {
		return 0;
	}
}
