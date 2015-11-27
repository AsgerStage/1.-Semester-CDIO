package matador;

import desktop_resources.GUI;

public class Tax extends Felt {
	protected int taxAmount;
	protected int taxRate = -1;
	
	public Tax(int taxAmount, int feltnr, String title, String subText, String description) {
		super(feltnr, title, subText, description);
		this.taxAmount = taxAmount;
	}
	
	public Tax(int taxAmount) {
		super();
		this.taxAmount = taxAmount;
	}
	
	public Tax() {
		super();
	}
	
	public void landOnField(Spiller spiller) {
		boolean flat = false;
		flat = GUI.getUserLeftButtonPressed("Do you want to pay a flat amount of " + taxAmount + " or 10% of your cash?", "flat", "percentage");
		if(flat) {
			if(spiller.getKonto() >= taxAmount) {
				GUI.getUserButtonPressed(spiller+" pays " + taxAmount, "ok");
				spiller.konto.hæv(taxAmount);
			}
			else {
				GUI.getUserButtonPressed(spiller+" pays " + spiller.getKonto(), "ok");
				spiller.konto.hæv(spiller.getKonto());
			}
		}
		else {
			GUI.getUserButtonPressed(spiller+" paid " + (int)(spiller.getKonto()*0.1), "ok");
			spiller.konto.hæv((int)(spiller.getKonto()*0.1));
		}
	}
	
	public int getRent() {
		return taxAmount;
	}
	
	public String toString() {
		return title + ", pay " + taxAmount ;
	}
}
