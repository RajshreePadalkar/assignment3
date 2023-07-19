package com.gurukul.day4.assignment3;

import java.util.Scanner;

public class assig3_Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		System.out.println("Enter the starting ");
		
		int s=sc.nextInt();
		int zero=0;
		int f=1;
		
		int fibo=0;
		int c=0;
		for(int i=1;;i++)
		{	fibo=zero+f;
		if(fibo>=s) 
		{
			System.out.println(fibo);
			c++;
		}
		if(c==number)
		{
			break;
		}
		zero=f;
		f=fibo;
		}
	}

}
