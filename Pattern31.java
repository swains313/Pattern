package com.Raghu15august2022;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();

		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}int x=1;
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x=x*(i-j)/j;
				System.out.print("  ");
			}
			
			
			
			System.out.println();
		}

	}

}
