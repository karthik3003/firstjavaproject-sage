package practice;

public class Prac {
	
	public static void main(String[] args) {
		
		fibonacci(100);
		primenumbers(100);
		
	}
	public static void fibonacci(int n)  {
	
	    if(n == 0) {
	      System.out.println("Enter a higher number for us to print the series");
	    }
	    if(n == 1) {
	    	System.out.println("fibonacci series" + 1);
	    }
	    if(n > 1) {
	    	long a=1, b=1, c=1;
	    	System.out.print("fibonacci series: " + a +" "+ b);
	    	for(int i=2; i<n; i++) {
	    		c = a+b;
	    		System.out.print(" "+ c);
	    		a=b;
	    		b=c;
	    	}
	    }

	}
	public static void primenumbers(int n) {
		int num = 0;
		for(int i=1; i<=n; i++) {
			int count = 0;
			for(num = i; num>=1; num--) {
				if(i%num == 0) {
					count++;
				}
				
			}
			if(count == 2) {
				System.out.println("\n" + i + " - "+ "It is a prime number");
			}
			else {
				System.out.println("\n" + i + " - "+ "It is not a prime number");
			}
		}
	}
}
