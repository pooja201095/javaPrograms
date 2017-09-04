package Numeric;

import java.util.Scanner;

public class Distance {
	public static void main(String args[]){
	Scanner s= new Scanner(System.in);
	int u,t,a;
	float d;
	System.out.println("Enter the initial velocity in meter per second: ");
	u=s.nextInt();
	System.out.println("Enter the time in seconds: ");
	t=s.nextInt();
	System.out.println("Enter the acceleration in meter per second: ");
	a=s.nextInt();
	d=(u*t)+((a*t*t))/2;
	System.out.println("Distance is "+d+" meter per second Square.");
	}
}
