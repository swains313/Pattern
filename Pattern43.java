package com.Raghu16august2022;

import java.util.Scanner;

public class Pattern43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		int space =0,num=n;
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			int x=1;
			
			for(int j=1;j<=num;j++)
			{
				System.out.print(x+" ");
				if(j<=num/2)
					x++;
				else
					x--;
			}
			
			if(i<=n/2)
			{
				space++;
				num=num-2;
			}
			else
			{
				space--;
				num=num+2;
				
			}
			System.out.println();
		}

	}

}
