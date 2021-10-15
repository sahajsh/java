
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
