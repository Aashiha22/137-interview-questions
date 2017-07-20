//Subset sum given value
//Handles only positive numbers
//Inefficient brute force method - O(n2)
import java.io.*;
import java.util.*;
class main
{   
    public static int[] subarray_sum(int[] arr,int sum)
    {
        int[] res = new int[2];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int cur_sum = arr[i];
            for(int j=i+1;j<=n;j++)
            {
                if(cur_sum == sum)
                {
                    int p =  j-1;
                    res[0] = i;
                    res[1] = p;
                    return res;
                }
                if(cur_sum > sum || j==n)
                {
                    break;
                }
                cur_sum = cur_sum + arr[j];
            }
        }
        System.out.println("No result found");
        return res;
    }
    public static void main(String args[])
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 15;
        int[] arr2 = subarray_sum(arr,sum);
        System.out.println(arr2[0]+1);
        System.out.println(arr2[1]+1);
    }
}
