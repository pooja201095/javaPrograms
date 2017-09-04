package General;
import java.util.Scanner;


public class Vowels {
	public static void main(String args[])
	{
		String a;
		int i,cnt=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a String ");
		a=s.nextLine();
		for(i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u')
			{
				System.out.println(a.charAt(i)+" is vowel");
			}
			else{
				System.out.println(a.charAt(i)+" is consonent");
			}
		}
	}

}
