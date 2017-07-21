//Equibrium point - return index
//Brute force algorithm - O(n2)
class main
{
    public static int equibrium_index(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)  //i as the equibrium Index
        {
            int left_sum=0, right_sum=0;
            for(int j=0;j<i;j++)
            {
                left_sum = left_sum + arr[j];
            }
            for(int j=i+1;j<n;j++)
            {
                right_sum = right_sum + arr[j];
            }
            if(left_sum == right_sum)
            {
                return i;
            }
        }
        System.out.println("No equibrium index found");
        return 0;
    }
    public static void main(String args[])
    {
        int[] arr = {1,2,2,3,4,1};
        int i = equibrium_index(arr);
        System.out.println("Equibrium index : "+i);
    }
}
