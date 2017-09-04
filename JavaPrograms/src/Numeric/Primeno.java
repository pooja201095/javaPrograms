package Numeric;

public class Primeno {
	public static void main(String args[])
	{
		int i=0,n=0;
		
		String pn="";
		for(i=1;i<=20;i++)
		{
			int count=0;
			for(n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				pn=pn+i+" ";
			}
		}
		System.out.println("Prime number are ");
		System.out.println(pn);
	}
	
}
