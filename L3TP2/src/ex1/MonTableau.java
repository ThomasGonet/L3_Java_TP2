package ex1;

public class MonTableau implements EstComparable {
	int[] t;
	
	public MonTableau(int[] t)
	{
		this.t = t;
	}
	
	public int sum()
	{
		int S = 0;
		for (int i = 0; i < t.length; i++)
		{
			S += t[i];
		}
		return S;
	}

	@Override
	public int compareA(MonTableau t) {
		if(this.sum() < t.sum())
			return -1;
		else if (this.sum() == t.sum())
			return 0;
		else 
			return 1;
	}
	
}
