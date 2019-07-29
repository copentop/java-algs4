package c01;

public class Gcd
{
	public static int gcdf(int p, int q)
	{
		if(q == 0 ) {
			return p;
		}

		int r = p % q;

		return gcdf(q,r);
	}
}
