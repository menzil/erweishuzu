package test1;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		int a=0;
		System.out.println("请输入一个正整数：");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		System.out.println(func(a));
		

	}
	static int factorial(int n) { 
		if (0 == n || 1 == n) 
		return 1; 
		else 
		return n * factorial(n - 1); 
	} 

	static int func(int n) { 
		if (n < 10){ 
			return factorial(n); 
		}else{ 
			return factorial(n % 10) + func(n / 10);
		}
	} 

}
