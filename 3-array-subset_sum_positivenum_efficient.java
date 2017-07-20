//Subset sum given value
//Handles only positive numbers
//Efficient method - O(n)
import java.io.*;
import java.util.*;
class main
{   
    public static int[] subarray_sum(int[] arr,int sum)
    {
        int[] res = new int[2];
        int cur_sum = arr[0], start=0;
        int n = arr.length;
        for(int i=1;i<=n;i++)
        {
            while(cur_sum > sum && start<i-1)
            {
                cur_sum = cur_sum - arr[start];
                start++;
            }
            if(cur_sum == sum)
            {
                int p = i-1;
                res[0] = start;
                res[1] = p;
                return res;
            }
            if(i<n)
            {
                cur_sum = cur_sum + arr[i];
            }
        }
        System.out.println("No result found");
        return res;
    }
    public static void main(String args[])
    {
        int[] arr = {1, 2, 3, 7,5};
        int sum = 12;
        int[] arr2 = subarray_sum(arr,sum);
        System.out.println(arr2[0]+1);
        System.out.println(arr2[1]+1);
    }
}
