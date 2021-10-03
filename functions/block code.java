// Block code 
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		int a =87;
        int b =23;
       {
           int a =78;//it gives error we cannot initialise same a value as a is declare abov also we can modify it.
           a=78;//it is correct.
           //value initialised in block will remain in block
           int c=23;
           sop(c);//it is correct 
       }
        sop(c); //it gives error we access c outside the block
        


	}
    
}

