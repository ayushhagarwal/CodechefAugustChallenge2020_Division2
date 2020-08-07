/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner s=new Scanner(System.in);
		    int t=s.nextInt();
		    while(t-->0){
		        int a=s.nextInt();
		        int b=s.nextInt();
		        int counta=0;
		        int countb=0;
		        if(a%9==0){
		            counta+=a/9;
		        }else{
		            counta+=a/9+1;
		        }
		        if(b%9==0){
		            countb+=b/9;
		        }else{
		            countb+=b/9+1;
		        }
		        if(counta==countb){
		            System.out.println("1 "+countb);
		        }else if(counta>countb){
		            System.out.println("1 "+countb);
		        }else{
		            System.out.println("0 "+counta);
		        }
		    }
		}
		catch(Exception e){
		    
		}
	}
}
