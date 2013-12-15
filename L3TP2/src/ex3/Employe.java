package ex3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public /*abstract*/ class Employe extends Personne{
	
	protected GregorianCalendar dateEmbauche;
	protected double salaire;
	protected double salaireFinal;
	
	protected Employe(String nom, String prenom, GregorianCalendar date, Adresse adresse, double salaire)
	throws EmbaucheException
	{
		super(nom, prenom, date, adresse);
		/*Calendar today = Calendar.getInstance();
        GregorianCalendar date16 = new GregorianCalendar(today.get(Calendar.YEAR) - 16, today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH));
        GregorianCalendar date65 = new GregorianCalendar(today.get(Calendar.YEAR) - 65, today.get(Calendar.MONTH), today.get(Calendar.DAY_OF_MONTH));
        
        //l'âge doit être compris entre 16 et 65 ans*/
        
        if(calculAge() < 16 || calculAge() > 65 )
		{	
			throw new EmbaucheException();
		}
		else
		{
			dateEmbauche = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH);
			this.salaire = salaire;
		}
	}
	
	public void augmenterSalaire(double Percent)
	{
		if(Percent > 0)
			salaireFinal = salaire * (1 + Percent);
		else
			System.out.println("Entrez un pourcentage positif !");
	}
	
	public int calculAnnuite()
	{
		Calendar curr = new GregorianCalendar();
		Calendar embauche = new GregorianCalendar(dateEmbauche.get(Calendar.YEAR), dateEmbauche.get(Calendar.MONTH), dateEmbauche.get(Calendar.DAY_OF_MONTH));
		int yeardiff = curr.get(Calendar.YEAR) - embauche.get(Calendar.YEAR);
		curr.add(Calendar.YEAR,-yeardiff);
		if(embauche.after(curr))
		{
			yeardiff = yeardiff - 1;
		}
		return yeardiff;
	}

	public void augmenterSalaire() {
		// TODO Auto-generated method stub
		System.out.println("Entrez un pourcentage !");
	}

}
