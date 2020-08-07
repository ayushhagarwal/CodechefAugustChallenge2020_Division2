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
		        int h=s.nextInt();
		        int p=s.nextInt();
		        int flag=0;
		        while(p>0){
		            h=h-p;
		            if(h<=0){
		                flag=1;
		            }
		            p=p/2;
		        }
		        if(flag==0){
		            System.out.println("0");
		        }else{
		            System.out.println("1");
		        }
		    }
		}catch(Exception e){
		    
		}
	}
}
