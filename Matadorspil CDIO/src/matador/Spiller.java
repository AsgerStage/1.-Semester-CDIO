package matador;

import desktop_resources.GUI;
import matador.Konto;


public class Spiller {

	private int felt;
	private int number;
	private int fleets;
	private int camps;
	private boolean loser;
	private String navn;
	public Konto konto;

	public Spiller(int number) {
		felt = 0;			//starter på felt 1
		this.number = number;
		fleets = 0;
		camps = 0;
		loser = false;
		konto = new Konto();
	}
	
	public Spiller(String navn, int number, int balance) {
		felt = 0;			//starter på felt 1
		this.number = number;
		fleets = 0;
		camps = 0;
		loser = false;
		this.navn = navn;
		konto = new Konto(balance);
	}
	
	public void move(int move) {
		GUI.removeCar(felt + 1, ""+number);
		felt += move;
		felt = felt%21;		//sætter feltet til 0-20
		GUI.setCar(felt+1, ""+number);
	}
	
	public int getFelt() {
		return felt + 1;		//returnerer 1-21
	}
	
	public boolean hasLost() {
		return loser;
	}
	
	public void lose() {
		loser = true;
	}
	
	public int getFleets() {
		return fleets;
	}
	
	public void addFleet() {
		fleets++;
	}
	
	public int getCamps() {
		return camps;
	}
	
	public void addCamp() {
		camps++;
	}
	
	public int getKonto() {
		return konto.getKonto();
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		return "Player " + number;
	}
}

