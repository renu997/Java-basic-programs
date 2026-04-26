package basic_Programs;

import java.util.Scanner;

public class Even_odd_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num%2==0)
		{	System.out.println("Entered number is even no. : "+num);}
		else
		{	System.out.println("Entered number is odd no. : "+num); }
		
		//////// OR output in true/false
		System.out.println("Is entered no even : " + (num%2==0));
		System.out.println("Is entered no odd : " + (num%2!=0));
		
	}
	}


