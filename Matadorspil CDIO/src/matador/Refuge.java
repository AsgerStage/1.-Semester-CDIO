package matador;

import desktop_resources.GUI;

public class Refuge extends Felt {
	protected int bonus;
	
	public Refuge(int bonus, int feltnr, String title, String subText, String description) {
		super(feltnr, title, subText, description);
		this.bonus = bonus;
	}
	
	public Refuge(int bonus) {
		super();
		this.bonus = bonus;
	}
	
	public Refuge() {
		super();
	}
	
	public void landOnField(Spiller spiller) {
		spiller.konto.indsæt(bonus);
		GUI.getUserButtonPressed(spiller+" gets " + bonus + " free money", "ok");
	}
	
	public int getRent() {
		return -bonus;
	}
	
	public String toString() {
		return title + ", gives " + bonus + " cash money";
	}
}
