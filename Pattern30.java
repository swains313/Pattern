package com.Raghu15august2022;

import java.util.Scanner;

public class Pattern30 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			int x=1;
			
			for(int j=1;j<=2*i+1;j++)
			{
				System.out.print(x+" ");
				
			
				System.out.print("* ");
				
			}
			
			
			
			
			
			System.out.println();
		}
	}

}
