package matador;

import desktop_resources.GUI;
import matador.Felt;
import matador.Spiller;

public abstract class Ownable extends Felt {
	protected int pris;
	protected Spiller ejer;
	
	protected abstract int getLeje();
	
	public Ownable(int feltnr, String title, String subText, String description) {
		super(feltnr, title, subText, description);
	}
	
	protected Ownable() {
		super();
	}
	
	public void buy(Spiller spiller) {
		if(spiller.getKonto() > pris) {
			ejer = spiller;
			spiller.konto.hæv(pris);
			GUI.getUserButtonPressed(spiller + " bought " + title, "ok");
		}
		else GUI.getUserButtonPressed(spiller + " cannot afford " + title, "ok");
	}
	
	public void lose(Spiller spiller) {
		if(spiller.equals(ejer))
			ejer = null;
	}
	
	public Spiller getOwner() {
		return ejer;
	}
}