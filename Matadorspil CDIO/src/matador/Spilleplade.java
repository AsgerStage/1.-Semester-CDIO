package matador;

import java.util.ArrayList;

public class Spilleplade
{

	ArrayList<Felt> felter = new ArrayList<Felt>();
	ArrayList<Spiller> spillere = new ArrayList<Spiller>();
	
	public Spilleplade() 
	{
		felter.add(new Betalingsfelt("Tower",250));
		felter.add(new Betalingsfelt("Crater",-100));
		felter.add(new Betalingsfelt("Palace gates",100));
		felter.add(new Betalingsfelt("Cold Desert",-20));
		felter.add(new Betalingsfelt("Walled city",180));
		felter.add(new Betalingsfelt("Monastery",0));
		felter.add(new Betalingsfelt("Black cave",-70));
		felter.add(new Betalingsfelt("Huts in the mountain",60));
		felter.add(new Betalingsfelt("The Werewall",-80));
		felter.add(new Betalingsfelt("The pit",-50));
		felter.add(new Betalingsfelt("Goldmine",650));
		
	}

}
