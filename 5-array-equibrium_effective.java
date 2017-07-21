//Equibrium point 
//Efficient algorithm - O(n)
class main
{
    public static int equibrium_index(int[] arr)
    {
        int n = arr.length;
        int left_sum = 0, right_sum = 0;
        for(int j=0;j<n;j++)
        {
            right_sum = right_sum + arr[j];
        }
        for(int i=0;i<n;i++)
        {
            right_sum = right_sum - arr[i];
            if(left_sum == right_sum)
            {
                return i;
            }
            left_sum = left_sum + arr[i];
        }
        System.out.println("Not found");
        return 0;
    }
    public static void main(String args[])
    {
        int[] arr = {1,2,2,0,3,4,1};
        int i = equibrium_index(arr);
        System.out.println("Equibrium index : "+i);
    }
}
