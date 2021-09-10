
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
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        int max=num1;
        if(num2>max){
            max=num2;
        }
        if(num3>max){
            max=num3;
        }
        
        System.out.println(max);
        
	}
}

//multiple if means dono m correct condition h to dono execute hongy. else if me koi ek hi hoga upr wala incorrect h to neechy wala
//execute.
//--------------------------------------by using math function---------------------------------------------------------------------------------------------

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
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        int max=Math.max(num3 ,Math.max(num1,num2));
        System.out.println(max);
	}
}

