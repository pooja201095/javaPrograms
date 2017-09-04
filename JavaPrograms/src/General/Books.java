package General;

import java.util.Scanner;

class CommonInfo{
	String authorName,title;
	int price,noOfPages;
	
}
class Software extends CommonInfo{
	String swName,swVersion;
	public void display(String sn,String sv,String an,String t,int p,int np){
		System.out.println("Book Details are :\n"+sn+"\n"+sv+"\n"+an+"\n"+t+"\n"+p+"\n"+np+"\n");
	}
	
}
class Hardware extends CommonInfo{
	String hwCategory,hwPublisher;
	public void display(String hc,String hp,String an,String t,int p,int np){
		System.out.println("Book Details are :\n"+hc+"\n"+hp+"\n"+an+"\n"+t+"\n"+p+"\n"+np+"\n");
	}
	
}

public class Books {
	public static void main(String args[])
	{
		Software s= new Software();
		Hardware h= new Hardware();
		char c;
		Scanner sc= new Scanner(System.in);
		System.out.println("a]Software\nb]Hardware");
		c=sc.next().charAt(0);
		if(c=='a')
		{
			System.out.println("Enter book details as follows: Software name, version, author name, title, price, no of pages");
			String sn=sc.next();
			String v=sc.next();
			String an=sc.next();
			String t=sc.next();
			int p=sc.nextInt();
			int nop=sc.nextInt();
			s.display(sn, v, an, t, p, nop);
			
		}
		else if(c=='b')
		{
			System.out.println("Enter book details as follows: Hardware category, publisher, author name, title, price, no of pages");
			String ca=sc.next();
			String pu=sc.next();
			String an=sc.next();
			String t=sc.next();
			int p=sc.nextInt();
			int nop=sc.nextInt();
			h.display(ca, pu, an, t, p, nop);
		}
		else{
			System.out.println("Invalid....");
		}
		
	}

}
