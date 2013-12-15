package ex3;

import java.util.GregorianCalendar;

public class Manager extends Employe {
	
	private Secretaire s;
	private static final double augPourcentageMan = 0.005;
	
	public Manager(String nom, String prenom, GregorianCalendar date, Adresse adresse, double salaire, Secretaire s) throws EmbaucheException
	{
		super(nom, prenom, date, adresse, salaire);
		this.setS(s);
	}
	
	public Manager(String nom, String prenom, GregorianCalendar date, Adresse adresse, double salaire) throws EmbaucheException
	{
		super(nom, prenom, date, adresse, salaire);
	}
	
	/*public Manager createInstance(String nom, String prenom, GregorianCalendar date, Adresse adresse, Secretaire S)
	{
		if( 16 < calculAge(date) && calculAge(date) < 65)
			return new Manager(nom, prenom, date, adresse, salaire,s);
		else
			return null;
	}*/
	
	public void addSecretaire(Secretaire s)
	{
		this.setS(s);
	}
	
	public void augmenterSalaire()
	{
		salaireFinal = salaire *(1 + calculAnnuite()*augPourcentageMan);
	}
	
	public double getSalaireFinal()
	{
		return salaireFinal;
	}
	
	public double getSalaire()
	{
		return salaire;
	}

	public Secretaire getS() {
		return s;
	}

	public void setS(Secretaire s) {
		this.s = s;
	}

}
