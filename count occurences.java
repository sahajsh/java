
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		int n=2342234;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==2){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);



	}
}

