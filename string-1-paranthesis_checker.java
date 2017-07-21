//Paranthesis checker - String
//O(n) time complexity-- uses stack, space complexity O(n)
import java.io.*;
import java.util.*;

class main
{
    public static boolean paranthesis_checker(String s)
    {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
            {
                st.push(new Character(ch[i]));
            }
            else if(ch[i] == '}' || ch[i] == ')' || ch[i] == ']')
            {
                char ch1 = ' ';
                if(st.isEmpty() != true)
                    ch1 = (Character)st.pop();
                else
                    return false;
                if(ch[i] == '}')
                {
                    if(ch1 != '{')
                    {
                        return false;
                    }
                }
                if(ch[i] == ')')
                {
                    if(ch1 != '(')
                    {
                        return false;
                    }
                }
                if(ch[i] == ']')
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
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0;i<num;i++)
        {
            String s = scan.next();
            //System.out.println(s);
            if(s.length()==0)
            {
                System.out.println("balanced");   
            }
            boolean a = paranthesis_checker(s);
            if(a == true)
            {
                System.out.println("balanced");
            }
            else
            {
                System.out.println("not balanced");
            }
        }
    }
}
