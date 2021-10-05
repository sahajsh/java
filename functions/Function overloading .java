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
//two or more  functions with same name or return type  they can exists but  parameters are different.it happens in compile time 
//which decides which function to run called function overloading 


//function overriding happens at run time.
