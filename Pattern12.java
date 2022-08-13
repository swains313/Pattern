package com.PatternAssignment11aug;

OUTPUT
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		int x=1;
		
		
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(x%2+"  ");
				x++;
			}
			System.out.println();
		}

	}

}
