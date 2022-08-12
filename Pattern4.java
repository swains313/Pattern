package com.PatternAssignment11aug;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number  n ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=i;j<=n;j++)
			{
				
				System.out.print(j+" ");		
			}
			
			System.out.println();
		}
	}

}
