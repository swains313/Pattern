package com.PatternAssignment11aug;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number  n");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(j+"  ");
			}
				System.out.println();
		}
		
	}

}
