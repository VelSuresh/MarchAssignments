package assignments_Day2;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) 
	
	{
		
		
		int []missarr = {1,2,3,4,6,7,8};
		
		Arrays.sort(missarr);
		
		for(int i=1;i<missarr.length;i++)
		{
			if (i != missarr[i-1])
			{
				System.out.println("The missing Element in an array is "+i);
				
				break;
			}
		}
	}

}
