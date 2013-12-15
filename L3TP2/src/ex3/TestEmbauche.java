package ex3;

import java.util.GregorianCalendar;

public class TestEmbauche {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		GregorianCalendar date = new GregorianCalendar(1980, 9, 15);
		
		Secretaire s1 =null;
		try{
		s1 = new Secretaire("T", "P", date, new Adresse(1, "ldt", "20600", "bastia"), 2000.0);
		}
		catch(EmbaucheException e){
			StringBuilder str = new StringBuilder();
			str.append(e.getNom() + " " + e.getPrenom() +" (" + e.calculAge() + " ans),");
			if (e.calculAge() < 16)
			{
				str.append(" revenez dans " + (16 - e.calculAge()) + " an(s), vous êtes bien trop jeune !" );
			}
			else
			{
				str.append(" vous avez " + (e.calculAge() - 65) + " an(s) de trop, désolé ..");
			}
			System.out.println(str);
		}
		s1.augmenterSalaire();
		//System.out.println("salaire "+ s1.getSalaire());
		System.out.println("salaire "+ s1.getSalaireFinal());
		//s1.calculAge();
	}

}
