package Numeric;

import java.util.Scanner;

public class Temp {
	public static void main(String args[]){
		int c;
		int f;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Temperature in celcius: ");
		c=s.nextInt();
		f=c*(9/5)+32;
		System.out.println("Temperature in fahrenheit: "+f);
	}

}
