package object;

import java.util.Scanner;

//import java.sql.Date;

public class hw3 {


public static void main(String[] args)
{
	
	System.out.println("enter birth date");
	Scanner keyboard = new Scanner(System.in);
	int i = keyboard.nextInt();
	
	System.out.println("enter birth month");
	Scanner scan = new Scanner(System.in);
	int j = scan.nextInt();
	
	System.out.println("enter birth year");
	Scanner key = new Scanner(System.in);
	int k = key.nextInt();
	
	System.out.println("you have given");
	
     Date birthday = new Date(0, 00, 0000);
     birthday.setMonth(j);
     birthday.setday(i);
     birthday.setyear(k);
     
     System.out.println("mm = " + birthday.getMonth());
     System.out.println("dd = " + birthday.getday());
     System.out.println("yyyy = " + birthday.getyear());
     
     System.out.println("your date of birth in format mm/dd/yyyy " + birthday);
	}

}