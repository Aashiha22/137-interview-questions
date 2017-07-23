//Permutations of String -> backtracking O(n2)

import java.util.*;
import java.util.Arrays;
import java.lang.*;
import java.io.*;
import java.util.Collections;

class GFG 
{
    public static void string_permutations(String s, int left, int right, List<String> str_list)
    {
        if(left == right)
        {
            str_list.add(s);
        }
        else
        {
            for(int i=left;i<=right;i++)
            {
                s = swap(s,left,i);
                string_permutations(s,left+1,right,str_list);
                s = swap(s,left,i);
            }
        }
    }
    public static String swap(String s, int l, int r)
    {
        char[] ch = s.toCharArray();
        char temp = ch[l];
        ch[l] = ch[r];
        ch[r] = temp;
        String s1 = String.valueOf(ch);
        return s1;
    }
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0;i<num;i++)
		{
		    String s = scan.next();
		    List<String> str_list = new ArrayList<String>(); //initialize string array with dynamic size
		    string_permutations(s,0,s.length()-1,str_list);
		    Collections.sort(str_list);
		    Iterator<String> iter = str_list.iterator();
		    while(iter.hasNext())
		    {
		        System.out.print((String)iter.next()+" ");
		    }
		    System.out.println("");
		}
	}
}
