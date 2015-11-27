package matador;

import desktop_resources.GUI;
import matador.Spiller;

public abstract class Felt
{
	protected int feltnr;
	protected String title;
	protected String subtext;
	protected String description;
		
	public abstract void landOnField(Spiller spiller);
	
	protected Felt(int feltnr, String title, String subText, String description) {
		GUI.setTitleText(feltnr, title);
		GUI.setSubText(feltnr, subText);
		GUI.setDescriptionText(feltnr, description);
		this.feltnr = feltnr;
		this.title = title;
		this.subtext = subText;
		this.description = description;
	}
	
	protected Felt() {}
	
	public int getFelt() {
		return feltnr;
	}
	
	public void setTitle(String title) {
		this.title = title;
		GUI.setTitleText(feltnr, title);
	}
	
	public void setSubtext(String subtext) {
		this.subtext = subtext;
		GUI.setSubText(feltnr, subtext);
	}
	
	public void setDescription(String description) {
		this.description = description;
		GUI.setDescriptionText(feltnr, description);
	}
	}


