//Sort array of 0,1,2 - Dutch national flag algorithm  --> O(n)

import java.io.*;
import java.util.*;
class dutch_flag
{
    public static int[] sort_dutch_flag(int[] arr)
    {
        int n = arr.length;
        int low=0,mid=0,high=n-1;
        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else if(arr[mid] == 2)
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        for(int i=0;i<testcase;i++)
        {
            int length = scan.nextInt();
            int arr[] = new int[length];
            for(int j=0;j<length;j++)
            {
                arr[j] = scan.nextInt();
            }
            arr = sort_dutch_flag(arr);
            for(int k=0;k<arr.length;k++)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.println("");
        }
    }
}
