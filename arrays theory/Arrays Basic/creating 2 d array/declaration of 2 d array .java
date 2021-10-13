//2d array declaration and initialisation->
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) {
        int[][] arr = new int[3][];
        //or
        int[][] arr2 = {
                       {2,3,4},//0 th index
                       {3,2},//1st index
                       {4,3}//2nd index

                       };
		
	}
}

arr[2] ={4,3}
arr[2][0] = {4}
/////////////////////////////////////////////    input of 2 d array  ->//////////////////////////////////////////////////////////////////////////////////////////////


//2d array input and output->

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int[][] arr = new int[2][3];
      System.out.println(arr.length);// no. of rows = 2
      for(int i =0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
              arr[i][j] = sc.nextInt();
          }
      }
      
      
      for(int i =0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();

      }
   
   

    }
}

output-
2
1 2 3 
4 5 6 
