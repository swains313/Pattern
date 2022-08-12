package com.PatternAssignment11aug;

OUTPUT
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1

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
