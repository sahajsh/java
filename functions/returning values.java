import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args) {
		
        int ans=sum2();
        System.out.println(ans);
	}
    static int sum2(){     //return type is int  not void and  if we use void gives error
        Scanner in =new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int sum=n1+n2;
        return sum ;// after return no line will be executed.
    }
}

