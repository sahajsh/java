//variable length arguments ->
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		fun(3,4,5,6,746);

	}
    static void fun(int...var){
        System.out.println(Arrays.toString(var));
    }
}

//EXAMPLE -2
	//variable length arguments ->
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		fun("Sahaj","Shukla","Btech C.S.E");

	}
    static void fun(String...var){
        System.out.println(Arrays.toString(var));
    }
	
	
	
}
//output- [Sahaj, Shukla, Btech C.S.E]

// EXAMPLE-3
//mix of arguments->
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
	    	

       multiple(2,3,"sahaj","dff","eerr"); 

	}
    static void multiple(int a ,int b,String...s){
        System.out.println(Arrays.toString(s));//[1,2,3,4]
    }
}

