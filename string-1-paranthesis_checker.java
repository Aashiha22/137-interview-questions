//Paranthesis checker - String
//O(n) time complexity-- uses stack, space complexity O(n)
import java.io.*;
import java.util.*;

class paranthesis
{
    public static boolean paranthesis_checker(String s)
    {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='{' || ch[i]=='(' || ch[i]=='[')
            {
                st.push(new Character(ch[i]));
            }
            else if(ch[i]=='}' || ch[i]==')' || ch[i]==']')
            {
                char ch1 = (Character)st.pop();
                if(ch[i] == '}') 
                {
                    if(ch1 != '{')
                    {
                        return false;
                    }
                }
                else if(ch[i] == ')') 
                {
                    if(ch1 != '(')
                    {
                        return false;
                    }
                }
                else if(ch[i] == ']') 
                {
                    if(ch1 != '[')
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        String s = "{([(}])}";
        boolean a = paranthesis_checker(s);
        System.out.println(a);
    }
}
