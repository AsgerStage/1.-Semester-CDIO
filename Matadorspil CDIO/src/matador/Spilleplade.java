package matador;

import java.util.ArrayList;

public class Spilleplade
{

	ArrayList<Felt> felter = new ArrayList<Felt>();
	ArrayList<Spiller> spillere = new ArrayList<Spiller>();
	public static int spillersTur = 0;
	
	public Spilleplade() 
	{
		felter.add(new Territory("Tower",2500,500));
		felter.add(new Territory("Tower2",2500,500));
		felter.add(new Territory("Tower3",2500,500));
		felter.add(new Territory("Tower4",2500,500));
		felter.add(new Territory("Tower5",2500,500));
		felter.add(new Territory("Tower6",2500,500));
		felter.add(new Territory("Tower7",2500,500));
		felter.add(new Territory("Tower8",2500,500));
		felter.add(new Territory("Tower9",2500,500));
		felter.add(new Territory("Tower10",2500,500));
		
		
	}

}
