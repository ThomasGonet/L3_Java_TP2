package ex2;

import java.util.GregorianCalendar;

public class TestEmbauche {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		GregorianCalendar date = new GregorianCalendar(1980, 9, 15);
		
		Secretaire s1 =null;
		try{
		s1 = new Secretaire("T", "P", date, new Adresse(1, "ldt", "20600", "bastia"), 2000.0);
		}
		catch(EmbaucheException e){}
		s1.augmenterSalaire();
		//System.out.println("salaire "+ s1.getSalaire());
		System.out.println("salaire "+ s1.getSalaireFinal());
		//s1.calculAge();
		
		Personne p = new Personne("Go", "Go", 25, 10, 1992, 2, "volp", "20600", "Furiani");
		System.out.println(p.getAdresse());
		Personne p2 = null;
		try {
			p2 = (Personne)p.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p2.getAdresse());
		Adresse a2 = new Adresse(1, "ldt", "20600", "bastia");
		p2.setAdresse(a2);
		System.out.println(p2.getAdresse());
		Secretaire s2 = null;
		try {
			s2 = (Secretaire)s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s2.getAdresse());
	}

}
