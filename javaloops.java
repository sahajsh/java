
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=0;i<=number;i++){
            System.out.println(i);
        }

        
    }
		
	}
//while loop

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
        public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int i=1;

       while(i<=5){
           System.out.println("hello world");
           i++;
       }
        
    }
		
	}

//basic concept clearing of if statement->

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
        int salary=400;
        if(salary>100){
            salary=salary+200;
        }
        if(salary>=600){
            salary=salary+100;
        }

        System.out.println(salary);

	}
}

//700
//if me both condition will execute.
/////////////////////////////////////////////////if else//////////////////////////////////////////////////////////////////////////


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
	int salary=400;
        if(salary>100){
            salary=salary+200;
        }
        else{
            salary=salary-200;
        }

        System.out.println(salary);

	}
}

//in if else one condition gonna be run 
