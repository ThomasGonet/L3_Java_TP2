package ex3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Secretaire extends Employe{
	private ArrayList<Manager> Managers;
	private double salaireFinal;
	private static final double pPerManager = 0.001;

	protected Secretaire(String nom, String prenom, GregorianCalendar date, Adresse adresse, double salaire) throws EmbaucheException {
		super(nom, prenom, date, adresse, salaire);
		salaireFinal = salaire;
		
	}
	
	public void addManager(Manager m)
	{
		if( Managers.size() < 5)
			Managers.add(m);
		else
			System.out.println("La secrétaire a déjà trop de boulot !");
	}
	
/*	public Secretaire createInstance(String nom, String prenom, GregorianCalendar date, Adresse adresse, Secretaire S)
	{
		if( 16 < calculAge(date) && calculAge(date) < 65)
			return new Secretaire(nom, prenom, date, adresse, salaire);
		else
			return null;
	}*/
	
	@Override
	public void augmenterSalaire() {
		if(Managers != null)
			salaireFinal = salaire + salaire*(pPerManager * Managers.size());		
	}

	public double getSalaireFinal() {
		return salaireFinal;
	}	
	

}
