package General;

import java.sql.Date;
import java.util.Scanner;

public class Train {
	Scanner s= new Scanner(System.in);
	String name="pooja",tname="janshatabdi",src="thane",des="aurangabad";
	int not=1,amt=700;
	String arrtime="1pm",deptime="6:15am";
	String doj="10/10/2017";
	public void display(){
		System.out.println("Name: "+name);
		System.out.println("Name of Train: "+tname);
		System.out.println("Source: "+src);
		System.out.println("Destination: "+des);
		System.out.println("No of passengers: "+not);
		System.out.println("Amount: "+amt);
		System.out.println("Arrival time: "+arrtime);
		System.out.println("Departure time: "+deptime);
		System.out.println("Date of journey: "+doj);
		
		
		
	}
	
	public static void main(String args[]){
		Train t= new Train();
		t.display();
		
	}

}
