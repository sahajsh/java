
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));

	}
    static boolean isArmstrong(int n){
        int original =n;
        int sum =0;
        while(n>0){
            int rem =n%10;
            sum = sum+ (rem*rem*rem);
            n =n/10;
        }
        return sum == original;
    }
}

//153 input 
true output 

DISPLAY ARMSTRONG NO. BTW TWO INTERVALS->
	
import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        armstrong(a,b);


    }
    static void armstrong(int a, int b){
        for(int i=a;i<=b;i++){
            int sum =0;
            int n =i;
            while(n!=0){
                int rem = n%10;
                sum =sum +rem *rem *rem;
                n =n/10;
            }
        
            if(sum == i){
                System.out.println( i);
            }
        }

        
    }



}
