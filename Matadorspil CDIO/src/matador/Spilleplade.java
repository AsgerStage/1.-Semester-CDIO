package matador;

import java.util.ArrayList;

public class Spilleplade
{

	ArrayList<Felt> felter = new ArrayList<Felt>();
	ArrayList<Spiller> spillere = new ArrayList<Spiller>();
	public static int spillersTur = 0;
	
	
	
	public Spilleplade() 
	{
		felter.add(new Territory("Tribe Encampment",1000,100));
		felter.add(new Territory("Crater",1500,300));
		felter.add(new Territory("Mountain",2000,500));
		felter.add(new Territory("Cold Desert",3000,700));
		felter.add(new Territory("Black Cave",4000,1000));
		felter.add(new Territory("The Werewall",4300,1300));
		felter.add(new Territory("Mountain Village",4750,1600));
		felter.add(new Territory("South Citadel",5000,2000));
		felter.add(new Territory("Palace gates",5500,2600));
		felter.add(new Territory("Tower",2500,6000));
		felter.add(new Territory("Castle",2500,8000));
		felter.add(new Refuge("Walled city",5000));
		felter.add(new Refuge("Monastery",500));
		felter.add(new Laborcamp("Huts in the mountain",2500));
		felter.add(new Laborcamp("The pit",2500));
		felter.add(new Fleet("Second Sail",4000));
		felter.add(new Fleet("Sea Grover",4000));
		felter.add(new Fleet("The Buccaneers",4000));
		felter.add(new Fleet("Privateer armade",4000));
		
		
		
	}
	public void sletSpiller(Spiller spiller){
		  spillere.remove(spillere.indexOf(spiller));
	{
	if(spillere.size()==1){
		System.out.println("Der er nu kun 1 spiller tilbage og han/hun har vundet!");
		System.exit(0);
	};
	}
}
}

