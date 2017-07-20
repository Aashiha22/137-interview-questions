import java.util.*;
import java.io.*;
class main
{
    public static int kadane_algorithm(int[] arr)
    {
        int max_curr = 0, max_sum=Integer.MIN_VALUE;
        int start_index=0,stop_index=0;
        for(int i=0;i<arr.length;i++)
        {
            max_curr = max_curr + arr[i];
            if(max_curr < 0)
            {
                max_curr = 0;
            }
            if(arr[i] >= max_curr)
            {
                start_index = i;
                stop_index = i;
            }
            if(max_curr > max_sum)
            {
                max_sum = max_curr;
                stop_index = i;
            }
        }
        for(int j=start_index;j<=stop_index;j++)
        {
            System.out.println(arr[j]);
        }
        return max_sum;
    }
    public static void main(String args[])
    {
        int[] arr = {-2, -3, 4, -1, -2, 1, -5, -8};
        int sum = kadane_algorithm(arr);
        System.out.println("SUM : "+sum);
    }
}
