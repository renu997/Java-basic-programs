package basic_Programs;

import java.util.Scanner;

public class Positive_negative_no {

	//find give no.is +ve,-ve or zero
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();		
		
		// using ternary operator
		String Result = (num>0)? "Positive":(num<0)? "Negtaive" : "zero";
		System.out.println("Entered no.is "+ Result+": "+num);

		// using if,elseif
		if(num<0)
		{System.out.println("Negative");}
		else if(num>0)
		{System.out.println("Positive");}
		else
		{System.out.println("Zero");}
	}

}
