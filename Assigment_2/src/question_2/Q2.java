package question_2;

import java.util.Scanner;

public class Q2 {
	
	public static int findGCD(int a, int b) {
		if(b == 0) return Math.abs(a);
		return findGCD(b, a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();
		System.out.println("GCD " + findGCD(n1, n2));
		
		

	}

}
