package matador;

import desktop_resources.GUI;

public class Laborcamp extends Ownable {
	protected int leje;
	private Dice d1 = new Dice();
	
	public Laborcamp(int leje, int pris, int fieldNumber, String title, String subText, String description) {
		super(fieldNumber, title, subText, description);
		this.leje = leje;
		this.pris = pris;
	}
	
	public Laborcamp(int leje) {
		super();
		this.leje = leje;
	}
	
	public Laborcamp() {
		super();
	}
	
	public void landOnField(Spiller spiller) {
		if(ejer == null) {
			boolean buy = GUI.getUserLeftButtonPressed(title + " is not owned", "buy", "ignore");
			if(buy) {
				buy(spiller);
			}
			else GUI.getUserButtonPressed(spiller + " did not buy " + title, "ok");
		}
		else {
			leje = d1.getSum() * 100 * ejer.getCamps();
			if(spiller.konto.getKonto() < leje) {
				GUI.getUserButtonPressed(spiller + " pays " + spiller.getKonto() + "\n to " + ejer, "ok");
				ejer.konto.indsæt(spiller.getKonto());
				spiller.konto.hæv(spiller.getKonto());
			}
			else if(spiller!=ejer) {
				GUI.getUserButtonPressed(spiller + " pays " + leje + "\n to " + ejer, "ok");
				spiller.konto.hæv(leje);
				ejer.konto.indsæt(leje);
			}
			else GUI.getUserButtonPressed(ejer + " owns " + title, "ok");
		}
	}
	
	public void buy(Spiller spiller) {
		if(spiller.getKonto() > pris) {
			ejer = spiller;
			spiller.konto.hæv(pris);
			spiller.addCamp();
			GUI.getUserButtonPressed(spiller + " bought " + title, "ok");
		}
		else GUI.getUserButtonPressed(spiller + " cannot afford " + title, "ok");
	}
	
	public int getLeje() {
		return leje;
	}
	
	public String toString() {
		if(ejer != null)
			return title +  " owned by " + ejer + "\nRent is " + leje;
		return title + " isn't owned" ;
	}
}
