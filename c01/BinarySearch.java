package c01;
import java.util.Arrays;

public class BinarySearch
{
	public static int rank(int key , int[] a)
	{
		int low = 0;
		int high = a.length - 1;

		while(low <= high) {
			int mid = low + (high - low)/2;
			if(key < a[mid]) {
				high = mid -1;
			} else if( key > a[mid]) {
				low = mid + 1;
			}

			return mid;
		}

		return -1;
	}
}
