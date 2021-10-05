//Function overloading example->
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
        fun(3);
        fun("sahaj shukla");
	}
    static void fun(String name) {//different parameters or arguments
        System.out.println(name);

    }
    static void fun(int rollno){
            System.out.println(rollno);

    }
}
//two or more  functions with same name or return type  they can exists but no. of arguments are different or type of arguments .it happens in compile time 
//which decides which function to run called function overloading 


//function overriding happens at run time.
//                                                       FUNCTION OVERLOADING EXAMPLE 2                                        //

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int ans = sum(2,3);
        System.out.println(ans);//5
        
        int sumof3no = sum(2,5,4);
        System.out.println(sumof3no);//11
        
	}
    static int  sum(int a,int b,int c){
      return a+b+c;
    }
    static int sum(int a , int b){
        return a+b;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
UNDERSTANDING AMBIGUITY IN VARARGS->
	
	
//Ambiguity error 
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
	    	
        demo(); //at compile time it won't decide which to run so it gives ambiguity error we're not providing anything to run this.


	}
    static void demo(String...s){
        System.out.println(Arrays.toString(s));
    }
    static void demo(int...a){
        System.out.println(Arrays.toString(a));
    }
}


