package General;

import java.util.Scanner;

public class EmpDetails {
	public void enter()
	{
		System.out.println("Enter details called");
	}
	public void Display()
	{
		System.out.println("Display details called");
	}
	public void exit()
	{
		System.out.println("Exit called");
	}
	public static void main(String args[])
	{
		EmpDetails ed= new EmpDetails();
	Scanner s=new Scanner(System.in);
	char x,y;
	
	do{
		System.out.println("Enter an option: \n a]Enter data \n b]Display data\n c]Exit ");
	x=s.next().charAt(0);
	if(x=='a')
	{
		ed.enter();
	}
	else if(x=='b')
	{
		ed.Display();
	}
	else
	{
		ed.exit();
	}
	System.out.println("Do you want to continue y/n");
	y=s.next().charAt(0);
	}while(y=='y');
	}
	}

