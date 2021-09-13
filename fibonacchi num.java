
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int count =2;
		while(count<=n){
			int temp=b;
			b=b+a;
			a=temp;
			count++;
		}
	   System.out.println(b);

	}
}

