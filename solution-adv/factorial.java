
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class factorial {
	public static void main (String[] args) {
	    Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t!=0)
		{
	    	int n=obj.nextInt();
	    	BigInteger fact=new BigInteger("1");
	    	while(n>0)
	    	{
	        	fact=fact.multiply(BigInteger.valueOf(n));	       
	        	n--;
	    	}
	    System.out.println(fact);
	    t--;
	    }
	}
}