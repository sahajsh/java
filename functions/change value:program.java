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

[2, 89, 5, 6] is output// pass by the copy of the value of the reference. pointing to the same object.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//change value program 
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		int a =87;
        int b =23;
        change(a);
        
        System.out.println(a);
        


	}
    static void change(int nums){
        
        
     nums =5;//new object create not modifying thts why it is not change value of a
     System.out.println("nums value " + nums);// ye value got change nums 

        

    }
}
// for primitives pass by value . 
// for objects and references pass by value of that reference variable. both refernce variable pointing to same object if we gonna make change in one that original one is going to be changed
