
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
     String greetings=greet("sahaj shukla");
     System.out.println(greetings);
	}
    static String greet(String name){
        String messg="hello "+ name;
        return messg;
    }
   
    }

//output- hello sahaj shukla
