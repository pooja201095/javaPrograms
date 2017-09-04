package Numeric;

import java.util.Scanner;

public class Calci {
	
	
	public int add(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int mul(int a,int b){
		return a*b;
	}
	public int div(int a,int b){
		return a/b;
	}
	public static void main(String args[])
	{
		int a;
		int b;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		Calci c= new Calci();
		if(a>0 && b>0)
		{
		char x;
		System.out.println("Enter a choice: \n a]Addition\n b]Subtraction\n c]Multiplication\n c]division");
		x=s.next().charAt(0);
		switch(x)
		{
		case 'a':
			System.out.println(c.add(a,b));
			break;
		case 'b':
			System.out.println(c.sub(a,b));
			break;
		case 'c':
			System.out.println(c.mul(a,b));
			break;
		case 'd':
			System.out.println(c.div(a,b));
			break;
		default:
			System.out.println("Invalid");
		}
		}
		else{
			System.out.println("Numbers are not valid");
		}
	}

}
