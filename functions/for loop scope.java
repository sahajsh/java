// Block code 
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
 public static void main(String[] args){
     for (int i=0;i<3;i++){
         
        int c =56;
      System.out.println(c);//56
     }
     // System.out.println(i); we cannot access i outside the scope of for loop it gives error 
     int c =45;
     System.out.println(c);//45

 }  
}

output->
56
56
56
45
