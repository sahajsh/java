
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{ int n=234567;
      int ans=0;
      while(n>0){
          int rem=n%10;
          n=n/10;
          ans=ans*10+rem;
      }
      System.out.println(ans);

	}
}

