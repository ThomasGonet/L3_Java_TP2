package ex3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EmbaucheException extends Exception {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	private String nom;
	private String prenom;
	private GregorianCalendar date;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the date
	 */
	public GregorianCalendar getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	
	public EmbaucheException(String nom, String prenom, GregorianCalendar date){
	this.nom = nom;
	this.date = date;
	
	}
	
	public int calculAge(/*GregorianCalendar date*/)
	{
		Calendar curr = new GregorianCalendar();
		Calendar birth = new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH));
		int yeardiff = curr.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
		curr.add(Calendar.YEAR,-yeardiff);
		if(birth.after(curr))
		{
			yeardiff = yeardiff - 1;
		}
		//System.out.println("Age :" + yeardiff);
		return yeardiff;
	}
	
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
