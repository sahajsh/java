//change value program 
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		int[] arr = {2,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

	}
    static void change(int[] nums){
        nums[1] =89;
    }
}

[2, 89, 5, 6] is output
