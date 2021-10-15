//creation of arraylist collection framework _>
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);//[2, 1, 3, 4, 5]
        //we can update also 
        list.remove(2);
        System.out.println(list);//[2, 1, 4, 5]
        list.set(0,33);//true
        System.out.println(list);//[33, 1, 3, 4, 5]
        System.out.println(list.contains(4));//check if the number is present in the list or not 
	}
}
//capacity is 3 item why it is storing more than 3 item->
