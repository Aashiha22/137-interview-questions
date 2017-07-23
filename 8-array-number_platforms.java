//Number of platforms
//Uses merge sort - O(nlogn)

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Arrays;

class Node
{
    int time;
    char type;
    public Node(int time, char type)
    {
        this.time = time;
        this.type = type;
    }
}
class GFG 
{
    public static int check_platforms(int[] ar_list, int[] dep_list)
    {
        int i=0,j=0,res=0,max=1;
        int n = ar_list.length;
        while(i<n && j<n)
        {
            if(ar_list[i] < dep_list[j])
            {
                res++;
                i++;
            }
            else
            {
                res--;
                j++;
            }
            if(res>max)
            { 
                max = res;
            }
        }
        return max;
    }
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0;i<num;i++)
		{
		    int num_train = scan.nextInt();
		    int[] arrival_list = new int[num_train];
		    int[] departure_list = new int[num_train];
		    for(int j=0;j<num_train;j++)
		    {
		        arrival_list[j] = scan.nextInt();
		    }
		    for(int k=0;k<num_train;k++)
		    {
		        departure_list[k] = scan.nextInt();
		    }
		    int ans = check_platforms(arrival_list, departure_list);
		    System.out.println(ans);
		}
	}
}
