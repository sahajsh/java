
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) {
		
        sum();
	}
    static void sum(){
        Scanner in =new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int sum=n1+n2;
        System.out.println(sum);
    }
}

