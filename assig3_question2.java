package com.gurukul.day4.assignment3;

public class assig3_question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6-i;j++)
			
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{	
				System.out.print(v);
				v++;
				if(v==10)
					v=0;	
			}
			System.out.println();
		}
	}

}
