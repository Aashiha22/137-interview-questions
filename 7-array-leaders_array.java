//Leaders in array
//O(n) time complexity

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    public static void find_leader(int[] arr, List<Integer> leader_list)
    {
        int leader = arr[arr.length-1];
        leader_list.add(leader);
        for(int i = arr.length-2;i>=0;i--)
        {
            if(arr[i] > leader)
            {
                leader = arr[i];
                leader_list.add(leader);
            }
        }
    }
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0;i<num;i++)
		{
		    int len = scan.nextInt();
		    int[] arr = new int[len];
		    for(int j=0;j<len;j++)
		    {
		        arr[j] = scan.nextInt();
		    }
		    List<Integer> leader_list = new ArrayList<Integer>();
		    find_leader(arr, leader_list);
		    Collections.reverse(leader_list);
		    Iterator itr = leader_list.iterator();
		    while(itr.hasNext())
		    {
		        System.out.print((int)itr.next()+" ");
		    }
		    System.out.println("");
		}
	}
}
