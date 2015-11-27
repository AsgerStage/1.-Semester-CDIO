package matador;

import desktop_resources.GUI;
import matador.Spiller;

public class Fleet extends Ownable
{
	
	protected final static int RENT_1 = 500;
	protected final static int RENT_2 = 1000;
	protected final static int RENT_3 = 2000;
	protected final static int RENT_4 = 4000;
	
	private Spiller ejer;
	
	public Fleet(int price, int feltnr, String title, String subText, String description) {
		super(feltnr, title, subText, description);
		this.pris = pris;
	}
	
	public Fleet() {
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
			if(spiller.getKonto() < getLeje()) {
				GUI.getUserButtonPressed(spiller + " pays " + spiller.getKonto() + "\n to " + ejer, "ok");
				spiller.konto.hæv(spiller.getKonto());
				ejer.konto.indsæt(spiller.getKonto());

				
			}
			else if(spiller!=ejer) {
				GUI.getUserButtonPressed(spiller + " pays " + getLeje() + "\n to " + ejer, "ok");
				spiller.konto.hæv(getLeje());
				ejer.konto.indsæt(getLeje());
				
			}
			else GUI.getUserButtonPressed(ejer + " owns " + title, "ok");
		}
	}
	
	public void lose() {
		ejer = null;
	}
	
	public int getLeje() {
		switch(ejer.getFleets()) {
		case 1: return RENT_1;
		case 2: return RENT_2;
		case 3: return RENT_3;
		case 4: return RENT_4;
		default: return 0;
		}
	}
	
	public void buy(Spiller spiller) {
		if(spiller.getKonto() > pris) {
			ejer = spiller;
			spiller.konto.hæv(pris);
			ejer.addFleet();
			GUI.getUserButtonPressed(spiller + " bought " + title, "ok");
		}
		else GUI.getUserButtonPressed(spiller + " cannot afford " + title, "ok");
	}
	
	public String toString() {
		if(ejer != null)
			return title +  " owned by " + ejer;
		return title + " isn't owned" ;
	}
}
