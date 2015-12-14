package matador;

public class Dice {
	private int d1;
	private int d2;
	
	public Dice() {
		d1 = 0;
		d2 = 0;
	}
	
	public int getd1() {
		return d1;
	}
	
	public int getd2() {
		return d2;
	}
	
	public void setDice(int d1, int d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public void roll() {
		d1 = (int)(Math.random()*6) + 1;
		d2 = (int)(Math.random()*6) + 1;
	}
	
	public int getSum() {
		return d1 + d2;
	}
	
	
	// Used for testing purposes
	protected void setd1(int n) {
		d1 = n;
	}
	
	protected void setd2(int n) {
		d2 = n;
	}
	
	public String toString() {
		return "die 1 is " + d1 + " and die 2 is " + d2;
	}
}
