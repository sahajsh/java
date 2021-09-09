
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
        float tempc=in.nextFloat();
        float tempf=(tempc* 9/5) +32;
        System.out.println(tempf);
	}
}

