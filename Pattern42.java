package com.Raghu16august2022;

import java.util.Scanner;

public class Pattern42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number  n ");
		int n=sc.nextInt();
		
		int star=n,space=0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");	
			}
		
			
			if(i<=n/2)
			{
				space++;
				star=star-2;	
			}
			else
			{
				space--;
				star=star+2;
		
			
			}
			
			
			
			System.out.println();
		}

	}

}
