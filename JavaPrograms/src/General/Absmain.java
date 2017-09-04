package General;

import java.util.Scanner;

public class Absmain {
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int l,b,h,r;
		System.out.println("Enter the length, bredth,height ,radius:");
		l=s.nextInt();
		b=s.nextInt();
		h=s.nextInt();
		r=s.nextInt();
		Abstn a= new Abstn();
		System.out.println("Area of rectangle is "+a.rec(l, b));
		System.out.println("Area of square is "+a.sq(l));
		System.out.println("Area of triangle is "+a.tri(l, h));
		System.out.println("Area of circle is "+a.cir(r));
		
	}
}
