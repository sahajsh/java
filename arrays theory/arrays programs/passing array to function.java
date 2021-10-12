
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		int[] nums ={2,3,45,42,1};
		System.out.println(Arrays.toString(nums));

    
       change(nums);
	   System.out.println(Arrays.toString(nums));



	}
	static void change(int[] arr){
		arr[0] =9;

	}
}

output-
[2, 3, 45, 42, 1]
[9, 3, 45, 42, 1]
