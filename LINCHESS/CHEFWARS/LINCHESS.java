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
		        int n=s.nextInt();
		        int k=s.nextInt();
		        int arr[]=new int[n];
		        for(int i=0;i<n;i++){
		            arr[i]=s.nextInt();
		        }
		        int min=Integer.MAX_VALUE;
		        int ans=-1;
		        for(int i=0;i<n;i++){
		            if(k%arr[i]==0){
		                int q=k/arr[i];
		                if(q<min){
		                    min=q;
		                    ans=arr[i];
		                }
		                
		            }
		        }
		        System.out.println(ans);
		    }
		}catch(Exception e){
		    
		}
	}
}
