package com.PatternAssignment11aug;

OUTPUT
1 0 1 0 1
0 1 0 1 1
1 0 1 0 1
0 1 0 1 0
1 0 1 0 1
import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number n :");
		int n=sc.nextInt();
		
		int x=1;
		
		
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				System.out.print(x%2 +" ");
				x++;
				
			}
			
			
			System.out.println();
		}
		

	}

}
