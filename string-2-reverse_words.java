//reverse words in sentence
//O(n) -- split words and add them to new string
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    public static String reverse_string(String s)
    {
        if(s.length() == 0)
        {
            return s;
        }
        String[] str = s.split("\\.");
        String s1 = "";
        for(int i=str.length-1;i>0;i--)
        {
            s1 = s1 + str[i];
            s1 = s1 + ".";
        }
        s1 = s1 + str[0];
        return s1;
    }
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0;i<num;i++)
		{
		    String s = scan.next();
		    String s1 = reverse_string(s);
		    System.out.println(s1);
		}
	}
}
