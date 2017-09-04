package General;

import java.util.Scanner;

public class ThreeLetterWord {
	public static void main(String args[])
	{
		String a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a 3 letter word");
		a=s.next();
		if(a.length()==3)
		{
			if(a.charAt(0)=='a' || a.charAt(0)=='b' || a.charAt(0)=='c')
			{
				if(a.charAt(1)=='a' && a.charAt(2)=='t')
				{
					System.out.println("Expression matched");
				}
				else{
					System.out.println("Expression not matched");
				}
				
			}
			else
			{
				System.out.println("Expression not matched");
			}
		}
		else{
			System.out.println("Invalid. Not a three letter word");
		}
	}
}
