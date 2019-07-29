import c01.Gcd;

public class GcdTest
{

	public static void main(String[] args)
	{
		System.out.printf("p %d, q %d, r %d\n", 4, 2, Gcd.gcdf(4,2));
		System.out.printf("p %d, q %d, r %d\n", 4, 5, Gcd.gcdf(4,5));
		System.out.printf("p %d, q %d, r %d\n", 30, 12, Gcd.gcdf(30,12));
		System.out.printf("p %d, q %d, r %d\n", 5, 17, Gcd.gcdf(5,17));
	}
}

