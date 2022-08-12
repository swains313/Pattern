package com.PatternAssignment11aug;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+96)+" ");
			}
			System.out.println();
		}
		

	}

}
