import java.util.*;
import java.lang.*;
import java.io.*;

/* type conversion and type casting  */
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
       // int num=sc.nextFloat();//error automatically it will not work.. we assigning bigger value in integer call narrow 
       // or explicit typecasting or narrowing
       int num=(int)(34.22f);
      // convert float to int explicit bcoz float big than int
        System.out.println(num);
      
      //int into float easily convert 
        float num2=34;
        System.out.println(num2);
    }
}
