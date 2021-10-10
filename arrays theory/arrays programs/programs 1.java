
//Syntax of arrays declaration and initialisation ->

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
	int[] rollnos = new int[7];//declaration
        or 

        int[] rollnos = {2,3,4,2,1,23,33};//initialise
	}
}
//int datatype represents wt is the datatype stored inside the array and it should be the same.
//rons(reference variable) pointing to array object contains type integer in the above question. 
int ros[];//declaration of array . ros is getting defined in stack and it is not pointing to anything
ros =new int[4];//memory creation happens here pointing to object. object is being created in heap memory.
 int[]       arr                     =    new int[23];
datatype  reference variable             (object creation in heap memory it is happening in "RUN TIME" OR EXECUTION TIME and called "dynamic memory allocation").
(declaration happen in                    (DMA  - at the run time memory is created)
"compile time")
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

in c/c++ the block of memory stored continuously it is continuous memory allocation in ram we have cells and cells have address in array all the cells are in continuous memory
allocation  it is in cpp.
	in JAVA it is different there is no concept of pointers so we dont get the address or anything it totally depends on JVM whether it is going to be continuous or not.
	1-array objects are in heap all the other objects are created in heap
	2- heap objects are not continuous in JLS we know that. 
	3-creating memory assigning it happens at run time called dma.
	heap area are not continuous we know that array objects are also in heap area so it may not be continuous - it totally depends upon JVM(heap stack memory related to jvm)
// INDEXES IN ARRAY ->>>>


import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		

        int[] rollnos = {2,3,4,2,1,23,33};//initialise
        System.out.println(rollnos[0]);//2
        rollnos[0]= 99;
        System.out.println(rollnos[0]);//99
	}
}

	//new is used to create an object in heap memory happens in dynamic memory allocation at run time
	
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		

        int[] rollnos = new int[3];
        System.out.println(rollnos[0]);// by default it display value 0
       
	}
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) 
	{
		
  String[] var = new String[4];
  System.out.println(var[0]);//null
       
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
