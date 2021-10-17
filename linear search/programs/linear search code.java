
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// we are going to search in an array : if item is found then we gonna written index 
        //otherwise if element is not found we gonna return -1
        int[] nums ={1,2,3,4,5};
        int target =6;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
	}
  static int linearSearch(int[] arr, int target){
      if(arr.length== 0){
          return -1;// doesn't exist 
      }
      //run a for loop  
      for(int index =0;index< arr.length;index++){
          // check for element at every index = target
          int element = arr[index];
          if(element == target){
              return index;// this value will return to the function call
          }
      }
// this line will execute if none of the return statements is executed so target is not found . element doesn't exist it return -1
   return -1;
    


  }






}

