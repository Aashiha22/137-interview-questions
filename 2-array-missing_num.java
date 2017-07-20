import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int index=0;index<testcase;index++)
		{
		    int x1=0,x2=0,x3=0;
		    int range = scan.nextInt();
		    int[] arr = new int[range-1];
		    for(int i=0;i<range-1;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    for(int j=1;j<=range;j++)  
		    {
		        x1 = x1 ^ j;
		    }
		    for(int k = 0;k<arr.length;k++)
		    {
		        x2 = x2 ^ arr[k];
		    }
		    x3 = x1 ^ x2;
		    System.out.println(x3);
		}
	}
}
