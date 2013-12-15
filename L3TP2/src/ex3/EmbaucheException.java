package ex3;

public class EmbaucheException extends Exception {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public EmbaucheException()
	{
		System.out.println("Vous n'avez pas l'age requis pour postuler !");
	}
}
