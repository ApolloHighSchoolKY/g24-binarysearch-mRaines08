import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		int bottom = 0;
		int top = ray.length - 1;
		int middle = top / 2;
		Arrays.sort(ray);

		System.out.println(Arrays.toString(ray));

		while(!(top < bottom))
		{
			if(item > ray[middle])
				bottom = middle + 1;
			else if(item < ray[middle])
				top = middle - 1;
			else if(ray[middle] == item) //this part is not necessary it can just be and else
				return middle;

			middle = (top + bottom) / 2;
		}
		
		return -1;
	}
}
