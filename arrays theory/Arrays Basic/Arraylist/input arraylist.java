
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

