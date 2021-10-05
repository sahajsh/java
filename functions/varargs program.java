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

