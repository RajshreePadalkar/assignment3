package com.gurukul.day4.assignment3;

import java.util.Scanner;

public class assig3_question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int number=1;number<10000;number++)
		{
		int mod,count=0,n,m;
		double value=0;
		n=number;
		m=number;
		while(m!=0)
		{
			count++;
			m=m/10;
		}
		while(n!=0)
		{
			mod=n%10;
			value=value+(Math.pow(mod, count));
			n=n/10;
		}
		if(number==value)
			System.out.println("Number is Armstrong number"+number);
		
		
		}
	
	}

}
