package Numeric;

import java.util.Scanner;

public class FirstDivBySecond {
	public static void main(String args[])
	{
		int f,se;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first and second nos :");
		f=s.nextInt();
		se=s.nextInt();
		if(f>0 && se>0)
		{
			if(f%se==0)
			{
				System.out.println(f+" Is Divisible by "+se);
			}
			else{
				System.out.println(f+" Is Not Divisible by"+se);
			}
		}
		else{
			System.out.println("Number cant be zero");
		}
	}

}
