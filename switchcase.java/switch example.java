
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        switch(fruit){
            case "mango":
            System.out.println("king of fruits");
            break;
            case "banana":
            System.out.println(" favourite");
            break;
            case "apple":
            System.out.println(" most favourite");
            break;
            default:
            System.out.println(" none");
        }
	}
}

