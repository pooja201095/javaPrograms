package General;


public class Abstn extends Abstn1 {
	public static float p=3.14f;
	@Override
	public int tri(int l, int h) {
		
		return (l*h)/2;
	}

	@Override
	public int sq(int l) {
		// TODO Auto-generated method stub
		return l*l;
	}

	@Override
	public int rec(int l, int b) {
		// TODO Auto-generated method stub
		return l*b;
	}

	@Override
	public float cir(int r) {
		// TODO Auto-generated method stub
		return p*r*r;
	}

	
}
