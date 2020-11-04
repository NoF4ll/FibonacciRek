package fibonacciRek;

public class fibonacciMain {
	public static void main(String[] args) {
		System.out.println(rekFib(10));
		System.out.println(endFibonacci(10));

	}
	
	public static int rekFib(int n) {
		   if(n == 0) {
		     return 0;
		   } else if (n == 1) {
		     return 1;
		   } else {
		      return rekFib(n-1) + rekFib(n-2);
		   }
		}

	public static int g_fibonacci(int n, int fk1, int fk2) {
        if (n<=1) {
            return fk1+fk2;
        }else {
        return g_fibonacci(n-1, fk2+fk1, fk1);
        }
    }

    public static int endFibonacci(int n) {
        return g_fibonacci(n-1,1,0);
    }
}
