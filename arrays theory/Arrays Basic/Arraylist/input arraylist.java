
//input of arraylist
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>(5);
            for(int i =0; i<5; i++){
                list.add(sc.nextInt());
            }
            
                System.out.println(list);//list index will not work here get item at any index// [1, 2, 3, 4, 5]
            for(int i =0;i<5;i++){
                System.out.print(list.get(i));// 1 2 3 4 5 
            }
        
          
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(4);
        for(int i =0; i< 4;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
	}

}

[1, 2, 3, 4] is output
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(9);

	
    System.out.println(list);
}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(9);
        System.out.println(list.contains(8));//true
        System.out.println(list);//[2, 5, 4, 8, 9]
        list.set(0,990);
	
    System.out.println(list);[990, 5, 4, 8, 9]
}
}


