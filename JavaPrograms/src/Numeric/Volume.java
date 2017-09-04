package Numeric;

import java.util.Scanner;

public class Volume {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		
		int r,h;
		final float p=3.14f;
		float v;
		System.out.println("Enter the radius of cylinder: ");
		r=s.nextInt();
		System.out.println("Enter the height of cylinder: ");
		h=s.nextInt();
		v=p*(r*r)*h;
		System.out.println("Volume is :"+v);
		
		
	}
}
