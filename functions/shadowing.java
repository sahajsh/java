//shadowing concept->
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static int x= 9;//static is object independent we cannot use object dependent things in object independent things.
	public static void main (String[] args) {
        System.out.println(x);//9
	}
} 
