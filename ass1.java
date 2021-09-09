//program -1
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String check=(num % 2 ==0) ? "even": "odd";
        System.out.println("the following number is " +check);
    }
}

//program-2

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        System.out.println("hello my brother  " + name);

    }
}



