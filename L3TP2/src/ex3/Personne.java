package ex3;


import java.util.*;

public class Personne {
	    private static final Adresse ADRESSE_INCONNUE = null;
	    private String nom;
	    private String prenom;
	    private final GregorianCalendar dateNaissance;
	    private Adresse adresse=ADRESSE_INCONNUE;
	    private static int NB_PERSONNE = 0;
		
		/**
		 * Constructeur de Personne
		 * @param leNom le nom de la personne
		 * @param lePrenom le prenom de la personne
		 * @param laDate la date de naissance de la personne
		 * @param lAdresse l'adresse de la personne
		 */
		public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
			nom = leNom.toUpperCase();
			prenom=lePrenom;
			dateNaissance=laDate;
			adresse=lAdresse;
			NB_PERSONNE++;
		}
		
		/** 
		 * Constructeur de Personne
		 * @param leNom le nom de la personne
		 * @param lePrenom le prenom de la personne
		 * @param j le jour de naissance
		 * @param m le mois de naissance
		 * @param a l'annee de naissance
		 * @param numero le numero de la rue
		 * @param rue la rue
		 * @param code_postal le code postal de l'adresse
		 * @param ville la ville ou la personne habite
		 */
		public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
			this(leNom, lePrenom, new GregorianCalendar(a,m,j), new Adresse(numero,rue,code_postal,ville));
		}

		/**
		 * Accesseur
		 * @return retourne le nom
		 */
		public String getNom(){
			return nom;
		}
		/**
		 * Accesseur
		 * @return retourne le prenom
		 */
		public String getPrenom(){
			return prenom;
		}
		/**
		 * Accesseur
		 * @return retourne la date de naissance	 
		 */
		public GregorianCalendar getDateNaissance() {
			return dateNaissance;
		}
		/**
		 * Accesseur
		 * @return retourne l'adresse	 
		 */
		public Adresse getAdresse() {
			return adresse;
		}
		/**
		 * Modificateur
		 * @param retourne l'adresse	 
		 */
		public void setAdresse(Adresse a) {
			adresse=a;
		}
			
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		public String toString(){
			String result="\nNom : "+nom+"\n"
			+"Prenom : "+prenom+"\n"+
			"Ne(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
			"-"+dateNaissance.get(Calendar.MONTH)+
			"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
			"Adresse : "+
			adresse.toString();
			return result;
		}
		
		public boolean plusAgeeQue(Personne p)
		{
			return this.getDateNaissance().getTime().before(p.getDateNaissance().getTime());
		}
		
		public static boolean plusAgee(Personne p1, Personne p2)
		{
			return (p1.getDateNaissance().getTime().before(p2.getDateNaissance().getTime()));
		} 
	   
		public boolean equals(Object o)
		{
			Personne p = (Personne) o;
			return (this.getNom() == p.getNom() && this.getPrenom()==p.getPrenom() && this.getDateNaissance().equals(p.getDateNaissance()));
		}

		public static int getNB_PERSONNE() {
			return NB_PERSONNE;
		}
		
		
		public int calculAge(/*GregorianCalendar dateNaissance*/)
		{
			Calendar curr = new GregorianCalendar();
			Calendar birth = new GregorianCalendar(dateNaissance.get(Calendar.YEAR), dateNaissance.get(Calendar.MONTH), dateNaissance.get(Calendar.DAY_OF_MONTH));
			int yeardiff = curr.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
			curr.add(Calendar.YEAR,-yeardiff);
			if(birth.after(curr))
			{
				yeardiff = yeardiff - 1;
			}
			//System.out.println("Age :" + yeardiff);
			return yeardiff;
		}
}
