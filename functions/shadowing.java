//shadowing concept->
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static int x= 9; upper level //this is shadwoed lower level is overriding with upper level
    //static is object independent we cannot use object dependent things in object independent things.
	public static void main (String[] args) {
        System.out.println(x);//9
        int x =7;//lower level 
	    //class variable of line 4 is shadowed by this
	    
	    
	    /*
	    int x;   //shadowing begines when local variable is declared
            x =40;  //scope will begin when value is initialised.
	
	    SOP(x);
	    
	    
	    
	    
	    
	    
	    */
        System.out.println(x);//7
        fun();
	}
    static void fun(){
        System.out.println(x);//9
    }
} 

//in this scope is overlapping uppper level is shadwoed lower level is overriding with upper level.
