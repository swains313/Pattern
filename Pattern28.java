package com.Raghu15august2022;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number n");
		int n=sc.nextInt();
		
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}int x=1;			
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print((char)(x+64)+" ");
				if(j<i)
					x++;
				else 
					x--;
			}
			
			System.out.println();
		}

	}

}
