package com.Raghu15august2022;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number  ");
		int n=sc.nextInt();
		
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(x+" ");
				
				x++;
				if(x==10)
					x=1;
			}
			
			
			System.out.println();
		}

	}

}
