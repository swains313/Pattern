package com.PatternAssignment11aug;

OUTPUT
1 1 1 1 1
0 0 0 0
1 1 1
0 0
1

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("Enter the number : n");
	int n=sc.nextInt();
	
	
	for(int i=n;i>=1;i--)
	{
		
		for(int j=1;j<=i;j++)
		{
			System.out.print(i%2 +" ");
		}
		
		
		System.out.println();
	}
	}

}
