
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		//type conversion and type casting
        //int num=32;
        //System.out.println(num);
       // float num2=32.4f;
        //System.out.println(num2);

                                      //it give error int is small float is large
        //int num=32.45f;
        //System.out.println(num);
        int num=(int)(32.9f);
        System.out.println(num);
        float num2=67;
        System.out.println(num2);
        byte num7=67;

        System.out.println(num7);
        //automatic type promotion in expression 
		/* all the byte character short values promoted  to int 
		any one operands is long then whole operation is converted to long if float then whole convert to float(long float double)
		ex- 3*3.555f= float value
		Byte ranges between -128 and 127 inclusive. When int is assigned to the value between -128 to 127 inclusive, the conversion to the byte of that number will remain the same.
  If int is less than -128, we just add than number with 256 to convert into byte.
   If int ranges between 128 to 256 inclusive, that number will be deducted with 256.
   If the number is greater than 256, We will divide that number with 256 and take the reminder...
		
		
		
		
		
		*/
        int num3=1099;
        byte b=(byte)(num3);//max range in byte is 256  257%256=1
		//if the integer value is greator than byte range(127) than if we convert from int to byte just divide by 256 and remainder it 1099/256=75 we convert int to byte.
        System.out.println("example of automatic type promotion"+ b);//75
        byte a =40;
        byte e=50;
        byte c=100;
        int  d=(a*e)/c;
        System.out.println(d);
       // byte nu= (a*e);//it convert to int int cant be stored in byte we have to type cast byte 
       // System.out.println(nu);




   
	}
}
