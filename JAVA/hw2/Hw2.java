package hw1;

import java.util.Scanner;

public class Hw2 {
	
	public static void main (String[] args)
	{
	int i;
	
	System.out.println("enter a number in 0 to 10");
	Scanner keyboard = new Scanner(System.in);
	int j = keyboard.nextInt();
	
	System.out.println("the number you entered is :" +j);
	System.out.println("extracted numbers before " +j +" are");
	
	for(i=0; i<=10; i++)
	{
		if(i==j)
		{
			break;
		}
		System.out.println(i);
	}
	System.out.println("enter a number to find odd numbers below that");
	Scanner scan = new Scanner(System.in);
	int k = scan.nextInt();
	
	System.out.println("the odd numbers between 0 and" +k +" are");
	
	for(i=0; i<k; i++)
	{
		if(i%2==0)
		{
		continue;	
		}
		System.out.println(i);
	}
	
	switch (20)
	{
		case  18:
		System.out.println("age is 18, you are not married");
		break;
		case 20:
		System.out.println("age is 20, you are married");
		break;
		case 21:
		System.out.println("age is 21, you r divorced");
		break;
		default:
		System.out.println("you dont need to marry");
		break;
	}
	
	
	
	
	}

}
