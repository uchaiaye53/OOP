package fibonacci;

import java.util.Scanner;

public class fibonacci_recursion {
	
	static int first=0,second =1,fibo;
	
    static void printfibo(int i) {
		
		if(i>=1) {
			fibo=first+second;
			System.out.print(" "+fibo);
			first=second;
			second=fibo;
			printfibo(i-1);
		}
		
    }

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Give a number: ");
		int n = input.nextInt();
		n=n-2;
		System.out.print(+first+" "+second);
		
		fibonacci_recursion obj=new fibonacci_recursion();
		printfibo(n);
		

	}
	

}
