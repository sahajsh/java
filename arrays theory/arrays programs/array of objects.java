
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        String[] str = new String[3];
        for(int i =0;i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[0]="miti";
        System.out.println(Arrays.toString(str));
	}    
}

Output
[sahaj, shukla, amazon]
[miti, shukla, amazon]

input
