package General;

import java.util.Scanner;

class GroDetails{
	String itemName="Apple";
	int wt,price=120;
	
	public void addWt(){
		wt=wt+1;
	}

	public void remWt(){
		wt=wt-1;
	}

	public int disWt(){
		return wt;
	}
}
public class Weight {
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		char c,y;
		GroDetails gd= new GroDetails();
		do
		{
			System.out.println("Enter your choice: \na]Add Weights \nb]Remove Weights \nc]Display current weight");
			c=s.next().charAt(0);
			switch(c)
			{
			case'a':
				gd.addWt();
				break;
			case 'b':
				gd.remWt();
				break;
			case 'c': 
				System.out.println(gd.disWt());
			}
			System.out.println("Do you want to continue(y/n)");
			y=s.next().charAt(0);
		}while(y=='y');
		if(y=='n')
		{
			System.out.println("Item name:"+gd.itemName);
			System.out.println("Item wt:"+gd.disWt()+"kg");
			System.out.println("Item price:"+(gd.disWt()*gd.price));
		}
	}

}
