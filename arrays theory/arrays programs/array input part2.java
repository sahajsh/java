// input array of integers ->
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
	Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    for(int i =0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
  }
}
//1 2 3 4 33 input 
//1 2 3 4 33 output 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  for each loop->
    
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
         int[] arr = {1,23,2,3,3,12};
         for(int x: arr){
             System.out.println(x);
         }
    }
}

// 1 23 2 3 3 12 is output 
/////////////////////////////////////////////////////////////////input for each loop///////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

         int[] arr = new int[3];
         for(int i=0;i<3;i++){
             arr[i] =sc.nextInt();
         }
         
         for(int x: arr){
             System.out.println(x);
         }
		System.out.println(arr[4]);//it gives error
    }
}// 234
// 234 is output



