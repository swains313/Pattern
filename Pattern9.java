package com.PatternAssignment11aug;

OUTPUT 
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Eneter the number  n: ");
		int n=sc.nextInt();
		
		int k=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			
			
			System.out.println();
		}
		

	}

}
