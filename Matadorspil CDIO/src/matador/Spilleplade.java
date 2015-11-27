package matador;

import java.util.ArrayList;

public class Spilleplade
{

	ArrayList<Felt> felter = new ArrayList<Felt>();
	ArrayList<Spiller> spillere = new ArrayList<Spiller>();
	public static int spillersTur = 0;
	
	
	
	public Spilleplade() 
	{
		/*felter.add(new Territory("Tribe Encampment",2500,500));
		felter.add(new Territory("Crater",2500,500));
		felter.add(new Territory("Cold Desert",2500,500));
		felter.add(new Territory("Black Cave",2500,500));
		felter.add(new Territory("The Werewall",2500,500));
		felter.add(new Territory("Mountain Village",2500,500));
		felter.add(new Territory("South Citadel",2500,500));
		felter.add(new Territory("Palace gates",2500,500));
		felter.add(new Territory("Tower",2500,500));
		felter.add(new Territory("Castle",2500,500));
		felter.add(new Refuge("Walled city",5000));
		felter.add(new Refuge("Monastery",500));*/
		felter.add(new Laborcamp("Huts in the mountain",2500));
		felter.add(new Laborcamp("The pit",2500));/*
		felter.add(new Fleet("Second Sail",2500));
		felter.add(new Fleet("Sea Grover",2500));
		felter.add(new Fleet("The Buccaneers",2500));
		felter.add(new Fleet("Privateer armade",2500));*/
		
		
		
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

