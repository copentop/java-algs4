import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import c01.BinarySearch;
 
public class BinarySearchTest
{
	public static void main(String[] args)
 	{
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		for(int i : whitelist ) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		System.out.println("read: \n");
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if (BinarySearch.rank(key, whitelist) < 0) {
				StdOut.println(key);
			}
		}
		System.out.println();
	}
}

