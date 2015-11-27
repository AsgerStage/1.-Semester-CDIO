package matador;

import desktop_resources.GUI;
import matador.Spiller;

public class Territory extends Ownable
{
	private int leje;

	public Territory(int leje, int pris, int fieldNumber, String title, String subText, String description) {
		super(fieldNumber, title, subText, description);
		this.leje = leje;
		this.pris = pris;
		this.feltnr = super.feltnr;
		this.title = super.title;
		this.subtext = super.subtext;
		this.description = super.description;
	}
	
	public Territory(int leje) {
		super();
		this.leje = leje;
	}

	public Territory() {
		super();
	}

	public void landOnField(Spiller spiller) {
		//		buy = false;
		if(ejer == null) {
			boolean buy = GUI.getUserLeftButtonPressed(title + " is not owned", "buy", "ignore");
			if(buy) {
				buy(spiller);
			}
			else GUI.getUserButtonPressed(spiller + " did not buy " + title, "ok");
		}
		else {
			if(spiller!=ejer) {
				if(spiller.getKonto() < leje) {
					GUI.getUserButtonPressed(spiller + " pays " + spiller.getKonto() + "\nto " + ejer, "ok");
					spiller.betal(ejer, spiller.getKonto());

				}
				else {
					GUI.getUserButtonPressed(spiller + " pays " + leje + "\nto " + ejer, "ok");
					spiller.betal(ejer, leje);
					
				}
			}
			else GUI.getUserButtonPressed(ejer + " owns " + title, "ok");
		}
	}

	public void lose() {
		ejer = null;
	}

	public int getLeje() {
		return leje;
	}

	public String toString() {
		if(ejer != null)
			return this.title +  " owned by " + ejer + "\n Rent is " + leje;
		return this.title + " isn't owned" ;
	}
}
