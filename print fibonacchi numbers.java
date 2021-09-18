
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args)
	{
		int a=0;
        int b=1;
        int c;
        int n=10;
        System.out.print(a+" "+b);
        for(int i=2;i<=10;i++){
             c=a+b;
             System.out.print(" "+c);
             a=b;
             b=c;     

        }
        
	}
}

