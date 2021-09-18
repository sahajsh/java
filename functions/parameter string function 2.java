
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.print("wt is your name :  ");
        System.out.println(name);

        String greet=greetings(name);
        System.out.println(greet);
	}
    static String greetings(String name){
        String messg="hi "+name;
        return messg;
    }
}

