package com.PatternAssignment11aug;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number   : ");
		int n=sc.nextInt();
		int x=0; //x=1;
		
		for(int i=1;i<=n;i++)
		{
			
			
//				for(int j=1;j<=n;j++) //here x=1
//				{
//					System.out.print(x+" "); // s.o.p(x%9+1 +" ");
//					x++;                    //x++
//					if(x==10)
//						x=1;
//					
//				}
				
						for(int j=1;j<=n;j++)
						{
							System.out.print(x%9+1 +" "); 
							x++;                    
														
						}
					
			
			System.out.println();
		}
		

	}

}
