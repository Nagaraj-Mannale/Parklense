package programming;

public class IsPrimeNotFibonaccy {
	public static boolean isPrime(int num) 
	{
		
			for (int i = 2; i * i <= num; i++) 
			{
				if (num % i == 0) 
				{
					return false;
				}
			}
		return true;
	}

	public static boolean perfectSquare(int x) {
		int a = (int) Math.sqrt(x);
		return a * a == x;
	}

	public static boolean isfibonaccy(int num) {
		if (perfectSquare(5 * num * num + 4) || perfectSquare(5 * num * num - 4)) {
			return true;
		} else {
			return false;
		}
	}

	public static int isPrimeNotFib(int num) {
		if (isPrime(num) && !isfibonaccy(num)) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int num = 7;
		int result = isPrimeNotFib(num);
		System.out.println(result);
	}
}
