package com.PatternAssignment11aug;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			
			
			
			System.out.println();
		}
		

	}

}
