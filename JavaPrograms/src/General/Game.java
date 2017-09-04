package General;

class Commonfun{
	public void displayS(){
		System.out.println("Display score");
	}
	
}
class Game1 extends Commonfun{
	public void playgame(){
		System.out.println("Play game1");
	}
	public void computescore()
	{
		System.out.println("Compute score 1");
	}
	
}
class Game2 extends Commonfun{
	public void playgame(){
		System.out.println("Play game2");
	}
	public void computescore()
	{
		System.out.println("Compute score 2");
	}
	
}

public class Game {
	public static void main(String args[]){
		Game1 g1= new Game1();
		Game2 g2= new Game2();
		g1.playgame();
		g1.computescore();
		g1.displayS();
		g2.playgame();
		g2.computescore();
		g2.displayS();
		
	}

}
